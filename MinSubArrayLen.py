ng #!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Tue Sep  1 10:59:47 2020

@author: kevin
"""

"""
This problem was recently asked by Amazon:
Given an array of n positive integers and a positive integer s, find the 
minimal length of a contiguous subarray of which the sum ≥ s. If there isn't o
ne, return 0 instead.
Example:
Input: s = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: the subarray [4,3] has the minimal length under the problem 
constraint.
Here is the method signature:
"""
class Solution:
  def minSubArrayLen(self, nums, s):
    result = []
    temp = []
    # Fill this in
    for i in range(len(nums)):
        for j in range(i, len(nums)):
            temp.append(nums[j])
            if(sum(temp) >= s):
                break                
        if(result):
            if(len(temp) < len(result) and sum(temp) >=s):
                result = temp
            temp = []
        else:
            result = temp
            temp = []
            
    if(sum(result) >= s):
        return len(result)
    else:
        return 0
            
                

print(Solution().minSubArrayLen([2, 3, 1, 2, 4, 3], 7))
# 2