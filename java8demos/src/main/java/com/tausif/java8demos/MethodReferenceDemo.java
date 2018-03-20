package com.tausif.java8demos;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceDemo 
{
	public MethodReferenceDemo(){}
	public MethodReferenceDemo(String msg){
		System.out.println(msg);
	}
	public static void main(String args[])
	{
		List<String> names = new ArrayList<String>();
		names.add("Mahesh");
		names.add("Suresh");
		names.add("Ramesh");
		names.add("Naresh");
		names.add("Kalpesh");
		
		System.out.println("MethodReferenceExample(System.out::println)=>");
		names.forEach(System.out::println); 
		
		MethodReferenceDemo methodReferenceDemo=new MethodReferenceDemo();
		methodReferenceDemo.staticMethodReferenceExample(names);
		methodReferenceDemo.instanceMethodReferenceExample(names);
		methodReferenceDemo.constructorMethodReferenceExample(names);
	}
	
	public void staticMethodReferenceExample(List<String> names)
	{
		System.out.println("staticMethodReferenceExample=>");
		names.forEach(MethodReferenceDemo::staticMethodPrint);
	}
	
	public void instanceMethodReferenceExample(List<String> names)
	{
		System.out.println("instanceMethodReferenceExample=>");
		MethodReferenceDemo methodReferenceDemo=new MethodReferenceDemo();
		names.forEach(methodReferenceDemo::instanceMethodPrint);
	}
	
	public void constructorMethodReferenceExample(List<String> names)
	{
		System.out.println("constructorMethodReferenceExample=>");
		names.forEach(MethodReferenceDemo::new);
	}
	
	
	
	public void instanceMethodPrint(String msg)
	{
		System.out.println(msg);
	}
	
	public static void staticMethodPrint(String msg)
	{
		System.out.println(msg);
	}
}
