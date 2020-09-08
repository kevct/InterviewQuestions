#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Tue Sep  8 11:14:23 2020

@author: kevin
"""

"""This problem was recently asked by Microsoft:
Given an array of heights, determine whether the array forms a "mountain" 
pattern. A mountain pattern goes up and then down.

Like
  /\
 /  \
/    \
"""
class Solution(object):
  def validMountainArray(self, arr):
    # Fill this in.
    stack = arr[:]
    #Compare the first and last values of the array
    #if they are equal then pop both
    for i in range(len(arr)):
        if(arr[0] == stack[-1]):
            arr.pop(0)
            stack.pop(-1)
        else:
            return False
    return True
        

print(Solution().validMountainArray([1, 2, 3, 2, 1]))
# True

print(Solution().validMountainArray([1, 2, 3]))
# False