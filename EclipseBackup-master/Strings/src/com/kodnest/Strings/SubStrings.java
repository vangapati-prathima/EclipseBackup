package com.kodnest.Strings;

import java.util.Iterator;
import java.util.Scanner;

public class SubStrings {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the String");
	String s=scanner.nextLine();
	for (int i = 0; i < s.length(); i++) {
		for (int j = i+1; j <=s.length(); j++) {
			System.out.println(s.substring(i,j));
		}
	}
}
}


