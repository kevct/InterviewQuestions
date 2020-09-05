#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Tue Aug 25 18:44:55 2020

@author: kevin
"""

"""
This problem was recently asked by Google:
Given a list of numbers, for each element find the next element that is larger 
than the current element. Return the answer as a list of indices. If there are 
no elements larger than the current element, then use -1 instead.
"""

def larger_number(nums):
  # Fill this in.
  result = []
  for i in range(len(nums)):
      index = -1 #Default result is -1
      for j in range(i+1, len(nums)):
          #if the number at index j is greater than the number at index i,
          #store the index number
          if(nums[j] > nums[i]):
              index = j
              break
      result.append(index)
  return result
  
# print [2, 2, 3, 4, -1, -1]
print(larger_number([3, 2, 5, 6, 9, 8]))