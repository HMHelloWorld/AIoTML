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
package org.aiotml.compilers.java;

import org.eclipse.emf.ecore.EObject;
import org.aiotml.compilers.Context;
import org.aiotml.compilers.thing.common.CommonThingActionCompiler;
import org.aiotml.xtext.constraints.AiotMLHelpers;
import org.aiotml.xtext.constraints.Types;
import org.aiotml.xtext.helpers.AnnotatedElementHelper;
import org.aiotml.xtext.helpers.ConfigurationHelper;
import org.aiotml.xtext.helpers.ThingHelper;
import org.aiotml.xtext.helpers.TyperHelper;
import org.aiotml.xtext.aiotML.ArrayInit;
import org.aiotml.xtext.aiotML.Decrement;
import org.aiotml.xtext.aiotML.EnumLiteralRef;
import org.aiotml.xtext.aiotML.Enumeration;
import org.aiotml.xtext.aiotML.EnumerationLiteral;
import org.aiotml.xtext.aiotML.EqualsExpression;
import org.aiotml.xtext.aiotML.ErrorAction;
import org.aiotml.xtext.aiotML.EventReference;
import org.aiotml.xtext.aiotML.Expression;
import org.aiotml.xtext.aiotML.ExternExpression;
import org.aiotml.xtext.aiotML.ForAction;
import org.aiotml.xtext.aiotML.FunctionCallExpression;
import org.aiotml.xtext.aiotML.FunctionCallStatement;
import org.aiotml.xtext.aiotML.Increment;
import org.aiotml.xtext.aiotML.IntegerLiteral;
import org.aiotml.xtext.aiotML.LocalVariable;
import org.aiotml.xtext.aiotML.NotEqualsExpression;
import org.aiotml.xtext.aiotML.Parameter;
import org.aiotml.xtext.aiotML.PrimitiveType;
import org.aiotml.xtext.aiotML.PrintAction;
import org.aiotml.xtext.aiotML.Property;
import org.aiotml.xtext.aiotML.PropertyReference;
import org.aiotml.xtext.aiotML.ReceiveMessage;
import org.aiotml.xtext.aiotML.SendAction;
import org.aiotml.xtext.aiotML.StartSession;
import org.aiotml.xtext.aiotML.Thing;
import org.aiotml.xtext.aiotML.AiotMLPackage;
import org.aiotml.xtext.aiotML.Type;
import org.aiotml.xtext.aiotML.TypeRef;
import org.aiotml.xtext.aiotML.VariableAssignment;
import org.aiotml.xtext.validation.TypeChecker;

/**
 * Created by bmori on 01.12.2014.
 */
public class JavaThingActionCompiler extends CommonThingActionCompiler {

	@Override
	public void generate(Increment action, StringBuilder builder, Context ctx) {
		if (action.getVar() instanceof Property) {
			builder.append("set" + ctx.firstToUpper(ctx.getVariableName(action.getVar())) + "(");
			builder.append("(" + JavaHelper.getJavaType(action.getVar().getTypeRef().getType(),
					action.getVar().getTypeRef().getCardinality() != null, ctx) + ")");
			builder.append("(get" + ctx.firstToUpper(ctx.getVariableName(action.getVar())) + "()");
			builder.append(" + 1));\n");
		} else {
			super.generate(action, builder, ctx);
		}
	}

	@Override
	public void generate(Decrement action, StringBuilder builder, Context ctx) {
		if (action.getVar() instanceof Property) {
			builder.append("set" + ctx.firstToUpper(ctx.getVariableName(action.getVar())) + "(");
			builder.append("(" + JavaHelper.getJavaType(action.getVar().getTypeRef().getType(),
					action.getVar().getTypeRef().getCardinality() != null, ctx) + ")");
			builder.append("(get" + ctx.firstToUpper(ctx.getVariableName(action.getVar())) + "()");
			builder.append(" - 1));\n");
		} else {
			super.generate(action, builder, ctx);
		}
	}

	@Override
	public void generate(EqualsExpression expression, StringBuilder builder, Context ctx) {
		final Type leftType = TypeChecker.computeTypeOf(expression.getLhs());
		final Type rightType = TypeChecker.computeTypeOf(expression.getRhs());		
		if (TyperHelper.isA(leftType, Types.OBJECT_TYPE) && TyperHelper.isA(rightType, Types.OBJECT_TYPE)) {
			if (expression.getLhs() instanceof ExternExpression) {
				final ExternExpression extL = (ExternExpression) expression.getLhs();				
				if (extL.getExpression().trim().equals("null")) {// we check for null pointer, should use ==
					super.generate(expression, builder, ctx);
					return;
				}
			}
			if (expression.getRhs() instanceof ExternExpression) {
				final ExternExpression extR = (ExternExpression) expression.getRhs();
				if (extR.getExpression().trim().equals("null")) {// we check for null pointer, should use ==
					super.generate(expression, builder, ctx);
					return;
				}
			}
			generate(expression.getLhs(), builder, ctx);
			builder.append(".equals(");
			generate(expression.getRhs(), builder, ctx);
			builder.append(")");
		} else {
			super.generate(expression, builder, ctx);
		}
	}

	@Override
	public void generate(NotEqualsExpression expression, StringBuilder builder, Context ctx) { 
		final Type leftType = TypeChecker.computeTypeOf(expression.getLhs());
		final Type rightType = TypeChecker.computeTypeOf(expression.getRhs());		
		if (TyperHelper.isA(leftType, Types.OBJECT_TYPE) || TyperHelper.isA(rightType, Types.OBJECT_TYPE)) {
			if (expression.getLhs() instanceof ExternExpression) {
				final ExternExpression extL = (ExternExpression) expression.getLhs();
				if (extL.getExpression().trim().equals("null")) {// we check for null pointer, should use ==
					super.generate(expression, builder, ctx);
					return;
				}
			}
			if (expression.getRhs() instanceof ExternExpression) {
				final ExternExpression extR = (ExternExpression) expression.getRhs();
				if (extR.getExpression().trim().equals("null")) {// we check for null pointer, should use ==
					super.generate(expression, builder, ctx);
					return;
				}
			}
			builder.append("!(");
			generate(expression.getLhs(), builder, ctx);
			builder.append(".equals(");
			generate(expression.getRhs(), builder, ctx);
			builder.append("))");
		} else {
			super.generate(expression, builder, ctx);
		}
	}

	@Override
	public void generate(SendAction action, StringBuilder builder, Context ctx) {
		builder.append(
				"send" + ctx.firstToUpper(action.getMessage().getName()) + "_via_" + action.getPort().getName() + "(");
		int i = 0;
		for (Expression p : action.getParameters()) {
			if (i > 0)
				builder.append(", ");
			int j = 0;
			for (Parameter fp : action.getMessage().getParameters()) {
				if (i == j) {// parameter p corresponds to formal parameter fp
					cast(fp.getTypeRef().getType(), fp.getTypeRef().isIsArray(), p, builder, ctx);
					break;
				}
				j++;
			}
			i++;
		}
		builder.append(");\n");
	}

	@Override
	public void generate(StartSession action, StringBuilder builder, Context ctx) {
		builder.append("final Component " + action.getSession().getName() + " = new "
				+ ctx.firstToUpper(AiotMLHelpers.findContainingThing(action.getSession()).getName()) + "()");
		for (Property p : ThingHelper.allPropertiesInDepth(AiotMLHelpers.findContainingThing(action.getSession()))) {
			builder.append(".init" + ctx.firstToUpper(ctx.getVariableName(p)) + "(");
			if (p.getTypeRef().isIsArray() || p.getTypeRef().getCardinality() != null) {
				builder.append("Arrays.copyOf("
						+ ctx.firstToUpper(AiotMLHelpers.findContainingThing(action.getSession()).getName()) + ".this."
						+ ctx.getVariableName(p) + ", "
						+ ctx.firstToUpper(AiotMLHelpers.findContainingThing(action.getSession()).getName()) + ".this."
						+ ctx.getVariableName(p) + ".length)");
			} else {
				builder.append(ctx.firstToUpper(AiotMLHelpers.findContainingThing(action.getSession()).getName())
						+ ".this." + ctx.getVariableName(p));
			}
			builder.append(")");
		}
		builder.append(".buildBehavior(\"" + action.getSession().getName() + "\", "
				+ ctx.firstToUpper(AiotMLHelpers.findContainingThing(action.getSession()).getName()) + ".this);\n");
		builder.append("final Component root = ("
				+ ctx.firstToUpper(AiotMLHelpers.findContainingThing(action.getSession()).getName())
				+ ".this.root == null)? "
				+ ctx.firstToUpper(AiotMLHelpers.findContainingThing(action.getSession()).getName()) + ".this : "
				+ ctx.firstToUpper(AiotMLHelpers.findContainingThing(action.getSession()).getName())
				+ ".this.root;\n");
		builder.append("root.addSession(" + action.getSession().getName() + ");\n");
	}

	@Override
	public void generate(FunctionCallStatement action, StringBuilder builder, Context ctx) {
		if (AnnotatedElementHelper.isDefined(action.getFunction(), "fork_thread", "true")
				&& action.getFunction().getTypeRef() != null) {
			System.err.println("function " + action.getFunction().getName()
					+ "cannot be called with @fork_thread, as its return type ("
					+ action.getFunction().getTypeRef().getType().getName() + ") is not void");
			throw new UnsupportedOperationException("function " + action.getFunction().getName()
					+ "cannot be called with @fork_thread, as its return type ("
					+ action.getFunction().getTypeRef().getType().getName() + ") is not void");
		}

		if (AnnotatedElementHelper.isDefined(action.getFunction(), "fork_thread", "true")) {
			builder.append("new Thread(new Runnable(){public void run() {\n");
		}

		builder.append(action.getFunction().getName() + "(");
		int i = 0;
		for (Expression p : action.getParameters()) {
			if (i > 0)
				builder.append(", ");
			int j = 0;
			for (Parameter fp : action.getFunction().getParameters()) {
				if (i == j) {// parameter p corresponds to formal parameter fp
					cast(fp.getTypeRef().getType(), fp.getTypeRef().isIsArray(), p, builder, ctx);
					break;
				}
				j++;
			}
			i++;
		}
		builder.append(");\n");

		if (AnnotatedElementHelper.isDefined(action.getFunction(), "fork_thread", "true")) {
			builder.append("}}).start();\n");
		}
	}

	@Override
	public void generate(LocalVariable action, StringBuilder builder, Context ctx) {
		if (action.isReadonly()) {
			builder.append("final ");
		}

		// Define the type of the variable
		builder.append(JavaHelper.getJavaType(action.getTypeRef().getType(), action.getTypeRef().isIsArray(), ctx));
		builder.append(" ");

		builder.append(ctx.getVariableName(action));

		// Define the initial value for that variable
		if (action.getInit() != null) {
			builder.append(" = ");
			cast(action.getTypeRef().getType(), action.getTypeRef().isIsArray(), action.getInit(), builder, ctx);
			builder.append(";\n");
		} else {
			if (action.getTypeRef().getCardinality() != null) {
				builder.append(" = new " + JavaHelper.getJavaType(action.getTypeRef().getType(), false, ctx) + "[");
				generate(action.getTypeRef().getCardinality(), builder, ctx);
				builder.append("];");
			} else {
				if (action.getTypeRef().getType() instanceof PrimitiveType) {
					builder.append(" = " + JavaHelper.getDefaultValue(action.getTypeRef().getType()) + ";");
				} else {
					builder.append(" = null;");
				}
			}
		}
		builder.append("\n");
	}

	@Override
	public void generate(ErrorAction action, StringBuilder builder, Context ctx) {
		final Thing t = AiotMLHelpers.findContainingThing(action);
		if (AnnotatedElementHelper.isDefined(t, "stdout_sync", "true")) {
			builder.append("synchronized(System.err) {\n");
		}		
		if (action.isLine())
			builder.append("System.err.println(\"\"");
		else
			builder.append("System.err.print(\"\"");
		for (Expression msg : action.getMsg()) {
			builder.append("+(");
			generate(msg, builder, ctx);
			builder.append(")");
		}
		builder.append(");\n");
		if (AnnotatedElementHelper.isDefined(t, "stdout_sync", "true")) {
			builder.append("}\n");
		}
	}

	@Override
	public void generate(PrintAction action, StringBuilder builder, Context ctx) {
		final Thing t = AiotMLHelpers.findContainingThing(action);
		if (AnnotatedElementHelper.isDefined(t, "stdout_sync", "true")) {
			builder.append("synchronized(System.out) {\n");
		}		
		if (action.isLine())
			builder.append("System.out.println(\"\"");
		else
			builder.append("System.out.print(\"\"");
		for (Expression msg : action.getMsg()) {
			builder.append("+(");
			generate(msg, builder, ctx);
			builder.append(")");
		}
		builder.append(");\n");
		if (AnnotatedElementHelper.isDefined(t, "stdout_sync", "true")) {
			builder.append("}\n");
		}
	}

	@Override
	public void generate(PropertyReference expression, StringBuilder builder, Context ctx) {
		if (!ctx.getAtInitTimeLock()) {
			if (expression.getProperty() instanceof Property
					&& ((Property) expression.getProperty()).getTypeRef().getCardinality() == null)
				builder.append("get" + ctx.firstToUpper(ctx.getVariableName(expression.getProperty())) + "()");
			else
				builder.append(ctx.getVariableName(expression.getProperty()));
		} else {
			Property p = (Property) expression.getProperty();
			if (!p.isReadonly()) {
				System.out.println(
						"Error: non Read-only property (" + p.getName() + ") used in array cardinality definition.");
			}
			Expression e = ConfigurationHelper.initExpressions(ctx.getCurrentConfiguration(), ctx.currentInstance, p)
					.get(0);
			generate(e, builder, ctx);
		}
	}

	@Override
	public void generate(EnumLiteralRef expression, StringBuilder builder, Context ctx) {
		final EnumerationLiteral lit = expression.getLiteral();
		if (((Enumeration)lit.eContainer()).getTypeRef() != null) {
			generate(lit.getInit(), builder, ctx);
		}
		else {
			if (AnnotatedElementHelper.hasAnnotation(lit, "enum_val")) {
				final String value = AnnotatedElementHelper.annotation(lit, "enum_val").get(0);
				try {
					Double.parseDouble(value);
					builder.append(AnnotatedElementHelper.annotation(lit, "enum_val").get(0));
				} catch (NumberFormatException nfe) {
					builder.append("\"" + AnnotatedElementHelper.annotation(lit, "enum_val").get(0) + "\"");
				}
			} else {
				builder.append(ctx.firstToUpper(expression.getEnum().getName()) + "_ENUM."
						+ ((Enumeration) expression.getLiteral().eContainer()).getName().toUpperCase() + "_"
						+ expression.getLiteral().getName().toUpperCase());
			}
		}
	}

	@Override
	public void generate(FunctionCallExpression expression, StringBuilder builder, Context ctx) {
		if (ctx.currentInstance != null)
			builder.append(ctx.getInstanceName(ctx.currentInstance) + ".");
		builder.append(expression.getFunction().getName() + "(");

		int i = 0;
		for (Expression p : expression.getParameters()) {

			if (i > 0)
				builder.append(", ");
			int j = 0;
			for (Parameter fp : expression.getFunction().getParameters()) {
				if (i == j) {// parameter p corresponds to formal parameter fp
					cast(fp.getTypeRef().getType(), fp.getTypeRef().isIsArray(), p, builder, ctx);
					break;
				}
				j++;
			}
			i++;
		}
		builder.append(")");
	}

	@Override
	public void cast(Type type, boolean isArray, Expression exp, StringBuilder builder, Context ctx) {
		if (!(type instanceof Enumeration)) {
			if (AnnotatedElementHelper.hasAnnotation(type, "java_type")) {
				if (!isArray)
					builder.append("(" + AnnotatedElementHelper.annotation(type, "java_type").toArray()[0] + ") ");
				else
					builder.append("(" + AnnotatedElementHelper.annotation(type, "java_type").toArray()[0] + "[]) ");
			} else {
				if (!isArray)
					builder.append("(Object) ");
				else
					builder.append("(Object[]) ");
			}
		}
		builder.append("(");
		generate(exp, builder, ctx);
		builder.append(")");
	}

	@Override
	public void generate(EventReference expression, StringBuilder builder, Context ctx) {
		builder.append((((ReceiveMessage) expression.getReceiveMsg()).getMessage().getName()) + "."
				+ expression.getParameter().getName());
	}

	@Override
	public void generate(IntegerLiteral expression, StringBuilder builder, Context ctx) {
		super.generate(expression, builder, ctx);
		if (expression.getIntValue() > 2147483647 || expression.getIntValue() < -2147483647)
			builder.append("L");
	}
	
	@Override
	public void generate(ArrayInit expression, StringBuilder builder, Context ctx) {
		final EObject container = expression.eContainer();
		final TypeRef typeref = (TypeRef) container.eGet(AiotMLPackage.eINSTANCE.getVariable_TypeRef());				
		final Type t = typeref.getType();		
		builder.append("new " + JavaHelper.getJavaType(t, false, ctx) + "[]");
		builder.append("{");
		for(Expression e : expression.getValues()) {
			if (expression.getValues().indexOf(e)>0)
				builder.append(", ");
			generate(e, builder, ctx);
		}
		builder.append("}");
	}

	@Override
	public void generate(ForAction fa, StringBuilder builder, Context ctx) {
		if (fa.getIndex() != null) {
			builder.append("{\n");
			final String t = JavaHelper.getJavaType(fa.getIndex().getTypeRef().getType(), false, ctx);
			builder.append(t + " " + ctx.getVariableName(fa.getIndex()) + " = 0;\n");
		}
		final String t = JavaHelper.getJavaType(fa.getVariable().getTypeRef().getType(), false, ctx);
		builder.append("for(" + t + " " + ctx.getVariableName(fa.getVariable()) + " : " + ctx.getVariableName(fa.getArray().getProperty()) + ") {\n");
		generate(fa.getAction(), builder, ctx);
		if (fa.getIndex() != null) {
			builder.append(ctx.getVariableName(fa.getIndex()) + "++;\n");
		}
		builder.append("}\n");
		if (fa.getIndex() != null) {
			builder.append("}\n");
		}
	}
}
