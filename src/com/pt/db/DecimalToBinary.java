package com.pt.db;

public class DecimalToBinary {

	public static void main(String[] args) {
		int i=111;
		//int temp=0;
		int a=0;
		int base=1;
		while(i>0) {
			int temp=i%10;
			a=a+temp*base;
			i=i/10;		
			base=base*2;
		}
		System.out.println(a);
	}
}
