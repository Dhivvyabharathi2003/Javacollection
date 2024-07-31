package com.examples;


    @FunctionalInterface
	interface Mysam{
		void show();
		String toString();
	} 
    class A extends Object implements Mysam{
    	@Override public void show() {
    		System.out.println("HI ALL");
    	}
    }
    public class Main {
    	public static void main(String[] args) {
//    		Mysam m= new A();
//    		m.show();
    		Mysam m=() -> System.out.println("HELOO");
    		m.show();
    	}
}
