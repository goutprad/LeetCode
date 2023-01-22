package com.dsa.practice.leetcode.medium;

import java.util.*;

public class PartitionsLabels {
    public static void main(String[] args) {
        List out = partitionLabels("ababcbaca defegdehijhklij");
        System.out.println(out);

    }
    public static List partitionLabels(String input) {
        List<Integer> partitionOut = new ArrayList();
        int max=0;
        int size = input.length();
        int i=0;
        int j=0;
        while(i<size){
            max = input.lastIndexOf(input.charAt(i));
            j=i;
            while(j<max){
                if(input.lastIndexOf(input.charAt(j)) > max) {
                    max = input.lastIndexOf(input.charAt(j));
                }
                j++;
            }
            partitionOut.add(max + 1 -i);
            i=j+1;
        }
        return partitionOut;
    }
}
