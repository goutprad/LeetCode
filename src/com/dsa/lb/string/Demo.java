package com.dsa.lb.string;

public class Demo {
    public static void main(String[] args) {
        System.out.println(isPallindrome("TAT"));
        System.out.println(changeClock("23"));
    }
    public static boolean isPallindrome(String str){
        String rev = "";
        boolean flag = false;
       for (int i=str.length()-1; i >= 0; i--){
           rev = rev + str.charAt(i);
       }
       if (str.equalsIgnoreCase(rev)){
           flag =  true;
       }
        return flag;
    }
    public static String changeClock(String inp) {
        //int a = Integer.parseInt(inp);
        String[] time = inp.split("\\.");
        int i=0;
        int num = 0;
        String hour = time[0];
        String minute = inp.split("\\.")[1];
        while( i < hour.length()) {
            num *= 10;
            num += hour.charAt(i++) - '0';
        }

        if(num>12){
            num %= 12;
            return num+"."+minute+" PM";
        } else {
            return num +"."+minute+ "AM";
        }
    }
}
