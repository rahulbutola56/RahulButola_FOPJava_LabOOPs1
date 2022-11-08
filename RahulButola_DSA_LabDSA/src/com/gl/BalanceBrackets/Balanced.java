package com.gl.BalanceBrackets;

import java.util.Stack;

public class Balanced {
	
	void isBalanced(String input){
		Stack<Character> stack= new Stack<Character>();
		
		for(int i=0; i<input.length(); i++) {
			char valueAti = input.charAt(i);
			if(valueAti == '(' || valueAti == '[' || valueAti == '{') {
				stack.push(valueAti);
			}
			else {
				if(stack.isEmpty()) {
					System.out.println("The entered Strings do not contain Balanced Brackets.");
					return;
				}
				char top = stack.peek();
				if ( (top == '('  && valueAti == ')') || (top == '['  && valueAti == ']') || (top == '{'  && valueAti == '}') ) {
					stack.pop();
				}
			}
		}
		if(stack.isEmpty()) {
			System.out.println("The entered String has Balanced Brackets");
		} else {
			System.out.println("The entered Strings do not contain Balanced Brackets.");
		}
	}
}
