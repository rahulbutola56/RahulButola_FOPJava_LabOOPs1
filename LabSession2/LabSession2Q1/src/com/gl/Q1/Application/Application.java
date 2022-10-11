package com.gl.Q1.Application;

import java.util.Scanner;

import com.gl.Q1.Transaction.Transaction;

public class Application {

	public static void main(String args[]) throws Exception {

	int size;
	int targetNo;
	int targetValue;
	
	Scanner take = new Scanner(System.in);
	Transaction trans = new Transaction();
	
	System.out.println("enter the size of transaction array");
	size = take.nextInt();
	int ValuesArr[] = new int[size];
	
	System.out.println("enter the values of array");
	for (int i = 0; i < size; i++) {
		ValuesArr[i] = take.nextInt();
	}
	
	System.out.println("enter the total no of targets that needs to be achieved");
	targetNo = take.nextInt();
	
	for(int i=0; i<targetNo; i++)
	{
		System.out.println("\nEnter the value of targt");
		targetValue = take.nextInt();
		trans.checkTarget(ValuesArr, targetValue);
	}

	}
}
