package com.howicode.codewars;

/*
 * Write a function that takes an integer as input, and returns the number of bits that are equal
 * to one in the binary representation of the number. You can guarantee the input is non-negative.
 * 
 * Example: The binary representation of 1234 is 10011010010, so the function should return 5 in this case.
 * 
 * src: https://www.codewars.com/kata/526571aae218b8ee490006f4
 * */
public class BitCounting {
	
	public static int countBits(int n) {
		int bitCount = 0;
		while(n != 0) {
			if((n&1) == 1) {
				bitCount++;
			}
			n >>>= 1;
		}
		return bitCount;
	}
}
