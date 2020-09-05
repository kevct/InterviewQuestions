#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Thu Sep  3 10:41:57 2020

@author: kevin
"""

"""
This problem was recently asked by AirBNB:
Given a list of words, group the words that are anagrams of each other. (An anagram are words made up of the same letters).
Example:
Input: ['abc', 'bcd', 'cba', 'cbd', 'efg']
Output: [['abc', 'cba'], ['bcd', 'cbd'], ['efg']]
Here's a starting point:
"""
import collections

def groupAnagramWords(strs):
    result = []
    # Fill this in.
    while(strs):
        temp = []
        i = 1
        #Iterate through entire list
        while(i < len(strs)):
            #Sort the indicies, if the sorted values are equal then pop the
            #value at index i to a temp array
            if(sorted(strs[0]) == sorted(strs[i])):
                temp.append(strs.pop(i))
            else:
                #Otherwise move on to the next index
                i+=1
        #Once the list is iterated through pop the value at index 0 into
        #the temp array and then store the temp array into the result array
        temp.append(strs.pop(0))
        result.append(temp)
    return result
      

print(groupAnagramWords(['abc', 'bcd', 'cba', 'cbd', 'efg']))
# [['efg'], ['bcd', 'cbd'], ['abc', 'cba']]