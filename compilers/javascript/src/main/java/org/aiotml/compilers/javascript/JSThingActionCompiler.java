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
package org.aiotml.compilers.javascript;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.aiotml.compilers.Context;
import org.aiotml.compilers.thing.common.CommonThingActionCompiler;
import org.aiotml.xtext.constraints.AiotMLHelpers;
import org.aiotml.xtext.constraints.Types;
import org.aiotml.xtext.helpers.AnnotatedElementHelper;
import org.aiotml.xtext.helpers.ConfigurationHelper;
import org.aiotml.xtext.helpers.ThingHelper;
import org.aiotml.xtext.helpers.AiotMLElementHelper;
import org.aiotml.xtext.helpers.TyperHelper;
import org.aiotml.xtext.aiotML.ArrayInit;
import org.aiotml.xtext.aiotML.ConfigPropertyAssign;
import org.aiotml.xtext.aiotML.Decrement;
import org.aiotml.xtext.aiotML.DivExpression;
import org.aiotml.xtext.aiotML.EnumLiteralRef;
import org.aiotml.xtext.aiotML.EqualsExpression;
import org.aiotml.xtext.aiotML.ErrorAction;
import org.aiotml.xtext.aiotML.EventReference;
import org.aiotml.xtext.aiotML.Expression;
import org.aiotml.xtext.aiotML.ExternalConnector;
import org.aiotml.xtext.aiotML.ForAction;
import org.aiotml.xtext.aiotML.FunctionCallExpression;
import org.aiotml.xtext.aiotML.FunctionCallStatement;
import org.aiotml.xtext.aiotML.Increment;
import org.aiotml.xtext.aiotML.LocalVariable;
import org.aiotml.xtext.aiotML.Parameter;
import org.aiotml.xtext.aiotML.PrintAction;
import org.aiotml.xtext.aiotML.Property;
import org.aiotml.xtext.aiotML.Cproperty;
import org.aiotml.xtext.aiotML.SubThing;
import org.aiotml.xtext.aiotML.PropertyReference;
import org.aiotml.xtext.aiotML.ReceiveMessage;
import org.aiotml.xtext.aiotML.SendAction;
import org.aiotml.xtext.aiotML.Session;
import org.aiotml.xtext.aiotML.StartSession;
import org.aiotml.xtext.aiotML.StringLiteral;
import org.aiotml.xtext.aiotML.Type;
import org.aiotml.xtext.aiotML.VariableAssignment;
import org.aiotml.xtext.aiotML.CpropertyAssignment;
import org.aiotml.xtext.validation.TypeChecker;
import org.aiotml.xtext.aiotML.Variable;
import org.aiotml.xtext.aiotML.CpropertyReference;
import org.aiotml.xtext.aiotML.IntegerLiteral;

/**
 * Created by bmori on 01.12.2014.
 */
public class JSThingActionCompiler extends CommonThingActionCompiler {

	/**
	 * JS does not really have integers, and hence no proper integer division
	 *
	 * @param expression
	 * @param builder
	 * @param ctx
	 */
	@Override
	public void generate(DivExpression expression, StringBuilder builder, Context ctx) {
		final Type lhsType = TyperHelper.getBroadType(TypeChecker.computeTypeOf(expression.getLhs()));
		if (Types.INTEGER_TYPE.equals(lhsType)) {// integer division if LHS is integer
			builder.append("Math.trunc(");
			generate(expression.getLhs(), builder, ctx);
			builder.append(" / ");
			generate(expression.getRhs(), builder, ctx);
			builder.append(")");
		} else {
			super.generate(expression, builder, ctx);
		}
	}

	@Override
	public void generate(VariableAssignment action, StringBuilder builder, Context ctx) {
		if (action.getProperty().getTypeRef().getCardinality() != null && action.getIndex() != null) {
			// this is an array (and we want to affect just one index)
				if (action.getProperty() instanceof Property) {
					builder.append(ctx.getContextAnnotation("thisRef"));
				}
				builder.append(ctx.getVariableName(action.getProperty()));
				StringBuilder tempBuilder = new StringBuilder();
				generate(action.getIndex(), tempBuilder, ctx);
				builder.append("[" + tempBuilder.toString() + "]");
				builder.append(" = ");
				cast(action.getProperty().getTypeRef().getType(), false, action.getExpression(), builder, ctx);
				builder.append(";\n");
		} else {
			// simple variable or we re-affect the whole array
			if (action.getProperty() instanceof Property) {
				builder.append(ctx.getContextAnnotation("thisRef"));
			}
			builder.append(ctx.getVariableName(action.getProperty()));
			builder.append(" = ");
			cast(action.getProperty().getTypeRef().getType(), action.getProperty().getTypeRef().isIsArray(),
					action.getExpression(), builder, ctx);
			builder.append(";\n");
		}
	}

	@Override
	public void generate(CpropertyAssignment action, StringBuilder builder, Context ctx) {
		if(action.getCpropertys() != null) {
			if (action.getCpropertys().get(0) instanceof Cproperty) {
				builder.append(ctx.getContextAnnotation("thisRef"));
			}
//			for (Variable c: action.getCproperty()) {
//				builder.append(ctx.getVariableName(c) + ".");
//			}
			
			if(action.getCpropertys().get(0).getTypeRef().getCardinality() != null && action.getCindex() != null) {
				builder.append(ctx.getVariableName(action.getCpropertys().get(0)));
				StringBuilder cTempBuilder = new StringBuilder();
				generate(action.getCindex(), cTempBuilder, ctx);
				builder.append("[" + cTempBuilder.toString() + "]");
				builder.append(".");
			} else {
				builder.append(ctx.getVariableName(action.getCpropertys().get(0)));
				builder.append(".");
			}
			
			//=============================================================================================
			if(action.getProperty().getTypeRef().getCardinality() != null && action.getPindex() != null) {
//				builder.append(ctx.getVariableName(action.getProperty()));
				builder.append(action.getProperty().getName() );
				StringBuilder tempBuilder = new StringBuilder();
				generate(action.getPindex(), tempBuilder, ctx);
				builder.append("[" + tempBuilder.toString() + "]");
				builder.append(" = ");
				cast(action.getProperty().getTypeRef().getType(), false, action.getExpression(), builder, ctx);
				builder.append(";\n");
			} else {
				builder.append(action.getProperty().getName() );
				builder.append("=");
				cast(action.getProperty().getTypeRef().getType(), action.getProperty().getTypeRef().isIsArray(),
						action.getExpression(), builder, ctx);
				builder.append(";\n");
			}
			
		}
		
		
	}
	//---------------------------------------------------------------------------------------------
	//---------------------------------------------------------------------------------------------
	public void generate(CpropertyReference expression, StringBuilder builder, Context ctx) {
		if(expression.getCpropertys() != null) {
			
//			for (Variable c: action.getCproperty()) {
//				builder.append(ctx.getVariableName(c) + ".");
//			}
			if (expression.getCpropertys().get(0) instanceof Cproperty) {
				builder.append(ctx.getContextAnnotation("thisRef"));
			}
			
			
			if(expression.getCpropertys().get(0).getTypeRef().getCardinality() != null && expression.getCindex() != null) {
				builder.append(ctx.getVariableName(expression.getCpropertys().get(0)));
				StringBuilder cTempBuilder = new StringBuilder();
				generate(expression.getCindex(), cTempBuilder, ctx);
				builder.append("[" + cTempBuilder.toString() + "]");
//				builder.append(".");
			} else {
				builder.append(ctx.getVariableName(expression.getCpropertys().get(0)));
//				builder.append(".");
			}
			
			if(expression.getProperty() != null) {
				if(expression.getProperty().getTypeRef().getCardinality() != null && expression.getPindex() != null) {
	//				builder.append(ctx.getVariableName(expression.getProperty()));
					builder.append(".");
					builder.append(expression.getProperty().getName());
					StringBuilder tempBuilder = new StringBuilder();
					generate(expression.getPindex(), tempBuilder, ctx);
					builder.append("[" + tempBuilder.toString() + "]");
					
				} else {
	//				builder.append(ctx.getVariableName(expression.getProperty()));
					builder.append(".");
					builder.append(expression.getProperty().getName());
	//				builder.append(";\n");
				}
			}
			
			
		}
		
	}
	
	@Override
	public void generate(SendAction action, StringBuilder builder, Context ctx) {
		
		boolean isEntityList = false;
		boolean isSendOut = false;
		StringBuilder entityBuilder = new StringBuilder();
		
		StringBuilder nameBuilder = new StringBuilder();
        for (ExternalConnector eco : ConfigurationHelper.getExternalConnectors(ctx.getCurrentConfiguration())) {
            if (EcoreUtil.equals(action.getPort(), eco.getPort())) {
            	isSendOut = true;
            }
        }
		for (Expression ex : action.getParameters()) {
			if(ex instanceof PropertyReference) {
				PropertyReference pa = (PropertyReference) ex;
				//entity serialization
				if(pa.getProperty() instanceof Cproperty) { 
					isEntityList = true;
					//entity list 
//					if(pa.getProperty().getTypeRef().getCardinality() != null) {
//						
//					}
					//get array integer value
					StringBuilder paTempBuilder = new StringBuilder();
					IntegerLiteral paIntegerLiteral = (IntegerLiteral) (pa.getProperty().getTypeRef().getCardinality());
					paTempBuilder.append(paIntegerLiteral.getIntValue());
					
					entityBuilder.append("var " + action.getMessage().getName() + " = {\n" );
//					entityBuilder.append(pa.getProperty().getTypeRef().getType().getName() + ":{\n");
					entityBuilder.append("0:{\n");
					SubThing subthing = (SubThing) pa.getProperty().getTypeRef().getType();
					for(Property p: subthing.getProperties()) {
						
						entityBuilder.append(p.getName() + ":'',\n");
						
					}
					entityBuilder.append("}\n}\n");
					//====================================================================
					entityBuilder.append("for(var i_var = 0; i_var < " + paTempBuilder + "; i_var++){\n");
					
					entityBuilder.append(action.getMessage().getName() + "[i_var] = {}\n");
					for(Property p: subthing.getProperties()) {
						entityBuilder.append(action.getMessage().getName() + "[i_var]." + p.getName());
						entityBuilder.append("=" + "this." + ctx.getVariableName(pa.getProperty()) + "[i_var]." + p.getName() +"\n");
					}
					entityBuilder.append("}\n");
//					entityBuilder.append("var " + pa.getProperty().getName() +  "_msg = JSON.stringify(" + action.getMessage().getName() +")\n");
//					nameBuilder.append(","+pa.getProperty().getName() +  "_msg");
					nameBuilder.append(","+action.getMessage().getName());
				}
 			}
			else {
				entityBuilder.append(", ");
				generate(ex, entityBuilder, ctx);
			}
		}
		if(isEntityList) {
			builder.append(entityBuilder);
			if (!AnnotatedElementHelper.isDefined(action.getPort(), "sync_send", "true")) {
				builder.append("setImmediate(() => {");
			}
			builder.append(ctx.getContextAnnotation("thisRef"));
			builder.append("bus.emit(");
			if(isSendOut)
				builder.append("'" + action.getPort().getName() + "!" + action.getMessage().getName() + "'");
			else
				builder.append("'" + action.getPort().getName() + "'" );
			
			builder.append(", new Event." + ctx.firstToUpper(action.getMessage().getName()) + "(");
			builder.append("'" + action.getPort().getName() + "'");
			builder.append(nameBuilder);
		}
		else {
			if (!AnnotatedElementHelper.isDefined(action.getPort(), "sync_send", "true")) {
				builder.append("setImmediate(() => {");
			}
			builder.append(ctx.getContextAnnotation("thisRef"));
			builder.append("bus.emit(");
			
			if(isSendOut)
				builder.append("'" + action.getPort().getName() + "!" + action.getMessage().getName() + "'");
			else
				builder.append("'" + action.getPort().getName() + "'"  );

			builder.append(", new Event." + ctx.firstToUpper(action.getMessage().getName()) + "(");
			builder.append("'" + action.getPort().getName() + "'");
			builder.append(entityBuilder);
		}
		
		
		
		builder.append("))");
		if (!AnnotatedElementHelper.isDefined(action.getPort(), "sync_send", "true")) {
			builder.append("})");
		}
		builder.append(";\n");
	}

	@Override
	public void generate(StartSession action, StringBuilder builder, Context ctx) {
		Session session = action.getSession();
		builder.append("const " + session.getName() + " = new "
				+ ctx.firstToUpper(AiotMLHelpers.findContainingThing(session).getName()) + "(\"" + session.getName()
				+ "\", this);\n");
		for (Property prop : ThingHelper.allPropertiesInDepth(AiotMLHelpers.findContainingThing(session))) {
			//if(prop.eContainer() instanceof Thing) {
				if (prop.getTypeRef().isIsArray() || prop.getTypeRef().getCardinality() != null) {
					builder.append(session.getName() + ".init" + ctx.firstToUpper(ctx.getVariableName(prop)) + "(" + ctx.getContextAnnotation("thisRef") + AiotMLElementHelper.qname(prop, "_") + "_var.slice(0));\n");
				} else {
					builder.append(session.getName() + ".init" + ctx.firstToUpper(ctx.getVariableName(prop)) + "(" + ctx.getContextAnnotation("thisRef") + AiotMLElementHelper.qname(prop, "_") + "_var);\n");
				}
			//}
		}
		builder.append(ctx.getContextAnnotation("thisRef"));
		builder.append("forks.push(" + session.getName() + ");\n");
		builder.append("setImmediate(() => {\n");
		builder.append(session.getName() + "._init();\n");
		builder.append("});\n");
	}

	@Override
	public void generate(FunctionCallStatement action, StringBuilder builder, Context ctx) {
		builder.append(ctx.getContextAnnotation("thisRef"));
		builder.append(action.getFunction().getName() + "(");
		int i = 0;
		for (Expression p : action.getParameters()) {
			if (i > 0)
				builder.append(", ");
			generate(p, builder, ctx);
			i++;
		}
		builder.append(");\n");
	}

	@Override
	public void generate(LocalVariable action, StringBuilder builder, Context ctx) {
		if (!action.isReadonly())
			builder.append("let ");
		else
			builder.append("const ");
		builder.append(ctx.getVariableName(action));
		if (action.getInit() != null) {
			builder.append(" = ");
			generate(action.getInit(), builder, ctx);
		} else {
			if (action.getTypeRef().getCardinality() != null) {
				builder.append(" = []");
			}
			if (action.isReadonly() && action.getTypeRef().getCardinality() == null)
				System.out.println("[ERROR] readonly variable " + action + " must be initialized");
		}
		builder.append(";\n");
	}

	@Override
	public void generate(ErrorAction action, StringBuilder builder, Context ctx) {
		builder.append("console.error(''");
		for (Expression msg : action.getMsg()) {
			builder.append("+");
			generate(msg, builder, ctx);
		}
		builder.append(");\n");
		// console.error() always prints lines
	}

	@Override
	public void generate(PrintAction action, StringBuilder builder, Context ctx) {
		builder.append("console.log(''");
		for (Expression msg : action.getMsg()) {
			builder.append("+");
			generate(msg, builder, ctx);
		}
		builder.append(");\n");
		// console.log() always prints lines
	}

	@Override
	public void generate(PropertyReference expression, StringBuilder builder, Context ctx) {
		if (expression.getProperty() instanceof Parameter || expression.getProperty() instanceof LocalVariable) {
			builder.append(ctx.getVariableName(expression.getProperty()));
		} else if (expression.getProperty() instanceof Property) {
			if (!ctx.getAtInitTimeLock()) {
				if (ctx.currentInstance != null) {
					Property p = (Property) expression.getProperty();
					if (p.isReadonly()) {
						boolean found = false;
						for (ConfigPropertyAssign pa : ctx.getCurrentConfiguration().getPropassigns()) {
							String tmp = AiotMLElementHelper.findContainingConfiguration(pa.getInstance()).getName()
									+ "_" + pa.getInstance().getName();

							if (ctx.currentInstance.getName().equals(tmp)) {
								if (pa.getProperty().getName().equals(p.getName())) {
									generate(pa.getInit(), builder, ctx);
									found = true;
									break;
								}
							}
						}
						if (!found) {
							generate(p.getInit(), builder, ctx);
						}
					} else {
						builder.append(ctx.getContextAnnotation("thisRef"));
						builder.append(ctx.getVariableName(expression.getProperty()));
					}
				} else {
					builder.append(ctx.getContextAnnotation("thisRef"));
					builder.append(ctx.getVariableName(expression.getProperty()));
				}
			} else {
				Property p = (Property) expression.getProperty();
				Expression e = ConfigurationHelper
						.initExpressions(ctx.getCurrentConfiguration(), ctx.currentInstance, p).get(0);
				generate(e, builder, ctx);
			}
		}
	}

	@Override
	public void generate(EnumLiteralRef expression, StringBuilder builder, Context ctx) {
		builder.append("Enum." + ctx.firstToUpper(expression.getEnum().getName()) + "_ENUM."
				+ expression.getLiteral().getName().toUpperCase());
	}

	@Override
	public void generate(FunctionCallExpression expression, StringBuilder builder, Context ctx) {
		if (ctx.currentInstance != null)
			builder.append(ctx.currentInstance.getName() + ".");
		else
			builder.append(ctx.getContextAnnotation("thisRef"));
		builder.append(expression.getFunction().getName() + "(");
		int i = 0;
		for (Expression p : expression.getParameters()) {
			if (i > 0)
				builder.append(", ");
			generate(p, builder, ctx);
			i++;
		}
		builder.append(")");
	}

	@Override
	public void generate(EqualsExpression expression, StringBuilder builder, Context ctx) {
		generate(expression.getLhs(), builder, ctx);
		builder.append(" === ");
		generate(expression.getRhs(), builder, ctx);
	}

	@Override
	public void generate(StringLiteral expression, StringBuilder builder, Context ctx) {
		builder.append("'" + expression.getStringValue().replaceAll("'", "\\\\'") + "'");
	}

	@Override
	public void generate(EventReference expression, StringBuilder builder, Context ctx) {
		builder.append((((ReceiveMessage) expression.getReceiveMsg()).getMessage().getName()) + "."
				+ expression.getParameter().getName());
	}

	@Override
	public void generate(Increment action, StringBuilder builder, Context ctx) {
		if (action.getVar() instanceof Property) {
			builder.append(ctx.getContextAnnotation("thisRef"));
		}
		super.generate(action, builder, ctx);
	}

	@Override
	public void generate(Decrement action, StringBuilder builder, Context ctx) {
		if (action.getVar() instanceof Property) {
			builder.append(ctx.getContextAnnotation("thisRef"));
		}
		super.generate(action, builder, ctx);
	}

	@Override
	public void generate(ArrayInit expression, StringBuilder builder, Context ctx) {
		builder.append("[");
		for(Expression e : expression.getValues()) {
			if (expression.getValues().indexOf(e)>0)
				builder.append(", ");
			generate(e, builder, ctx);
		}
		builder.append("]");
	}

	@Override
	public void generate(ForAction fa, StringBuilder builder, Context ctx) {
		if (fa.getArray().getProperty() instanceof Property) {
			builder.append(ctx.getContextAnnotation("thisRef"));
		}
		builder.append(ctx.getVariableName(fa.getArray().getProperty()) + ".forEach((" + ctx.getVariableName(fa.getVariable()));
		if (fa.getIndex() != null) {
			builder.append(", " + ctx.getVariableName(fa.getIndex()));
		}
		builder.append(") => {\n");
		generate(fa.getAction(), builder, ctx);
		builder.append("});\n");
	}
}
