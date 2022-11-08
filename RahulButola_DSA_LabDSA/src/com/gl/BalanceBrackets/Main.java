package com.gl.BalanceBrackets;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		
		Balanced obj = new Balanced();
		Scanner scan = new Scanner(System.in);
		System.out.println("Input your String -> ");
		String input = scan.nextLine();
		
		obj.isBalanced(input);
	}
}
