package com.model;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamIntermediateOPerationsExamples {
    public static void main(String [] args) {
    	//List of lists of names
    	List<List<String>> listOfLists = Arrays.asList(
    			Arrays.asList("Reflection","Collection","Stream"),
    			Arrays.asList("Structure","Stage","Flow"),
    			Arrays.asList("Sorting","Mapping","Reduction","Stream")
    			);
    	
    	//Create a set to hold intermediate results
    	Set <String>intermediateResults = new HashSet<>();
    	
    	//Stream pipeline demonstarting various intermediate operations
    	List <String>result = listOfLists.stream()
    			.flatMap(List::stream)
    			.filter(s -> s.startsWith("S"))
    			.map(String::toUpperCase)              
    			.distinct()
    			.sorted()
    			.peek(s -> intermediateResults.add(s))
    			.collect(Collectors.toList());
    	
    	//Print the intermediate results
    	System.out.println("Intermediate Results:");
    	intermediateResults.forEach(System.out::println);
    	
    	//print the final result
    	System.out.println("Final Result:");
    	result.forEach(System.out::println);
    }
}
