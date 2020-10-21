# -*- coding: utf-8 -*-
"""
Created on Thu Oct 15 20:52:43 2020

@author: Kevin
"""

"""
Given an array A of size n of integers, see if you can split the array into
subsequences of length k that satisfy the following conditions:
• Condition 1: Each element in the array occurs in exactly one subsequence.
• Condition 2: In all subsequences, all elements are distinct from one another.
Elements that would otherwise be duplicates in the original array must be split
from each other.
"""

def canSplitArray(arr, k):
    if(len(arr)%k == 0 and len(arr) >= k):
        i = 0
        tmp = []
        while(i < len(arr)):
            #If the element is not in the subsequence then add it to the 
            #subsequence and remove the element from the original array
            if(arr[i] not in tmp):
                tmp.append(arr[i])
                arr.pop(i)
                i = 0
                #If the subsequence length == k then create a new subsequence
                if(len(tmp) == k):
                    tmp = []
            else:
                i+=1
    #If the array can be split into k length subsequences that satisfiy 
    #conditions 1 and 2 then the original array should now be empty
    if(not arr):
        return True
        
    return False

print(canSplitArray([1,2,3,4], 2)) #True
print(canSplitArray([4,5,5,13], 3)) #False