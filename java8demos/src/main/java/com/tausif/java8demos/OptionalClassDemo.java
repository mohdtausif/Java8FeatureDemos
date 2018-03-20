package com.tausif.java8demos;

import java.util.Optional;

public class OptionalClassDemo {
	public static void main(String[] args)
	{
		OptionalClassDemo optionalClassDemo=new OptionalClassDemo();
		Optional<Integer> a=Optional.ofNullable(null);
		Optional<Integer> b=Optional.ofNullable(10);
		optionalClassDemo.sum(a, b);
	}

	private void sum(Optional<Integer> a, Optional<Integer> b) 
	{
		System.out.println("Is 'a' first value present : "+a.isPresent());
		System.out.println("Is 'b' second value present : "+b.isPresent());
		
		int n1 = a.orElse(0);
		int n2 = b.orElse(0);
		
		int sum = n1 + n2;
		
		System.out.println("Sum : "+sum);
	}
}
