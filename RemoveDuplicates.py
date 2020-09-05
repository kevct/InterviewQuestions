#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Fri Aug 28 11:07:05 2020

@author: kevin
"""

"""
This problem was recently asked by Apple:
Given a sorted list of size n, with m unique elements (thus m < n), 
modify the list such that the first m unique elements in the list will 
be sorted, ignoring the rest of the list. Your solution should have a 
space complexity of O(1). Instead of returning the list (since you are 
just modifying the original list), you should return what m is.
Here's an example and some starter code.
"""

def remove_dups(nums):
  # Fill this in.
  index = 0
  for i in range(len(nums)):
      if(index+1 < len(nums)):
          #Check if array element n is the same as element n+1
          if(nums[index] == nums[index+1]):
              #If so, pop element n+1 and keep checking if n is equal
              #to element n+2, n+3... until no more matches are found
              nums.pop(index+1)
          else:
              #Once no matches are found move on to the next element
              index+=1
      
  return len(nums)

nums = [1, 1, 2, 3, 4, 4, 4, 4, 4, 5, 5, 6, 7, 9]
print(remove_dups(nums))
# 8
print(nums)
# [1, 2, 3, 4, 5, 6, 7, 9]

nums = [1, 1, 1, 1, 1, 1]
print(remove_dups(nums))
print(nums)
# 1
# [1]