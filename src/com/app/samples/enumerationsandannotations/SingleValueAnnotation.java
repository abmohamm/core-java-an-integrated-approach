//custom annotations - single-value demo
//create a single-value annotation which can be applied to a method. Make it available to JVM at runtime
package com.app.samples.enumerationsandannotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface SingleValue {
	
	int value();	//this variable name must be value only
}

//We will apply SingleValue annotation to a method in the following class
class UseSingleValue {
	
	//annotate a method using SingleValue annotation. Store value 100 into MySingle annotation
	@SingleValue(value = 100)
	public void myMethod() {
		
		System.out.println("hello");
	}
}

//access the SingleValue annotation using another program
public class SingleValueAnnotation {

	public static void main(String[] args) throws NoSuchMethodException {
		
		// TODO Auto-generated method stub
		//create UseCustomAnnotation object
		UseSingleValue useSingleValue = new UseSingleValue();
		
		//getClass() method returns Class object and getMethod() returns the Method class object
		Method methods[] = useSingleValue.getClass().getMethods();
		
		//now retrieve the SingleValue annotation associated with the method
		SingleValue singleValue = methods[0].getAnnotation(SingleValue.class);
		
		//retrieve and display the value in the annotation
		System.out.println("Value : " + singleValue.value());
				
	}

}
