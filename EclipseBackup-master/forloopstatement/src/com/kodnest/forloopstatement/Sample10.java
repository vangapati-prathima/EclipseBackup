package com.kodnest.forloopstatement;

import java.util.Iterator;

public class Sample10 {
public static void main(String[] args) {
	int product=1;                               
	for (int i = 2; i <=5; i=i+2) {
		product=product*i;
	}
	System.out.println(product);
}
}
