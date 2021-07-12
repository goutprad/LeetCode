package com.dsa.practice.leetcode.easy;

public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        String title = "AB";
        System.out.println(titleToNumber(title));
    }
    public static int titleToNumber(String title){
        int result=0;
        int titleLength = title.length();
        for (int i=0;i<titleLength;i++){
            result = result*26;
            System.out.println(title.charAt(i) - 'A');
            result += title.charAt(i) - 'A'+1;
        }
        return result;
    }
}
