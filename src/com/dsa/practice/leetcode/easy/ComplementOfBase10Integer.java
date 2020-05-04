package com.dsa.practice.leetcode.easy;

/**
 * 1009. Complement of Base 10 Integer
 * https://leetcode.com/problems/complement-of-base-10-integer/
 * 
 * @author Goutam
 *
 */
public class ComplementOfBase10Integer {
	public int bitwiseComplement(int N) {
		if (N == 0)
			return 1;
		int res = 0;
		int i = 0;
		while (N != 0) {
			if ((N & 1) == 0) {
				res += 1 << i;
			}
			i += 1;
			N >>= 1;
		}
		return res;
	}

	public static void main(String[] args) {
		ComplementOfBase10Integer leet = new ComplementOfBase10Integer();
		System.out.println(leet.bitwiseComplement(5)); //2
	}

}
