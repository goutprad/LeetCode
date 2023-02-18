package com.dsa.lb.stack;

public class Stack {
    private int[] arr;
    private int top;
    private int capacity;
    Stack(int size){
        arr = new int[size];
        capacity = size;
        top = -1;
    }

}
