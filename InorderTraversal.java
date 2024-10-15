package com.ssp.DataStructures;

class Node {
 int value;
 Node left;
 Node right;
 
 Node(int val) {
     value = val;
     left = null;
     right = null;
 }
}

class InorderTraversal{
  public static void inorderTraversal(Node node) {
     if (node == null) {
         return;
     }
     
     inorderTraversal(node.left);
     System.out.print(node.value + " ");
     inorderTraversal(node.right);
 }
 
 public static void main(String[] args) {
     Node root = new Node(1);
     root.left = new Node(2);
     root.right = new Node(3);
     root.left.left = new Node(4);
     root.left.right = new Node(5);
     
     System.out.print("Inorder Traversal: ");
     inorderTraversal(root);
 }
}