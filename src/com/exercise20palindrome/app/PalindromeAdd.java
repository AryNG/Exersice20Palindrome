package com.exercise20palindrome.app;
import com.exercise20palindrome.model.*;
public class PalindromeAdd {

	public static void main(String[] args) {
		String palindrome1 = "Anita lava la tina.";
		String palindrome2 = "Yo dono rosas, oro no doy!!!";
		String palindrome3 = "isaac no ronca asi.";
		
		System.out.println(StringApplications.isPalindrome(palindrome1));
		System.out.println(StringApplications.isPalindrome(palindrome2));
		System.out.println(StringApplications.isPalindrome(palindrome3));
		
		/*STACKS*/
		System.out.println("\n");
		System.out.println(StringApplications.isPalindromeStack(palindrome1));
		System.out.println(StringApplications.isPalindromeStack(palindrome2));
		System.out.println(StringApplications.isPalindromeStack(palindrome3));
		

	}

}
