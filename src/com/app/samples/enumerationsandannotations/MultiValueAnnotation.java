//custom annotations - multi-value demo
//create a multi-value annotation and apply it to a class.Make it available to JVM at runtime
package com.app.samples.enumerationsandannotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface MultiValue {
	
	int value1();
	String value2();
	String value3();
}

//annotate a class using MultiValue annotation. Store values into MyMulti annotation
@MultiValue(value1 = 10, value2 = "Abid", value3 = "New sanath nagar, Vijayawada")
class UseMultiValue {
	
	public void myMethod() {
		
		System.out.println("Hello");
	}
	
}

//access the MultiValue annotation values using another program
public class MultiValueAnnotation {

	public static void main(String[] args) throws ClassNotFoundException {

		// TODO Auto-generated method stub
		//store the class name in an an object - object
		Class object = Class.forName("com.app.samples.enumerationsandannotations.UseMultiValue");
		
		//now retrieve all annotations associated with the class into annotations[] array
		Annotation[] annotations = object.getAnnotations();
		
		//use a for-each loop to repeat with each annotation
		for(Annotation annotation : annotations) {
			//if the specific annotation belongs to MultiValue then store it into MultiValue object
			if(annotation instanceof MultiValue) {
				
				MultiValue multiValue = (MultiValue)annotation;
				
				//retrieve the values associated with the MultiValue object
				System.out.println("Value - 1 : " + multiValue.value1());
				System.out.println("Value - 2 : " + multiValue.value2());
				System.out.println("Value - 3 : " + multiValue.value3());
			}
		}
	}

}
