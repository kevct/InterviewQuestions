#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Sat Aug 29 11:22:43 2020

@author: kevin
"""
"""
This problem was recently asked by Amazon:
You are given an array of integers, and an integer K. Return the subarray 
which sums to K. You can assume that a solution will always exist.
"""

def find_continuous_k(list, k):
  # Fill this in.
  if(len(list) == 0):
      return None
  elif(list[0] == k):
      return [list[0]]
  else:
      i = 0
      j = 1
      result = [list[i], list[j]]
      sumResult = sum(result)
      while(j<len(list)):
          if(sumResult == k):
              return result
          elif(sum(result)<k):
              if(j+1 < len(list)):
                  j+=1
                  result.append(list[j+1])
          else:
              result.pop(0)
          sumResult = sum(result)
          

print(find_continuous_k([1, 3, 2, 5, 7, 2], 14))
# [2, 5, 7]