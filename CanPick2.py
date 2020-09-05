#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Wed Sep  2 17:47:43 2020

@author: kevin
"""

"""This problem was recently asked by Twitter:
Given an array containing only positive integers, return if you can pick two 
integers from the array which cuts the array into three pieces such that the 
sum of elements in all pieces is equal.
Example 1:
Input: array = [2, 4, 5, 3, 3, 9, 2, 2, 2]
Output: true
Explanation: choosing the number 5 and 9 results in three pieces [2, 4], [3, 3] 
and [2, 2, 2]. Sum = 6.
Example 2:
Input: array =[1, 1, 1, 1],
Output: false
Here's a starting point:
"""
class Solution(object):
  def canPick2(self, arr):
    # Fill this in.
    subsets = []
    
    #Get all possible combinations of the array if you remove two elements
    for i in range(len(arr)-1):
        for j in range(i+1, len(arr)):
            temp = arr[:]
            temp.pop(i)
            temp.pop(j-1)
            subsets.append(temp)
    
    #For each subset of the array
    for i in range(len(subsets)):
        #If the array is divisible by 3 
        if(sum(subsets[i])%3 == 0):
            temp = 0
            for j in range(len(subsets[i])):
                temp += subsets[i][j]
                #If a part of the subset added together == sum(subset)/3
                #Then reset and keep going until end of subset or until sum is
                #Greater than 3
                if(temp == sum(subsets[i])/3):
                    #If the end of subset is reached then that means
                    #The array can be divided up into 3 equal pieces
                    if(j == len(subsets[i])-1):
                        return True
                    temp = 0
                elif(temp > sum(subsets[i])/3):
                    break;
    return False

print(Solution().canPick2([2, 4, 5, 3, 3, 9, 2, 2, 2]))
# True

print(Solution().canPick2([1, 2, 3, 4, 5]))
# False
