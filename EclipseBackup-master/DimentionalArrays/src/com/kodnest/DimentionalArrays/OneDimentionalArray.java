package com.kodnest.DimentionalArrays;

import java.util.Scanner;

public class OneDimentionalArray {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("User! enter the number of students:");
	int n =scanner.nextInt();
	int []marks=new int[n];
	System.out.println("User! enter the marks of the students:");
	for(int i=0;i<=marks.length-1;i++) {
		marks[i]=scanner.nextInt();
		
	}
	System.out.println("the marks of"+n+"students are");
	for(int i=0;i<=marks.length-1;i++) {
		System.out.println(marks[i]);
	}
}
}
