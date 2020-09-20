#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Sun Sep 20 13:26:24 2020

@author: kevin
"""

"""This problem was recently asked by Amazon:
Given an array of size n, and all values in the array are in the range 1 to n, find all the duplicates.
"""
class Solution(object):
  def findDuplicates(self, nums):
    # Fill this in.
    result = []
    for i in nums:
        if(nums.count(i) > 1 and i not in result):
            result.append(i)
    return result

print(Solution().findDuplicates([4,3,2,7,8,2,3,1]))
# [2, 3]