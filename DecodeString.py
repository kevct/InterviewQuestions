#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Sat Sep 19 12:35:46 2020

@author: kevin
"""

"""
This problem was recently asked by Google:
Given a string with a certain rule: k[string] should be expanded to string k 
times. So for example, 3[abc] should be expanded to abcabcabc. Nested expansions 
can happen, so 2[a2[b]c] should be expanded to abbcabbc.
Your starting point:
"""
def decodeString(s):
  # Fill this in.
  intStack = []
  stack = []
  for c in s:
      #if the character is a number pop it into the int stack
      if(c.isnumeric()):
          intStack.append(int(c))
      #If the character is a close bracket then keep appending characters until
      #an open bracket is reached and pop the result * number of repeats
      #into the stack
      elif(c == "]"):
        num = intStack.pop()
        tmp = ""
        while(stack[-1] != "["):
            tmp = stack.pop() + tmp
        stack.pop() #Pop "[" out of the stack
        stack.append(tmp * num)
      else:
          stack.append(c)
  return stack[-1]
 
print(decodeString('2[a2[b]c]'))
# abbcabbc