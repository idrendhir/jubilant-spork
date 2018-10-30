package com.howicode.codewars;

/*
 * In this little assignment you are given a string of space separated numbers,
 * and have to return the highest and lowest number.
 * 
 * Example:
 *  HighAndLow("1 2 3 4 5") // return "5 1"
 *  HighAndLow("1 2 -3 4 5") // return "5 -3"
 *  HighAndLow("1 9 3 4 -5") // return "9 -5"
 * 
 * Notes:
 *  - All numbers are valid Int32, no need to validate them.
 *  - There will always be at least one number in the input string.
 *  - Output string must be two numbers separated by a single space, and highest number first.
 *  
 *  src: https://www.codewars.com/kata/554b4ac871d6813a03000035
 * */
public class HighestAndLowest {
	
	public static String highAndLow(String numbers) {
		String[] arr = numbers.split(" ");
		int highest = 0, lowest = 0;
		boolean init = false;
		for(int i = 0; i < arr.length; i++) {
			int num = Integer.parseInt(arr[i]);
			if(!init) {
				highest = num;
				lowest = num;
				init = true;
			}
			if(num > highest) {
				highest = num;
			}
			if(num < lowest) {
				lowest = num;
			}
		}
		return highest + " " + lowest;
	}
}
