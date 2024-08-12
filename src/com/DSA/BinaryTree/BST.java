package com.DSA.BinaryTree;

public class BST {
    public static class Node {
        int value;
        Node left;
        Node right;
        int height;
        public Node(int value){
            this.value = value;
        }
        public int getValue() {
            return value;
        }
    }
    private Node root;
    public BST(){}
    public int height(Node node){
        if (node == null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void insert(int value){
        root = insert(value, root);
    }
    private Node insert(int value, Node node){
        if(node == null){
            node = new Node(value);
            return node;
        }
        if(value < node.value){
            node.left = insert(value, node.left);
        }
        if(value > node.value){
            node.right = insert(value, node.right);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return node;
    }

    public void populate(int[] arr){
        for (int i : arr) {
            this.insert(i);
        }
    }

    public boolean balanced(){
        return balanced(root);
    }

    private boolean balanced(Node node){
        if(node == null){
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void display() {
        display("Root Node : ", root);
    }

    private void display(String details, Node node){
        if (node == null){
            return;
        }
        System.out.println(details + node.getValue());
        display("Left child of " + node.getValue() + " : ", node.left);
        display("right child of " + node.getValue() + " : ", node.right );
    }

    public void preOrder() {
        preOrder(root);
    }
    private void preOrder(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public void inOrder() {
        inOrder(root);
    }
    private void inOrder(Node node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }
    public void postOrder() {
        postOrder(root);
    }
    private void postOrder(Node node){
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    public static void main(String[] args) {
        BST bst = new BST();
        bst.populate(new int[]{5, 3, 2, 4, 7, 6, 8, 9});
        bst.display();
        bst.preOrder();
        System.out.println();
        bst.inOrder();
        System.out.println();
        bst.postOrder();
        System.out.println();
        System.out.println(bst.balanced());
    }
}
