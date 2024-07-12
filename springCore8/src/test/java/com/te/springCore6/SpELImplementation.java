package com.te.springCore6;

import java.beans.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class SpELImplementation {
	public static void main(String[] args)  {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/te/springCore6/config.xml");
	   Student student=(Student) context.getBean("student");
	   System.out.println(student);
	    SpelExpressionParser parser= new SpelExpressionParser();
	   Expression expression= (Expression) parser.parseExpression("56+65+46");
//	   System.out.println(expression.getValue());
	}

}
