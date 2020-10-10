# -*- coding: utf-8 -*-
"""
Created on Fri Oct  9 17:29:22 2020

@author: Kevin
"""

"""
Given two strings a and b consisting of lowercase characters. The task is to 
check whether two given strings are anagram of each other or not. An anagram of 
a string is another string that contains same characters, only the order of 
characters can be different. For example, “act” and “tac” are anagram of each 
other.
"""

def isAnagram(a, b):
    #For each char in a check if it is in b, if so then remove that element
    #in b and continue
    for i in a:
        if i not in b:
            return False
        b = b.replace(i, '', 1)
    #If b is "" then that means that b is also an anagram of a
    if(b):
        return False
    return True

a = "hello"
b = "lleho"
c = "llehoo"
print(isAnagram(a,b)) #True
print(isAnagram(a,c)) #False


