package org.trevreport.practice;

public class FizzBuzz {

	public FizzBuzz() {}
	
	public void play(int times) {
		for (int i = 1; i <= times; i++) {
			if (i % 3 == 0) {
				System.out.print("Fizz");
				
				if (i % 5 == 0) {
					System.out.print(" ");
				}
			}
			if (i % 5 == 0) {
				System.out.print("Buzz");
			}
			if (i % 3 != 0 && i % 5 != 0) {
				System.out.print(i);
			}
			if (i < times) {
				System.out.print(", ");
			}
		}
		System.out.print("\n");
	}
	
}
