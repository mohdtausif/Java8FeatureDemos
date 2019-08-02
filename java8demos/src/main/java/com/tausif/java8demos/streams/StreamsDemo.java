package com.tausif.java8demos.streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamsDemo {
	public static void main(String[] args)
	{
		StreamsDemo streamsDemo=new StreamsDemo();
		streamsDemo.filterEmptyStrings();
		streamsDemo.print10RandomNumber();
		streamsDemo.printsUniqueSquaresOfNumbers();
		streamsDemo.print10RandomNumberInSortedOrder();
		streamsDemo.getCountOfEmptyStrings();
		streamsDemo.returnStringByCollector();
		streamsDemo.getStatistics();
	}
	
	public void getStatistics()
	{
		System.out.println("Statistics=>");
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		IntSummaryStatistics stats = numbers.stream().mapToInt((x)->x).summaryStatistics();
		System.out.println("Highest number in List : " + stats.getMax());
		System.out.println("Lowest number in List : " + stats.getMin());
		System.out.println("Sum of all numbers : " + stats.getSum());
		System.out.println("Average of all numbers : " + stats.getAverage());
	}
	public void returnStringByCollector()
	{
		System.out.println("Merge Strings by Collector Using Stream=>");
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		String str = 
				strings.stream()
				.collect(Collectors.joining("<>"));
				
		
		System.out.println("Merged String : "+str);
	}
	
	public void getCountOfEmptyStrings()
	{
		System.out.println("Get Count of empty string Using Stream=>");
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		long count = 
				strings.parallelStream()
				.filter(string ->string.isEmpty())
				.count();
		
		System.out.println("CountOfEmptyStrings : "+count);
	}
	
	public void print10RandomNumberInSortedOrder()
	{
		System.out.println("Printing 10 Random Numbers in Sorted Order Using Stream=>");
		Random random = new Random();
		random.ints().limit(10).sorted().forEach(System.out::println);
	}
	
	public void printsUniqueSquaresOfNumbers()
	{
		System.out.println("Print unique square of numbers using Stream=>");
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		List<Integer> squaresList = numbers.stream()
				.map( i ->i*i)
				.distinct()
				.collect(Collectors.toList());
		squaresList.forEach(System.out::println);
	}
	
	public void print10RandomNumber()
	{
		System.out.println("Printing 10 Random Numbers Using Stream=>");
		Random random = new Random();
		random.ints().limit(10).forEach(System.out::println);
	}
	
	public void filterEmptyStrings()
	{
		System.out.println("Removing empty string Using Stream=>");
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		List<String> filtered = 
				strings.stream()
				.filter(string ->!string.isEmpty())
				.collect(Collectors.toList());
		
		filtered.forEach(System.out::println);
	}
}
