package com.dsa.practice.leetcode.medium;

import java.util.Stack;
/**
 * https://leetcode.com/problems/valid-parenthesis-string/
 * 678. Valid Parenthesis String
 * 
 * Given a string containing only three types of characters: '(', ')' and '*', write a function to check whether this string is valid. We define the validity of a string by these rules:
 * Any left parenthesis '(' must have a corresponding right parenthesis ')'.
 * Any right parenthesis ')' must have a corresponding left parenthesis '('.
 * Left parenthesis '(' must go before the corresponding right parenthesis ')'.
 * '*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string.
 * An empty string is also valid.
 * 
 * @author Goutam
 *
 */

public class ValidParenthesisString {
	public boolean checkValidString(String s) {
		Stack<Integer> openBracket = new Stack<Integer>();
		Stack<Integer> starStack = new Stack<Integer>();
	
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '(') {
				openBracket.push(i);
			} else if(s.charAt(i) == '*') {
				starStack.push(i);
			} else {
				if(!openBracket.isEmpty()) {
					openBracket.pop();
				} else if(!starStack.isEmpty()) {
					starStack.pop();
				} else {
					return false;
				}
				
			}
		}
		while(!openBracket.isEmpty()) {
			if(starStack.isEmpty()) {
				return false;
			}else if(openBracket.peek() < starStack.peek()) {
				openBracket.pop();
				starStack.pop();
			} else {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		ValidParenthesisString leet = new ValidParenthesisString();
		String s = "(((((*(()((((*((**(((()()*)()()()*((((**)())*)*)))))))(())(()))())((*()()(((()((()*(())*(()**)()(())";
		System.out.println(leet.checkValidString(s));
	}
}
