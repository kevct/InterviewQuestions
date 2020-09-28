#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Mon Sep 28 15:04:11 2020

@author: kevin
"""

"""
Print a sequence of numbers starting with N, without using loop, in which  
A[i+1] = A[i] - 5,  if  A[i]>0, else A[i+1]=A[i] + 5  repeat it until A[i]=N.

Example:
Input:
2
16
10
Output:
16 11 6 1 -4 1 6 11 16
10 5 0 5 10
"""

def printSequenceRecursive(n):
    result = []
    if(n <= 0): #If the number is greater than 0 then just return the number in a list
        result.append(n)
    else: 
        #Otherwise append the number to the list twice and make a recursive call
        #to the function and put the result in between the list elements
        result.append(n)
        result = result + printSequenceRecursive(n-5)
        result.append(n)
    return result
        
        
        

print(printSequenceRecursive(16))
#[16, 11, 6, 1, -4, 1, 6, 11, 16]


