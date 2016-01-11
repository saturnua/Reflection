package myPack;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

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
		    System.out.print("Name: " + allFields[i].getName()); 
		    System.out.print("; Type: " + fieldType.getName()); 
		    System.out.println(" @annotation " + annotations + " ");
		    System.out.println();
	}
}}
