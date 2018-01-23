package com;

import java.util.Arrays;

public class ReverseString {

	public String reverseString(String str) {
		if (str.length() == 0)
			return str;
		return str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
	}

	public void isPalindrome(String str1, String str2) {
		if (str1.equals(str2))
			System.out.println("String is plaindrome");
		else
			System.out.println("String is not palindrome");
	}

	public void isAnagram(String str1, String str2) {
		char[] char1 = str1.toCharArray();
		char[] char2 = str2.toCharArray();
		Arrays.sort(char1);
		System.out.println("sort"+char1.toString());
		boolean result = Arrays.equals(char1, char2);
		if(result)
			System.out.println("yes it is anagram");
		else
			System.out.println("not anagram");
	}

	public static void main(String[] args) {
		String str = "dadrtuj";
		ReverseString rs = new ReverseString();
		System.out.println("Reverse String is  " + rs.reverseString(str));
		System.out.println("Reverse String is  " + rs.reverseString(str).length());
		//rs.isPalindrome(str, rs.reverseString(str));
		//rs.isAnagram(str, "add");

	}
}
