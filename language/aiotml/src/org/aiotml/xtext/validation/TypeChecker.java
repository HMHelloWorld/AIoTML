/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 */
/**
 * Licensed under the GNU LESSER GENERAL PUBLIC LICENSE, Version 3, 29 June 2007;
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.gnu.org/licenses/lgpl-3.0.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.aiotml.xtext.validation;


import org.aiotml.xtext.constraints.Types;
import org.aiotml.xtext.helpers.TyperHelper;
import org.aiotml.xtext.aiotML.AndExpression;
import org.aiotml.xtext.aiotML.ArrayIndex;
import org.aiotml.xtext.aiotML.BooleanLiteral;
import org.aiotml.xtext.aiotML.ByteLiteral;
import org.aiotml.xtext.aiotML.CastExpression;
import org.aiotml.xtext.aiotML.CharLiteral;
import org.aiotml.xtext.aiotML.DivExpression;
import org.aiotml.xtext.aiotML.DoubleLiteral;
import org.aiotml.xtext.aiotML.EnumLiteralRef;
import org.aiotml.xtext.aiotML.EqualsExpression;
import org.aiotml.xtext.aiotML.EventReference;
import org.aiotml.xtext.aiotML.Expression;
import org.aiotml.xtext.aiotML.ExpressionGroup;
import org.aiotml.xtext.aiotML.ExternExpression;
import org.aiotml.xtext.aiotML.FunctionCallExpression;
import org.aiotml.xtext.aiotML.GreaterExpression;
import org.aiotml.xtext.aiotML.GreaterOrEqualExpression;
import org.aiotml.xtext.aiotML.IntegerLiteral;
import org.aiotml.xtext.aiotML.LowerExpression;
import org.aiotml.xtext.aiotML.LowerOrEqualExpression;
import org.aiotml.xtext.aiotML.MinusExpression;
import org.aiotml.xtext.aiotML.ModExpression;
import org.aiotml.xtext.aiotML.NotEqualsExpression;
import org.aiotml.xtext.aiotML.NotExpression;
import org.aiotml.xtext.aiotML.OrExpression;
import org.aiotml.xtext.aiotML.PlusExpression;
import org.aiotml.xtext.aiotML.PropertyReference;
import org.aiotml.xtext.aiotML.StringLiteral;
import org.aiotml.xtext.aiotML.TimesExpression;
import org.aiotml.xtext.aiotML.Type;
import org.aiotml.xtext.aiotML.UnaryMinus;
import org.aiotml.xtext.aiotML.util.AiotMLSwitch;


public class TypeChecker extends AiotMLSwitch<Type> {
	
	public static TypeChecker INSTANCE = new TypeChecker();
	
    public static Type computeTypeOf(Expression exp) {
        Type result = null;
        if (exp == null) {
            return Types.ANY_TYPE;
        }
        result = INSTANCE.doSwitch(exp);
        if (result == null) {
            System.out.println("TODO: Type checking for " + exp.getClass().getName());
            return Types.ANY_TYPE;
        }
        return result;
    }
    
    @Override
	public Type caseExpressionGroup(ExpressionGroup object) {
        return TyperHelper.getBroadType(computeTypeOf(object.getTerm()));
	}

      
    @Override
	public Type caseCastExpression(CastExpression object) {
        return TyperHelper.getBroadType(object.getType());
	}

	@Override
    public Type caseExternExpression(ExternExpression object) {
        return Types.ANY_TYPE;
    }
	
	@Override
	public Type caseByteLiteral(ByteLiteral object) {
		return Types.BYTE_TYPE;
	}
	
	@Override
	public Type caseCharLiteral(CharLiteral object) {
		return Types.BYTE_TYPE;
	}

    @Override
    public Type caseIntegerLiteral(IntegerLiteral object) {
        return Types.INTEGER_TYPE;
    }

    @Override
    public Type caseBooleanLiteral(BooleanLiteral object) {
        return Types.BOOLEAN_TYPE;
    }

    @Override
    public Type caseStringLiteral(StringLiteral object) {
        return Types.STRING_TYPE;
    }

    @Override
    public Type caseDoubleLiteral(DoubleLiteral object) {
        return Types.REAL_TYPE;
    }

    @Override
    public Type caseUnaryMinus(UnaryMinus object) {
        Type t = computeTypeOf(object.getTerm());
        if (t.equals(Types.ANY_TYPE))
            return Types.ANY_TYPE;
        if (!t.equals(Types.BYTE_TYPE) && !t.equals(Types.INTEGER_TYPE) && !t.equals(Types.REAL_TYPE)) {
            return Types.ERROR_TYPE;
        }
        return t;
    }

    private Type caseBinaryNumericalOperator(Type t1, Type t2) {
    	//TODO: BYTE_TYPE
        if (t1.equals(Types.ANY_TYPE) || t2.equals(Types.ANY_TYPE))
            return Types.ANY_TYPE;
        if ((!t1.equals(Types.INTEGER_TYPE) && !t1.equals(Types.REAL_TYPE)) || (!t2.equals(Types.INTEGER_TYPE) && !t2.equals(Types.REAL_TYPE))) {
            return Types.ERROR_TYPE;
        }
        if (!TyperHelper.getBroadType(t1).getName().equals(TyperHelper.getBroadType(t2).getName())) //One Integer and one Real
            return Types.REAL_TYPE;
        return t1;
    }

    @Override
    public Type casePlusExpression(PlusExpression object) {
        Type t1 = computeTypeOf(object.getLhs());
        Type t2 = computeTypeOf(object.getRhs());
        //This is to support string concatenation with +, which is somehow supported in AiotML, at least in Java and JS...
        //TODO: Decide if we should use + or a dedicated concatenation operator like ..
        if (t1.equals(Types.STRING_TYPE) && !t2.equals(Types.ERROR_TYPE) || t2.equals(Types.STRING_TYPE) && !t2.equals(Types.ERROR_TYPE)) {
        	return Types.STRING_TYPE;
        }
        return caseBinaryNumericalOperator(t1, t2);
    }

    @Override
    public Type caseMinusExpression(MinusExpression object) {
        Type t1 = computeTypeOf(object.getLhs());
        Type t2 = computeTypeOf(object.getRhs());
        return caseBinaryNumericalOperator(t1, t2);
    }

    @Override
    public Type caseTimesExpression(TimesExpression object) {
        Type t1 = computeTypeOf(object.getLhs());
        Type t2 = computeTypeOf(object.getRhs());
        return caseBinaryNumericalOperator(t1, t2);
    }

    @Override
    public Type caseDivExpression(DivExpression object) {
        Type t1 = computeTypeOf(object.getLhs());
        Type t2 = computeTypeOf(object.getRhs());
        return caseBinaryNumericalOperator(t1, t2);
    }

    @Override
    public Type caseModExpression(ModExpression object) {
        Type t1 = computeTypeOf(object.getLhs());
        Type t2 = computeTypeOf(object.getRhs());
        //TODO: BYTE_TYPE
        if (t1.equals(Types.INTEGER_TYPE) && t2.equals(Types.INTEGER_TYPE))
            return Types.INTEGER_TYPE;
        if (TyperHelper.isA(t1, Types.INTEGER_TYPE) && TyperHelper.isA(t2, Types.INTEGER_TYPE))
            return Types.ANY_TYPE;
        return Types.ERROR_TYPE;
    }

    private Type caseComparison(Type t1, Type t2) {
    	if (TyperHelper.isA(t1, t2) || TyperHelper.isA(t2, t1))
    		return Types.BOOLEAN_TYPE;
    	return Types.ERROR_TYPE;
    }

    @Override
    public Type caseEqualsExpression(EqualsExpression object) {
        Type t1 = computeTypeOf(object.getLhs());
        Type t2 = computeTypeOf(object.getRhs());
        return caseComparison(t1, t2);
    }
    
    @Override
    public Type caseNotEqualsExpression(NotEqualsExpression object) {
        Type t1 = computeTypeOf(object.getLhs());
        Type t2 = computeTypeOf(object.getRhs());
        return caseComparison(t1, t2);
    }    

    @Override
    public Type caseGreaterExpression(GreaterExpression object) {
        Type t1 = computeTypeOf(object.getLhs());
        Type t2 = computeTypeOf(object.getRhs());
        return caseComparison(t1, t2);
    }

    @Override
    public Type caseGreaterOrEqualExpression(GreaterOrEqualExpression object) {
        Type t1 = computeTypeOf(object.getLhs());
        Type t2 = computeTypeOf(object.getRhs());
        return caseComparison(t1, t2);
    }

    @Override
    public Type caseLowerExpression(LowerExpression object) {
        Type t1 = computeTypeOf(object.getLhs());
        Type t2 = computeTypeOf(object.getRhs());
        return caseComparison(t1, t2);
    }

    @Override
    public Type caseLowerOrEqualExpression(LowerOrEqualExpression object) {
        Type t1 = computeTypeOf(object.getLhs());
        Type t2 = computeTypeOf(object.getRhs());
        return caseComparison(t1, t2);
    }

    //Boolean
    private Type caseBooleanOperator(Type t1, Type t2) {
    	if (t1.equals(Types.BOOLEAN_TYPE) && t2.equals(Types.BOOLEAN_TYPE))
    		return Types.BOOLEAN_TYPE;
    	if (TyperHelper.isA(t1, Types.BOOLEAN_TYPE) && TyperHelper.isA(t2, Types.BOOLEAN_TYPE))    	
            return Types.ANY_TYPE;        
        return Types.ERROR_TYPE;        
    }

    @Override
    public Type caseAndExpression(AndExpression object) {
        Type t1 = computeTypeOf(object.getLhs());
        Type t2 = computeTypeOf(object.getRhs());
        return caseBooleanOperator(t1, t2);
    }

    @Override
    public Type caseOrExpression(OrExpression object) {
        Type t1 = computeTypeOf(object.getLhs());
        Type t2 = computeTypeOf(object.getRhs());
        return caseBooleanOperator(t1, t2);
    }

    @Override
    public Type caseNotExpression(NotExpression object) {
        Type t = computeTypeOf(object.getTerm());
        if (t.equals(Types.BOOLEAN_TYPE))
            return Types.BOOLEAN_TYPE;        
        if (TyperHelper.isA(t, Types.BOOLEAN_TYPE))
            return Types.ANY_TYPE;        
        return Types.ERROR_TYPE;
    }
    //End Boolean

    @Override
    public Type casePropertyReference(PropertyReference object) {
        return TyperHelper.getBroadType(object.getProperty().getTypeRef().getType());
    }
    
    
    @Override
	public Type caseEventReference(EventReference object) {
    	return TyperHelper.getBroadType(object.getParameter().getTypeRef().getType());
	}
    
    @Override
	public Type caseEnumLiteralRef(EnumLiteralRef object) {
    	//return TyperHelper.getBroadType(object.getEnum());
    	return object.getEnum();
	}    

    @Override
    public Type caseFunctionCallExpression(FunctionCallExpression object) {
        if (object.getFunction().getTypeRef() == null || object.getFunction().getTypeRef().getType() == null)
            return Types.VOID_TYPE;
        return TyperHelper.getBroadType(object.getFunction().getTypeRef().getType());
    }

    @Override
    public Type caseArrayIndex(ArrayIndex object) {
        Type t = computeTypeOf(object.getIndex());
        if (TyperHelper.isA(t, Types.INTEGER_TYPE))
            return computeTypeOf(object.getArray());
        return Types.ERROR_TYPE;
    }
}
