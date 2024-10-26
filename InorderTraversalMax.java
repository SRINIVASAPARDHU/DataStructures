package com.ssp.DataStructures;

class Node5 {
    int value;
    Node5 left;
    Node5 right;

    Node5(int val) {
        value = val;
        left = null;
        right = null;
    }
}

public class InorderTraversalMax {
    static int max = Integer.MIN_VALUE;

    public static void inorderTraversal(Node5 node) {
        if (node == null) {
            return;
        }

        inorderTraversal(node.left);

        if (node.value > max) {
            max = node.value;
        }

        inorderTraversal(node.right);
    }

    public static void main(String[] args) {
        Node5 root = new Node5(1);
        root.left = new Node5(2);
        root.right = new Node5(3);
        root.left.left = new Node5(4);
        root.left.right = new Node5(5);

        inorderTraversal(root);
        System.out.println("Highest Value: " + max);
    }
}
