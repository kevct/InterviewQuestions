#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Sat Oct  3 12:42:16 2020

@author: kevin
"""

"""
Your task is to implement the function strstr. The function takes two strings 
as arguments (s,x) and  locates the occurrence of the string x in the string s. 
The function returns and integer denoting the first occurrence of the string x 
in s (0 based indexing).
"""

def strstr(s1, s2):
    result = -1
    if(s2 in s1):
        for j in range(len(s2)):
            for i in range(j, len(s1), len(s2)):
                tmp = s1[i:i+len(s2)]
                if(tmp == s2):
                    result = i
                    return result
    return result

s1 = "Hello, World!"
s2 = "Wo"
print(strstr(s1, s2))
#7