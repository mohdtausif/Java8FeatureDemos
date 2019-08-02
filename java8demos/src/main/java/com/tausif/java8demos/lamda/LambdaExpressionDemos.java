package com.tausif.java8demos.lamda;

public class LambdaExpressionDemos {
	
	final static String salutation = "Hello! ";
	
	public static void main(String[] args)
	{
		LambdaExpressionDemos tester=new LambdaExpressionDemos();
		MathOperation division = (int a, int b)->a / b;
		MathOperation multiplication = (a, b) -> a * b;
		MathOperation addition = (int a, int b)->{return a + b;};
		MathOperation subtraction = (int a, int b)->a - b;
		
		System.out.println("10 + 5 = " + tester.operate(10, 5, addition)); 
		System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction)); 
		System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication)); 
		System.out.println("10 / 5 = " + tester.operate(10, 5, division));
		
		
		//with parenthesis
		GreetingService greetService1 = message->System.out.println(salutation + message);
		
		
		//without parenthesis
		GreetingService greetService2 = (message)->System.out.println(salutation + message);
		greetService1.sayMessage("Mahesh");
		greetService2.sayMessage("Suresh");

	}
	
	private int operate(int a, int b, MathOperation mathOperation)
	{ 
		return mathOperation.operation(a, b);
	}
}


