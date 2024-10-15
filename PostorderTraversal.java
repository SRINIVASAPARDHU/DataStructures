package com.ssp.DataStructures;

class Node2 {
 int value;
 Node2 left;
 Node2 right;
 
 Node2(int val) {
     value = val;
     left = null;
     right = null;
 }
}

class PostorderTraversal{
 
 public static void PostorderTraversal(Node2 node) {
     if (node == null) {
         return;
     }
     
     PostorderTraversal(node.left);
     PostorderTraversal(node.right);
     System.out.print(node.value + " ");
 }
 
 public static void main(String[] args){
     Node2 root = new Node2(1);
     root.left = new Node2(2);
     root.right = new Node2(3);
     root.left.left = new Node2(4);
     root.left.right = new Node2(5);
     
     System.out.print("Postorder Traversal: ");
     PostorderTraversal(root);
 }
}