#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Fri Aug 28 17:52:08 2020

@author: kevin
"""

"""
This problem was recently asked by Facebook:
Given an array and an integer k, rotate the array by k spaces. 
Do this without generating a new array and without using extra space.
Here's an example and some starter code:
"""

def rotate_list(nums, k):
  # Fill this in.
  # Append the first element to the end of the list then pop it
  for i in range(k):
      nums.append(nums.pop(0))

a = [1, 2, 3, 4, 5]
rotate_list(a, 2)
print(a)
# [3, 4, 5, 1, 2]