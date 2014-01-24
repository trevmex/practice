package org.trevreport.practice;
import java.util.HashSet;
import java.util.Set;

public class SumChecker {
	
	private int[] arr;
	
	public SumChecker(int[] arr) {
		this.arr = arr;
	}

	public boolean hasSum(int sum) {
		Set<Integer> set = new HashSet<Integer>();
		int i;
		
		for (i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		
		for (i = 0; i < arr.length; i++) {
			if (set.contains(sum - arr[i])) {
				return true;
			}
		}
		
		return false;
	}	

}
