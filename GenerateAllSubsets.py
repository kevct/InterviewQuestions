#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Sun Sep 27 13:38:18 2020

@author: kevin
"""

"""
This problem was recently asked by Facebook:
Given a list of unique numbers, generate all possible subsets without 
duplicates. This includes the empty set as well.
Here's an example and some starter code.
"""
import itertools

#solution from https://www.geeksforgeeks.org/python-program-to-get-all-subsets-of-given-size-of-a-set/
def generateAllSubsets(nums):
    # Fill this in.
    result = []
    for i in range(len(nums)+1):
        result += list(itertools.combinations(nums, i))
    for i in range(len(result)):
        result[i] = list(result[i])
    return result

print(generateAllSubsets([1, 2, 3]))
# [[], [3], [2], [2, 3], [1], [1, 3], [1, 2], [1, 2, 3]]