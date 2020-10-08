#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Thu Oct  8 15:15:24 2020

@author: kevin
"""

"""
Given a string s, recursively remove adjacent duplicate characters from the
string s. The output string should not have any adjacent duplicates.
"""

def removeAdjacentDuplicates(s):
    #If the length of the string is 0 or 1 then return the string
    if not s or len(s) == 1:
        return s
    #If the first two characters are equal then keep checking adjacent characters
    #until a character that is not equal is reached
    if(s[0] == s[1]):
        index=2
        for i in range(2, len(s)):
            if(s[i] != s[1]):
                index = i
                break
        return removeAdjacentDuplicates(s[index:])
    #If the first two characters are not equal the the result will be the first
    #character concatenated with the recursive call of the other n-1 characters
    return s[0] + removeAdjacentDuplicates(s[1:])
        

s = "aabcdaabcd"
print(removeAdjacentDuplicates(s)) #bcdbcd 