package com.gl.lab2Q2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int NumofDenomincations;
		int ArrofDenominations[];
		int AmountToPay;
		
		System.out.println("enter the size of currency denominations");
		NumofDenomincations = scan.nextInt();
		ArrofDenominations = new int[NumofDenomincations];
		
		System.out.println("enter the currency denominations value");
		for(int i=0; i<NumofDenomincations; i++) {
			ArrofDenominations[i] = scan.nextInt();
		}
		
		System.out.println("enter the amount you want to pay");
		AmountToPay = scan.nextInt();
		
		Denomination denom = new Denomination();
		
		denom.ArraySort(ArrofDenominations);
		denom.ApproachToPay(ArrofDenominations, AmountToPay);
	}

}
