package com.kodnest.numberprogramming;

public class productoddnumber {
	public static void main(String[]args) {
		int product=1;
		for(int i=1; i<=6; i++) {
			if(i%2==1) {
				product=product*i;
			}
		}
		
		System.out.println(product);
}
}
	
