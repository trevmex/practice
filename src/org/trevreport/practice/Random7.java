package org.trevreport.practice;
import java.util.Date;
import java.util.Random;

public class Random7 {

	private Random rand;
	
	public Random7() {
		Date d = new Date();
		
		rand = new Random(d.getTime());
	}
	
	private int random5() {
		return rand.nextInt(5) + 1;
	}
	
	public int random7() {
		int a = random5(),
			b = random5();
		
		return a + b > 7 ? a : a + b;
	}	

}
