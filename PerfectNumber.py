#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Wed Sep  9 14:28:35 2020

@author: kevin
"""

"""
This problem was recently asked by Facebook:
A Perfect Number is a positive integer that is equal to the sum of all its positive divisors except itself.
For instance,
28 = 1 + 2 + 4 + 7 + 14
Write a function to determine if a number is a perfect number.
"""

class Solution(object):
  def checkPerfectNumber(self, num):
    # Fill this in.
    #Set result = 1 since any number is divisible by 1
    result = 1
    #Check numbers from 2 to number/2
    for i in range(2, num//2 + 1, 1):
        if(num%i == 0):
            result += i
    if(result == num):
        return True
    return False

print(Solution().checkPerfectNumber(28))
# True
# 28 = 1 + 2 + 4 + 7 + 14
