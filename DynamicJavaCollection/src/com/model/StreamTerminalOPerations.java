package com.model;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamTerminalOPerations {
    public static void main(String[] args) {
    	List<String>names = Arrays.asList(
    			"Reflection","Collection","Stream",
    			"Structure","Sorting","State"
    			);
    	System.out.println("forEach:");
    	names.stream().forEach(System.out::println);
    	
    	//:: - method call operator
    	// collect: collect names starting with'S' into a list
    	List<String> sNames = names.stream()
    			.filter(name -> name.startsWith("S"))
    			.collect(Collectors.toList());
    	System.out.println("\ncollect(names staring with 'S'):");
    	sNames.forEach(System.out::println);
    	
    	// reduce: Cocatenate all names into a single string

    	String conactenatedNames = names.stream().reduce(
    			"",
    			(partialString,element) -> partialString+" "+element);
    	System.out.println("\nreduce(concatenated names):");
    	System.out.println(conactenatedNames.trim());
    	
    	//count:count the number of names
        long count=names.stream().count();
        System.out.println("\nCount");
        System.out.println(count);
         
      //findFirst:find the first name
        Optional<String> firstName=names.stream().findFirst();
        System.out.println("\nfindFirst:");
        firstName.ifPresent(System.out::println);
        //allMatch:check if all names starts with'S'
        boolean allStartWithS=names.stream().allMatch(name->name.startsWith("S"));
        System.out.println("\nallMatch (all start with 'S'):");
        System.out.println(allStartWithS);
         
      //anyMatch:check if any name starts with'S'
        boolean anyStartWithS=names.stream().anyMatch(name->name.startsWith("S"));
        System.out.println("\nanyMatch (any start with 'S'):");
        System.out.println(anyStartWithS);

    }
    
}
