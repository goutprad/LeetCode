package com.dsa.practice.leetcode.easy;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * 387. First Unique Character in a String
 * https://leetcode.com/problems/first-unique-character-in-a-string/
 * 
 * @author Goutam
 *
 */
public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            } else {
                map.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }
	public static void main(String[] args) {
		FirstUniqueCharacterInAString leet = new FirstUniqueCharacterInAString();
		System.out.println(leet.firstUniqChar("loveleetcode")); //2
	}

}
