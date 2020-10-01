#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Wed Sep 30 20:11:07 2020

@author: kevin
"""

"""
Given a String of length S, reverse the whole string without reversing the 
individual words in it. Words are separated by dots.
"""
def reverseString(s):
    #Split array and put each word into list
    arr = s.split(".")
    #Going backwards in the list, add the words into result along with a "."
    result = arr[-1]
    for i in range(len(arr)-2, -1, -1):
        result += "." + arr[i]
    return result

s = "Hello.My.Name.Is.John.Doe"
print(reverseString(s))
#Doe.John.Is.Name.My.Hello