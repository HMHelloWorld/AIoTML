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
package org.aiotml.compilers.thing.common;

import org.aiotml.compilers.Context;
import org.aiotml.compilers.thing.ThingActionCompiler;
import org.aiotml.xtext.ByteValueConverter;
import org.aiotml.xtext.CharValueConverter;
import org.aiotml.xtext.StringValueConverter;
import org.aiotml.xtext.constraints.AiotMLHelpers;
import org.aiotml.xtext.helpers.AiotMLElementHelper;
import org.aiotml.xtext.aiotML.Action;
import org.aiotml.xtext.aiotML.ActionBlock;
import org.aiotml.xtext.aiotML.AndExpression;
import org.aiotml.xtext.aiotML.ArrayIndex;
import org.aiotml.xtext.aiotML.BooleanLiteral;
import org.aiotml.xtext.aiotML.ByteLiteral;
import org.aiotml.xtext.aiotML.CastExpression;
import org.aiotml.xtext.aiotML.CharLiteral;
import org.aiotml.xtext.aiotML.ConditionalAction;
import org.aiotml.xtext.aiotML.Decrement;
import org.aiotml.xtext.aiotML.DivExpression;
import org.aiotml.xtext.aiotML.DoubleLiteral;
import org.aiotml.xtext.aiotML.EqualsExpression;
import org.aiotml.xtext.aiotML.Expression;
import org.aiotml.xtext.aiotML.ExpressionGroup;
import org.aiotml.xtext.aiotML.ExternExpression;
import org.aiotml.xtext.aiotML.ExternStatement;
import org.aiotml.xtext.aiotML.Function;
import org.aiotml.xtext.aiotML.GreaterExpression;
import org.aiotml.xtext.aiotML.GreaterOrEqualExpression;
import org.aiotml.xtext.aiotML.Increment;
import org.aiotml.xtext.aiotML.IntegerLiteral;
import org.aiotml.xtext.aiotML.LoopAction;
import org.aiotml.xtext.aiotML.LowerExpression;
import org.aiotml.xtext.aiotML.LowerOrEqualExpression;
import org.aiotml.xtext.aiotML.MinusExpression;
import org.aiotml.xtext.aiotML.ModExpression;
import org.aiotml.xtext.aiotML.NotEqualsExpression;
import org.aiotml.xtext.aiotML.NotExpression;
import org.aiotml.xtext.aiotML.OrExpression;
import org.aiotml.xtext.aiotML.PlusExpression;
import org.aiotml.xtext.aiotML.PropertyReference;
import org.aiotml.xtext.aiotML.ReturnAction;
import org.aiotml.xtext.aiotML.StringLiteral;
import org.aiotml.xtext.aiotML.Thing;
import org.aiotml.xtext.aiotML.TimesExpression;
import org.aiotml.xtext.aiotML.Type;
import org.aiotml.xtext.aiotML.UnaryMinus;
import org.aiotml.xtext.aiotML.VariableAssignment;

/**
 * Created by bmori on 01.12.2014.
 */
public class CommonThingActionCompiler extends ThingActionCompiler {

    //AiotML actions that can be compiled the same way for any imperative language like (Java, JS, C)

    @Override
    public void generate(VariableAssignment action, StringBuilder builder, Context ctx) {
        if (action.getProperty().getTypeRef().getCardinality() != null && action.getIndex() != null) {//this is an array (and we want to affect just one index)
                builder.append(AiotMLElementHelper.qname(action.getProperty(), "_") + "_var");
                StringBuilder tempBuilder = new StringBuilder();
                generate(action.getIndex(), tempBuilder, ctx);
                builder.append("[" + tempBuilder.toString() + "]");
                builder.append(" = ");
                cast(action.getProperty().getTypeRef().getType(), false, action.getExpression(), builder, ctx);
                //generateMainAndInit(action.getExpression(), builder, ctx);
                builder.append(";\n");
        } else {//simple variable or we re-affect the whole array
            if (action.getProperty().eContainer() instanceof Thing) {
                builder.append(ctx.getContextAnnotation("thisRef"));
            }
            builder.append(AiotMLElementHelper.qname(action.getProperty(), "_") + "_var");
            builder.append(" = ");
            cast(action.getProperty().getTypeRef().getType(), action.getProperty().getTypeRef().isIsArray(), action.getExpression(), builder, ctx);
            //generateMainAndInit(action.getExpression(), builder, ctx);
            builder.append(";\n");
        }
    }

    public void cast(Type type, boolean isArray, Expression exp, StringBuilder builder, Context ctx) {
        generate(exp, builder, ctx);
    }

    @Override
    public void generate(ActionBlock action, StringBuilder builder, Context ctx) {
        for (Action a : action.getActions()) {
            generate(a, builder, ctx);
        }
    }

    @Override
    public void generate(ExternStatement action, StringBuilder builder, Context ctx) {
        builder.append(action.getStatement());
        for (Expression e : action.getSegments()) {
            generate(e, builder, ctx);
        }
        builder.append("\n");
    }

    @Override
    public void generate(ConditionalAction action, StringBuilder builder, Context ctx) {
        builder.append("if(");
        generate(action.getCondition(), builder, ctx);
        builder.append(") {\n");
        generate(action.getAction(), builder, ctx);
        builder.append("\n}");
        if (action.getElseAction() != null) {
            builder.append(" else {\n");
            generate(action.getElseAction(), builder, ctx);
            builder.append("\n}");
        }
        builder.append("\n");
    }

    @Override
    public void generate(LoopAction action, StringBuilder builder, Context ctx) {
        builder.append("while(");
        generate(action.getCondition(), builder, ctx);
        builder.append(") {\n");
        generate(action.getAction(), builder, ctx);
        builder.append("\n}\n");
    }

    @Override
    public void generate(ReturnAction action, StringBuilder builder, Context ctx) {
        builder.append("return");
        if (action.getExp() != null) {
        	builder.append(" ");
	        Function parent = AiotMLHelpers.findContainingFunction(action);
	        boolean isArray = false;
	        if (action.getExp() instanceof PropertyReference) {
	            PropertyReference pr = (PropertyReference) action.getExp();
	            isArray = pr.getProperty().getTypeRef().isIsArray() || pr.getProperty().getTypeRef().getCardinality() != null;
	        }
	        cast(parent.getTypeRef().getType(), isArray, action.getExp(), builder, ctx);
        }
        builder.append(";\n");
    }

    @Override
    public void generate(Increment action, StringBuilder builder, Context ctx) {
    	builder.append(ctx.getVariableName(action.getVar()));
        builder.append("++;\n");
    }

    @Override
    public void generate(Decrement action, StringBuilder builder, Context ctx) {
    	builder.append(ctx.getVariableName(action.getVar()));
        builder.append("--;\n");
    }


    //AiotML expressions that can be compiled the same way for any imperative language like (Java, JS, C)

    @Override
    public void generate(ArrayIndex expression, StringBuilder builder, Context ctx) {
        generate(expression.getArray(), builder, ctx);
        builder.append("[");
        generate(expression.getIndex(), builder, ctx);
        builder.append("]\n");
    }

    @Override
    public void generate(OrExpression expression, StringBuilder builder, Context ctx) {
        generate(expression.getLhs(), builder, ctx);
        builder.append(" || ");
        generate(expression.getRhs(), builder, ctx);
    }

    @Override
    public void generate(AndExpression expression, StringBuilder builder, Context ctx) {
        generate(expression.getLhs(), builder, ctx);
        builder.append(" && ");
        generate(expression.getRhs(), builder, ctx);
    }

    @Override
    public void generate(LowerExpression expression, StringBuilder builder, Context ctx) {
        generate(expression.getLhs(), builder, ctx);
        builder.append(" < ");
        generate(expression.getRhs(), builder, ctx);
    }

    @Override
    public void generate(GreaterExpression expression, StringBuilder builder, Context ctx) {
        generate(expression.getLhs(), builder, ctx);
        builder.append(" > ");
        generate(expression.getRhs(), builder, ctx);
    }

    @Override
    public void generate(LowerOrEqualExpression expression, StringBuilder builder, Context ctx) {
        generate(expression.getLhs(), builder, ctx);
        builder.append(" <= ");
        generate(expression.getRhs(), builder, ctx);
    }

    @Override
    public void generate(GreaterOrEqualExpression expression, StringBuilder builder, Context ctx) {
        generate(expression.getLhs(), builder, ctx);
        builder.append(" >= ");
        generate(expression.getRhs(), builder, ctx);
    }

    @Override
    public void generate(EqualsExpression expression, StringBuilder builder, Context ctx) {
        generate(expression.getLhs(), builder, ctx);
        builder.append(" == ");
        generate(expression.getRhs(), builder, ctx);
    }

    @Override
    public void generate(NotEqualsExpression expression, StringBuilder builder, Context ctx) {
        generate(expression.getLhs(), builder, ctx);
        builder.append(" != ");
        generate(expression.getRhs(), builder, ctx);
    }

    @Override
    public void generate(PlusExpression expression, StringBuilder builder, Context ctx) {
        generate(expression.getLhs(), builder, ctx);
        builder.append(" + ");
        generate(expression.getRhs(), builder, ctx);
    }

    @Override
    public void generate(MinusExpression expression, StringBuilder builder, Context ctx) {
        generate(expression.getLhs(), builder, ctx);
        builder.append(" - ");
        generate(expression.getRhs(), builder, ctx);
    }

    @Override
    public void generate(TimesExpression expression, StringBuilder builder, Context ctx) {
        generate(expression.getLhs(), builder, ctx);
        builder.append(" * ");
        generate(expression.getRhs(), builder, ctx);
    }

    @Override
    public void generate(DivExpression expression, StringBuilder builder, Context ctx) {
        generate(expression.getLhs(), builder, ctx);
        builder.append(" / ");
        generate(expression.getRhs(), builder, ctx);
    }

    @Override
    public void generate(ModExpression expression, StringBuilder builder, Context ctx) {
        generate(expression.getLhs(), builder, ctx);
        builder.append(" % ");
        generate(expression.getRhs(), builder, ctx);
    }

    @Override
    public void generate(UnaryMinus expression, StringBuilder builder, Context ctx) {
        builder.append(" -");
        generate(expression.getTerm(), builder, ctx);
    }

    @Override
    public void generate(NotExpression expression, StringBuilder builder, Context ctx) {
        builder.append(" !(");
        generate(expression.getTerm(), builder, ctx);
        builder.append(")");
    }
    
    @Override
    public void generate(ExpressionGroup expression, StringBuilder builder, Context ctx) {
        builder.append("(");
        generate(expression.getTerm(), builder, ctx);
        builder.append(")");
    }
    
    @Override
    public void generate(ByteLiteral expression, StringBuilder builder, Context ctx) {
    	builder.append(ByteValueConverter.ToString(expression.getByteValue()));
    }
    
    @Override
    public void generate(CharLiteral expression, StringBuilder builder, Context ctx) {
    	builder.append(CharValueConverter.ToString(expression.getCharValue()));
    }

    @Override
    public void generate(IntegerLiteral expression, StringBuilder builder, Context ctx) {
        builder.append(expression.getIntValue());
    }

    @Override
    public void generate(DoubleLiteral expression, StringBuilder builder, Context ctx) {
        builder.append(expression.getDoubleValue());
    }

    @Override
    public void generate(StringLiteral expression, StringBuilder builder, Context ctx) {
    	builder.append(StringValueConverter.ToString(expression.getStringValue()));
    }

    @Override
    public void generate(BooleanLiteral expression, StringBuilder builder, Context ctx) {
        builder.append(Boolean.toString(expression.isBoolValue()));    	
    }

    @Override
    public void generate(ExternExpression expression, StringBuilder builder, Context ctx) {
        builder.append(expression.getExpression());
        for (Expression e : expression.getSegments()) {
            generate(e, builder, ctx);
        }
    }

    public void generate(CastExpression expression, StringBuilder builder, Context ctx) {
        //We do not cast explicitly in the generated code. Should a cast be needed, it has to be done in an extern expression
    	//FIXME: Shouldn't we really do that?
    	generate(expression.getTerm(), builder, ctx);
    }
}
