package com.howicode.codewars;

/*
 * You are going to be given an array of integers. Your job is to take that array and find an index N 
 * where the sum of the integers to the left of N is equal to the sum of the integers to the right of N. 
 * If there is no index that would make this happen, return -1.
 * 
 * Let's say you are given the array {1,2,3,4,3,2,1}. Your function will return the index 3, because at 
 * the 3rd position of the array, the sum of left side of the index ({1,2,3}) and the sum of the right 
 * side of the index ({3,2,1}) both equal 6.
 * 
 * Let's look at another one. You are given the array {1,100,50,-51,1,1}. Your function will return the index 1, 
 * because at the 1st position of the array, the sum of left side of the index ({1}) and the sum of the 
 * right side of the index ({50,-51,1,1}) both equal 1.
 * 
 * Input:
 *  An integer array of length 0 < arr < 1000. The numbers in the array can be any integer positive or negative.
 * 
 * Output:
 *  The lowest index N where the side to the left of N is equal to the side to the right of N. If you do not find 
 *  an index that fits these rules, then you will return -1.
 * 
 * Note:
 *  - Please remember that in most programming/scripting languages the index of an array starts at 0.
 *  - If you are given an array with multiple answers, return the lowest correct index.
 *  - An empty array should be treated like a 0 in this problem.
 *  
 *  src: https://www.codewars.com/kata/5679aa472b8f57fb8c000047
 * */
public class EqualSidesOfAnArray {
	
	public static int findEvenIndex(int[] arr) {
		for(int i = 1; i <= arr.length-2; i++) {
			int leftSum = 0;
			int rightSum = 0;
			for(int j = i-1; j >= 0; j--){	
				leftSum += arr[j];
			}
			for(int k = i+1; k < arr.length; k++){	
				rightSum += arr[k];
			}
			if(rightSum == leftSum) {
				return i;
			}
		}
		return -1;
	}
}
