package org.trevreport.practice;

import java.util.regex.Pattern;


public class Main {
	
	public static void main(String[] args) {
		emailRegex();
		
		fizzBuzz();
		
		reverseString(args);
		
		random7();		

		hasSum();		
		
		binaryTreePrinters();
	}

	private static void emailRegex() {
		Pattern p = Pattern.compile("^(([\\p{Alnum}._-]+|\".*\")\\+)?([\\p{Alnum}._-]+|\".*\")@([\\p{Alnum}-]+\\.)+\\p{Alpha}+$");
		
		System.out.println(!p.matcher("me@notvalid").matches());
		System.out.println(!p.matcher("me@ex ample.com").matches());
		System.out.println(!p.matcher("me@example.c0m").matches());
		System.out.println(p.matcher("me@example.com").matches());
		System.out.println(p.matcher("me2@example.com").matches());
		System.out.println(p.matcher("me@ex-ample.com").matches());
		System.out.println(p.matcher("me.you@example.com").matches());
		System.out.println(p.matcher("me_you@example.com").matches());
		System.out.println(p.matcher("me-you@example.com").matches());
		System.out.println(p.matcher("me@the.example.com").matches());
		System.out.println(p.matcher("test+me@example.com").matches());
		System.out.println(p.matcher("test+\"my name\"@example.com").matches());
		System.out.println(p.matcher("\"my name\"@example.com").matches());
		System.out.println(p.matcher("test+\"my name\"@example.com").matches());
		System.out.println(p.matcher("\"test it\"+\"my name\"@example.com").matches());
	}

	private static void fizzBuzz() {
		FizzBuzz fb = new FizzBuzz();
		
		fb.play(32);
	}

	private static void binaryTreePrinters() {
		Node<String> tree = new BinaryTreeBuilder().build();
		BinaryTreePrinter<String> printer = new BinaryTreePrinter<String>(tree);
		
		printer.printDepthFirst();
		printer.printBreadthFirst();
	}

	private static void hasSum() {
		int[] arr = {1, 3, 7, 9};
		SumChecker sumCheck = new SumChecker(arr);
		
		System.out.println("5 (false) == " + sumCheck.hasSum(5));		
		System.out.println("4 (true) == " + sumCheck.hasSum(4));		
		System.out.println("12 (true) == " + sumCheck.hasSum(12));		
		System.out.println("30 (false) == " + sumCheck.hasSum(30));
	}

	private static void random7() {
		System.out.println(new Random7().random7());
	}

	private static void reverseString(String[] args) {
		ReverseString rString = new ReverseString(args[0]);
		
		System.out.println(args[0] + " == " + rString.reverse());
		System.out.println(args[0] + " == " + rString.iReverse());
		System.out.println(args[0] + " == " + rString.rReverse());
	}

}
