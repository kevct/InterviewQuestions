#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Thu Sep 17 13:49:52 2020

@author: kevin
"""

"""
This problem was recently asked by Amazon:
Given a number like 159, add the digits repeatedly until you get a single number.
For instance, 1 + 5 + 9 = 15.
1 + 5 = 6.
So the answer is 6.
"""

class Solution(object):
  # Fill this in.
  def addDigits(self, num):
      digits = []
      tmp = num
      while(tmp > 0):
          digits.append(tmp%10)
          tmp //= 10
      for i in range(len(digits)):
          if(sum(digits[i:]) < 10):
              return sum(digits[i:])

print(Solution().addDigits(159))
# 1 + 5 + 9 = 15
# 1 + 5 = 6
# 6