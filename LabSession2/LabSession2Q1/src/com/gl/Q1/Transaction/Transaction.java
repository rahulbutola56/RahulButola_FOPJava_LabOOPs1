package com.gl.Q1.Transaction;

public class Transaction {
	
	public void checkTarget(int ValuesArr[], int targetValue) {
		int sum = 0;
		for(int i = 0; i<ValuesArr.length; i++) {
			sum = sum + ValuesArr[i];
			if(sum>=targetValue) {
				System.out.println("Target acheieved after " + (i+1) + " transactions");;
				break;
			}
		}
		if(sum<targetValue)
			System.out.println("Target not achieved");
	}
}
