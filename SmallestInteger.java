/*This problem was recently asked by Facebook:
You are given an array of integers. Return the smallest positive integer that is not present in the array. The array may contain duplicate entries.
For example, the input [3, 4, -1, 1] should return 2 because it is the smallest positive integer that doesn't exist in the array.
Your solution should run in linear time and use constant space.
Here's your starting point: */

import java.util.Arrays;

class SmallestInteger{
	public static void main(String[] args){
		int[] nums = {3,4,-1,1};
		System.out.println(smallestInteger(nums)); //2
	}

	/**
	* This finds the smallest possible positive integer missing from a given array.
	*
	* @param arr This is an array of integers
	*
	* @return The smallest possible integer that is missing from the given array
	*/

	static int smallestInteger(int[] arr){
		Arrays.sort(arr);
		for(int i = 1; i < arr[arr.length-1]; i++){
			for(int j : arr){
				if(i == j){
					break;
				}else if(i < j){
					return i;
				}
			}
		}
		return(arr[arr.length-1] + 1);
	}
}