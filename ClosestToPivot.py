#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Wed Aug 26 11:09:24 2020

@author: kevin
"""

"""
This problem was recently asked by AirBNB:
Given a list of sorted numbers, and two integers 
k and x, find k closest numbers to the pivot x.
"""

def closest_nums(nums, k, x):
    result = []
    temp = 0
 # Fill this in.
    #Fill empty array with first k results
    for i in range(k):
        if(len(result) < k):
            result.append(nums[i])
    #Iterate thru entire nums array
    for i in range(k, len(nums)):
        index = 0
        temp = x-result[0]
        #Iterate thru result array to find the number that is furthest from x
        for j in range(len(result)):
           # print("j loop: " + str(temp) + " " + str(x-result[j]))
            if(abs(temp) < abs(x-result[j])):
                temp = x-result[j]
                index = j
        #print(str(x-nums[i]) +" " +  str(temp))
        #If the farthest number from x in result is further than index i,
        #replace that number with the number at index i
        if(abs(x-nums[i]) < abs(temp)):
            result.pop(index)
            result.append(nums[i])
    return result
             
 
print(closest_nums([1, 3, 7, 8, 9], 3, 5))
# [7, 3, 8]