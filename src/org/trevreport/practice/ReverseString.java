package org.trevreport.practice;

public class ReverseString {

	private String original;
	
	public ReverseString(String original) {
		this.original = original;
	}
	
	public String reverse() {
		StringBuilder builder = new StringBuilder(original);
		
		return builder.reverse().toString();
	}
	
	public String iReverse() {
		int i;
		StringBuilder builder = new StringBuilder();
		
		for (i = original.length() - 1; i >= 0; i--) {
			builder.append(original.charAt(i));
		}
		
		return builder.toString();
	}

	public String rReverse() {
		return recurse(original.length() - 1, new StringBuilder());
	}
	
	private String recurse(int i, StringBuilder builder) {
		if (i < 0) {
			return builder.toString();
		} else {
			return recurse(i - 1, builder.append(original.charAt(i)));
		}
	}
	
}
