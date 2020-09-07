#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Mon Sep  7 11:18:33 2020

@author: kevin
"""

"""
Hi, here's your problem today. This problem was recently asked by Apple:
Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white and blue.
Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
Note: You are not suppose to use the library’s sort function for this problem.
Can you do this in a single pass?
Example:
Input: [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]

Here's a starting point:
"""

class Solution:
  def sortColors(self, nums):
    # Fill this in.
    """
    #Here is my code, straightforward but not the most efficient
    num0 = nums.count(0)
    num1 = nums.count(1)
    num2 = nums.count(2)
    nums.clear()
    
    for i in range(num0):
        nums.append(0)
    for i in range(num1):
        nums.append(1)
    for i in range(num2):
        nums.append(2)
    
    """
    #Solution, sourced from https://www.geeksforgeeks.org/sort-an-array-of-0s-1s-and-2s/
    lo = 0
    hi = len(nums) - 1
    mid = 0
    while mid <= hi: 
        if nums[mid] == 0: 
            nums[lo], nums[mid] = nums[mid], nums[lo] 
            lo = lo + 1
            mid = mid + 1
        elif nums[mid] == 1: 
            mid = mid + 1
        else: 
            nums[mid], nums[hi] = nums[hi], nums[mid]  
            hi = hi - 1
    
            

nums = [0, 1, 2, 2, 1, 1, 2, 2, 0, 0, 0, 0, 2, 1]
print("Before Sort: ")
print(nums)
# [0, 1, 2, 2, 1, 1, 2, 2, 0, 0, 0, 0, 2, 1]

Solution().sortColors(nums)
print("After Sort: ")
print(nums)
# [0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2]