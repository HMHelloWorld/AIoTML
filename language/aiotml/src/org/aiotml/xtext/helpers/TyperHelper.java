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
package org.aiotml.xtext.helpers;

import org.aiotml.xtext.constraints.Types;
import org.aiotml.xtext.aiotML.Enumeration;
import org.aiotml.xtext.aiotML.ObjectType;
import org.aiotml.xtext.aiotML.PrimitiveType;
import org.aiotml.xtext.aiotML.SubThing;
import org.aiotml.xtext.aiotML.Strategy;
import org.aiotml.xtext.aiotML.StrategyProperty;
import org.aiotml.xtext.aiotML.Model;
import org.aiotml.xtext.aiotML.Cproperty;
import org.aiotml.xtext.aiotML.Type;

/**
 * Created by ffl on 10.05.2016.
 */
public class TyperHelper {
	
	public static boolean isSerializable(Type t) {
		if (t instanceof PrimitiveType) return true;
		if (t instanceof Cproperty) return true;
		if (t instanceof SubThing) return true;
		if (t instanceof Strategy) return true;
		if (t instanceof Model) return true;
		if (t instanceof StrategyProperty) return true;
		if (AnnotatedElementHelper.hasFlag(t, "serializable")) return true;
		if (t instanceof Enumeration) 
			return (((Enumeration)t).getTypeRef() == null)? false : isSerializable(((Enumeration)t).getTypeRef().getType());		
		return false;
	}

	private static Type getType(String ty) {
        if (ty.equals("Byte"))
        	return Types.BYTE_TYPE;
        else if (ty.equals("Integer"))
            return Types.INTEGER_TYPE;
        else if (ty.equals("Real"))
            return Types.REAL_TYPE;
        else if (ty.equals("Boolean"))
            return Types.BOOLEAN_TYPE;
        else if (ty.equals("Character"))
            return Types.CHARACTER_TYPE;
        else if (ty.equals("String"))
            return Types.STRING_TYPE;
        else if (ty.equals("Object"))
            return Types.OBJECT_TYPE;
        else if (ty.equals("Error"))
            return Types.ERROR_TYPE;
        else if (ty.equals("Void"))
            return Types.VOID_TYPE;
        else
            return Types.ANY_TYPE;
	}
	
    public static Type getBroadType(Type self) {
    	if (self instanceof ObjectType) {
    		if (self.getName().equals("String"))
    			return Types.STRING_TYPE;
            return Types.OBJECT_TYPE;
        }
    	if (self instanceof Enumeration) {
    		final Enumeration e = (Enumeration)self;
    		if (e.getTypeRef() != null && e.getTypeRef().getType() != null) {
    			return getBroadType(e.getTypeRef().getType());
    		}
    		return self;
    	}
        if (AnnotatedElementHelper.hasAnnotation(self, "type_checker")) {
            final String ty = AnnotatedElementHelper.annotation(self, "type_checker").get(0);
            return getType(ty);
        } 
        return Types.ANY_TYPE;
    }

    public static boolean isA(Type self, Type t) {
    	self = getBroadType(self);
    	t = getBroadType(t);
        if (self == t) // T is a T
            return true;
        if (t == Types.STRING_TYPE) //Anything is (can be casted to) a String //That is a workaround so that we can use + to concatenate vars in a String (since we do not have a str concat in AiotML, but + is widely used)
    		return true;
    	if (t == Types.OBJECT_TYPE) //Only String, Object and Any are Object
    		return self == Types.ANY_TYPE || self == Types.OBJECT_TYPE || self == Types.STRING_TYPE; 
        if (self == Types.ANY_TYPE)//Any is anything
            return t != Types.ERROR_TYPE;
        if (t == Types.ANY_TYPE)//anything is an Any
            return /*self != Types.OBJECT_TYPE &&*/ self != Types.ERROR_TYPE;
        if (self == Types.BYTE_TYPE && t == Types.INTEGER_TYPE) //a Byte is an Integer
        	return true;
        if ((self == Types.INTEGER_TYPE || self == Types.BYTE_TYPE) && t == Types.REAL_TYPE) //an Integer or a Byte is a Real
            return true;
    	if (self instanceof Enumeration) {
    		if (((Enumeration) self).getTypeRef() != null) {
    			return isA(((Enumeration) self).getTypeRef().getType(), t);
    		}
    		if (AnnotatedElementHelper.hasAnnotation(self, "type_checker")) {
    			final String ty = AnnotatedElementHelper.annotation(self, "type_checker").get(0);
    			final Type typ = getType(ty); 
    			return isA(typ, t);
    		}
    	}
        return false;
    }
}
