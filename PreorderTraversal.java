package com.ssp.DataStructures;

class Node1 {
 int value;
 Node1 left;
 Node1 right;
 
 Node1(int val) {
     value = val;
     left = null;
     right = null;
 }
}
public class PreorderTraversal{
 
 public static void PreorderTraversal(Node1 node) {
     if (node == null) {
         return;
     }
     
     System.out.print(node.value + " ");
     PreorderTraversal(node.left);
     PreorderTraversal(node.right);
 }
 
 public static void main(String[] args){
     Node1 root = new Node1(1);
     root.left = new Node1(2);
     root.right = new Node1(3);
     root.left.left = new Node1(4);
     root.left.right = new Node1(5);
     
     System.out.print("Pre-order Traversal: ");
     PreorderTraversal(root);
 }
}
