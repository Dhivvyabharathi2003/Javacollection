package com.model;

import java.util.Arrays;
import java.util.List;

public class StreamExample2 {
  public static void main(String[] args) {
	  List<Integer> prices=Arrays.asList(100,200,300,400,500);
	  //Old way
	   for(Integer s:prices) {
		   System.out.println(s);
	   }
	  //new way
	  prices.forEach(System.out::println);
	  
	  //old way
	  for(Integer p:prices) {
		  Double d=p+ .12*p;
		  System.out.println(d);
	  }
	  /// new way
	  prices.stream().map(p -> p + .12 * p).forEach(System.out::println);
	  
	  
  }
}
