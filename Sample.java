package com.test;

public class Sample {
	public static void main(String[] args) {
		int num =16;
		for(int i=0;i<=num;i++) {
			if(i%4==0) {
				continue;
			}else {
				System.out.println(i);
			}
		}
	}

}
