package com.kodnest.AlphabeticPattren;

public class PrintU {
public static void main(String[] args) {
	for(int i=1;i<=8;i++) {
		for(int j=1;j<=11;j++) {
			if(i==8 || j==1 || j==11) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
}
		System.out.println();
}
}
}