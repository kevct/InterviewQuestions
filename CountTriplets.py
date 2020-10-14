# -*- coding: utf-8 -*-
"""
Created on Tue Oct 13 21:49:58 2020

@author: Kevin
"""

"""
Given an array A of n distinct integers, and a bounding value v, how many (i, j, k)
indices triples exist which satisfy both of the following conditions:
1. A[i] < A[j] < A[k]
2. A[i] + A[j] + A[k] ≤ v
Written solutions take the form:
(i, j, k) → A[i] + A[j] + A[k] ≤ v

EXAMPLE 1
A = [1, 2, 3, 4, 6]
v = 8
Output:
3
Explanation: the following 3 indices triplets satisfy the above conditions:
• (0, 1, 2) → 1 + 2 + 3 ≤ 8
• (0, 1, 3) → 1 + 2 + 4 ≤ 8
• (0, 2, 3) → 1 + 3 + 4 ≤ 8 
"""


def countTriplets(arr, v):
    result = 0
    arr.sort()
    
    for i in range(len(arr)):
        for j in range(i+1, len(arr)):
            high = len(arr)-1
            while(j < high):
                if(arr[i] + arr[j] + arr[high] <= v):
                    result += 1
                high -= 1
        
        
    
    return result

print(countTriplets([1,2,6,4,3], 8))
