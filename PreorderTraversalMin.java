package com.ssp.DataStructures;

	class Node6 {
	 int value;
	 Node6 left;
	 Node6 right;
	 
	 Node6(int val) {
	     value = val;
	     left = null;
	     right = null;
	 }
	}
	public class PreorderTraversalMin{
	 static int min = Integer.MAX_VALUE;
	 public static void PreorderTraversal(Node6 node) {
	     if (node == null) {
	         return;
	     }
	     if(node.value < min)
	     {
	    	 min = node.value;
	     }
	    	 PreorderTraversal(node.left);
	     PreorderTraversal(node.right);
	 }
	 
	 public static void main(String[] args){
	     Node6 root = new Node6(11);
	     root.left = new Node6(2);
	     root.right = new Node6(3);
	     root.left.left = new Node6(4);
	     root.left.right = new Node6(5);
	     
	     PreorderTraversal(root);
	     System.out.println("Minimum value:"+min);
	 }
}
	
