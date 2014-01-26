package org.trevreport.practice;

import java.util.HashSet;
import java.util.Set;

public class FindChars {
	private String string1;
	private String string2;
	
	public FindChars(String string1, String string2) {
		this.string1 = string1;
		this.string2 = string2;
	}
	
	public String findCharsN() {
		StringBuilder builder = new StringBuilder();
		Set<Character> set1 = new HashSet<Character>(),
					   set2 = new HashSet<Character>();
		int i;
		
		for (i = 0; i < string2.length(); i++) {
			set2.add(string2.charAt(i));
		}
		
		for (i = 0; i < string1.length(); i++) {
			if (set2.contains(string1.charAt(i))) {
				if (!set1.contains(string1.charAt(i))) {
					set1.add(string1.charAt(i));
					builder.append(string1.charAt(i));
				}				
			}
		}
		
		return builder.toString();
	}
	
	public String findCharsN2() {
		StringBuilder builder = new StringBuilder();
		int i, j;
		
		for (i = 0; i < string1.length(); i++) {
			for (j = 0; j < string2.length(); j++) {
				if (string2.charAt(j) == string1.charAt(i)) {
					builder.append(string1.charAt(i));
					j = string2.length();
				}
			}
		}
		
		return builder.toString();
	}

}
