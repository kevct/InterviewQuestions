#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Sun Oct  4 12:49:51 2020

@author: kevin
"""

"""
Given two sorted arrays arr1[] of size N and arr2[] of size M. Each array is 
sorted in non-decreasing order. Merge the two arrays into one sorted array in 
non-decreasing order without using any extra space.
"""

def mergeArray(a1, a2):
    for i in range(len(a2)):
        tmp = a2[i]
        #For each element in a2, go through the list in a1 and insert element
        #in a2 into a1 at the proper position
        for j in range(len(a1)):
            if(tmp <= a1[j]):
                a1.insert(j, a2[i])
                break
            #If the element in a2 is greater than every elemtn in a1 then 
            #add the element to the last spot
            elif(j == len(a1)-1):
                a1.append(a2[i])
    return a1

a1 = [0, 2, 4, 6, 8]
a2 = [1, 3, 5, 7, 9]
print(mergeArray(a1, a2))
#[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]