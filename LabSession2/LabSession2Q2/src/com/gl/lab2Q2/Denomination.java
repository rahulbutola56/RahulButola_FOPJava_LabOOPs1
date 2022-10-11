package com.gl.lab2Q2;

public class Denomination {
	int i=0;
	int j, k;
	
	void ApproachToPay(int ArrofDenominations[], int AmountToPay){
		int SizeofArr = ArrofDenominations.length;
		int result[] = new int[ArrofDenominations.length];
		
		for(int i=0; i<SizeofArr; i++) {
			if(ArrofDenominations[i]<=AmountToPay) {
				result[i] = AmountToPay/ArrofDenominations[i];
				AmountToPay = AmountToPay % ArrofDenominations[i];
			}
		}
		if(AmountToPay>0) {
			System.out.println("Amount is greater, can't fully pay");
		}
		else {
			System.out.println("Your payment approach in order to give min no of notes will be");
			for(int i=0; i<result.length; i++)
				if(result[i]!=0) {
					System.out.println(ArrofDenominations[i]+ ":" +result[i]);
				}
		}
	}
	
	void ArraySort(int ArrofDenominations[]) {
		int SizeofArr = ArrofDenominations.length;
		int TempArrValue;
		
		for(i=0; i<SizeofArr-1; i++) {
			for(j=0; j<SizeofArr-i-1; j++) {
				if(ArrofDenominations[j]<ArrofDenominations[j+1]) {
					
					TempArrValue = ArrofDenominations[j];
					ArrofDenominations[j] = ArrofDenominations[j+1];
					ArrofDenominations[j+1] = TempArrValue;
				}
			}
		}
	}

}
