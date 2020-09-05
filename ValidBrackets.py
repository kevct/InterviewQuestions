#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Sat Sep  5 12:15:07 2020

@author: kevin
"""

"""
This problem was recently asked by Uber:
Imagine you are building a compiler. Before running any code, the compiler 
must check that the parentheses in the program are balanced. Every opening 
bracket must have a corresponding closing bracket. We can approximate this 
using strings.
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', 
determine if the input string is valid.
An input string is valid if:
- Open brackets are closed by the same type of brackets.
- Open brackets are closed in the correct order.
- Note that an empty string is also considered valid.
Example:
Input: "((()))"
Output: True

Input: "[()]{}"
Output: True

Input: "({[)]"
Output: False
"""

class Solution:
  def isValid(self, s):
    # Fill this in.
    stack = []
    for i in range(len(s)):
        #If it's an open bracket then insert it into the stack
        if(s[i] == "(" or s[i] == "{" or s[i] == "["):
            stack.append(s[i])
        else: 
            #if its a closing bracket then check of the top of the stack has a
            #matching open bracket and if so then pop that open bracket from 
            #the stack, if not then return False
            if( (s[i] == ")" and stack[-1] != "(") or (s[i] == "}" 
            and stack[-1] != "{") or (s[i] == "]" and stack[-1] != "[")):
                return False
            else:
                stack.pop()
    #Once the end of the string is reached check if the stack is empty, if not
    #then return False
    if(stack):
        return False
    
    return True

# Test Program
s = "()(){(())" 
# should return False
print(Solution().isValid(s))

s = ""
# should return True
print(Solution().isValid(s))

s = "([{}])()"
# should return True
print(Solution().isValid(s))