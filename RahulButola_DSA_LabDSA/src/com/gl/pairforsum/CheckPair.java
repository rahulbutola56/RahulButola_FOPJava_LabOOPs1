package com.gl.pairforsum;

import java.util.HashSet;

public class CheckPair {
	void SumOfPair(int sum, Node root) {
		HashSet<Integer> set = new HashSet<>();
		if(!SumOfPair(set, root, sum))
			System.out.println("nodes are not found");
		
	}
	
	boolean SumOfPair(HashSet set, Node root, int sum) {
		if (root == null)
			return false;
		else if (SumOfPair(set, root.left, sum))
			return true;
		else if(set.contains(sum - root.data)) {
			System.out.println("Pair is ("+(sum - root.data)+", "+root.data+")");
			return true;
		}
		else
			set.add(root.data);
		
		return SumOfPair(set, root.right, sum);
	}
}
