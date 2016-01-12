package myPack;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import static java.lang.System.out;
import java.lang.reflect.Type;

public class Run {
	public static void main(String[] args) throws ClassNotFoundException, IllegalArgumentException, IllegalAccessException{
 		
		Class<?> c = Class.forName("java.lang.Thread");
		
		String name = c.getName();
		System.out.println("Class name is - " + name);
		
		System.out.println("Modifier of " + name +" class is " + "\"" + Modifier.toString(c.getModifiers())+ "\"");
		
		Field []allFields = c.getDeclaredFields();
		 Annotation[] annotations = c.getAnnotations();
		for (int i=0; i<allFields.length; i++) { 
		    Class fieldType = allFields[i].getType();		  
		    System.out.print(" " + Modifier.toString(allFields[i].getModifiers())); 
		    System.out.print(" " + allFields[i].getName()); 
		    System.out.print(" " + fieldType.getName()); 
		    System.out.println(" @annotation " + annotations + " ");
		}    
		
		System.out.println("----------------Methods------------------------");
		Method []allMethods = c.getDeclaredMethods(); 
		for (int j=0; j<allMethods.length; j++){
			out.format("%s%n", allMethods[j].toGenericString());

			//out.format(fmt, "ReturnType", allMethods[j].getReturnType());
			//out.format(fmt, "GenericReturnType", allMethods[j].getGenericReturnType());
		}
		
	
}}
