package com.dsa.lb.tree;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumElementTree {
    public TreeNode root;
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }



    }

    public static void main(String[] args) {

    }

    public void insertVoid(int data){
        TreeNode newNode = new TreeNode(data);
        if (root == null){
            root = newNode;
            return;
        } else {
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);

            while (true){
                TreeNode node = queue.remove();
            }
        }
    }

    public static void inOrder(TreeNode root){
        if(root == null )
            return;
        inOrder(root.left);
        System.out.println("Node: "+root.val);
        inOrder(root.right);
    }

    public static void findMaximumNode(){

    }
}
