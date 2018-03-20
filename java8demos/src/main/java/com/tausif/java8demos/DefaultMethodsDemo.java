package com.tausif.java8demos;

public class DefaultMethodsDemo implements Vehicle, FourWheeler
{
	@Override
	public void print() {
		FourWheeler.super.print();
		Vehicle.super.print();
	}
	
	public static void main(String[] args)
	{
		Vehicle v=new DefaultMethodsDemo();
		v.print();
		Vehicle.blowHorn();
	}
	
}

interface Vehicle 
{ 
	default void print()
	{
		System.out.println("I am a Vehicle!");
	} 
	
	public static void blowHorn()
	{
		System.out.println("Vehicle blowing Horn");
	}
}

interface FourWheeler{

	default void print()
	{
		System.out.println("I am a FourWheeler");
	}
	
}