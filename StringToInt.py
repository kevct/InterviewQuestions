# -*- coding: utf-8 -*-
"""
Created on Mon Sep 14 09:54:23 2020

@author: funny
"""

"""
Hi, here's your problem today. This problem was recently asked by LinkedIn:
Given a string, convert it to an integer without using the builtin str function. 
You are allowed to use ord to convert a character to ASCII code.
Consider all possible cases of an integer. In the case where the string is not 
a valid integer, return None.
Here's some starting code:
"""
def convert_to_int(s):
  # Fill this in.
  #Strip any negative signs out of the string
  tmp = s.lstrip("-")
  if(not tmp.isnumeric()):
      return False
  result = 0
  #Get the ascii value of each digit and subtract 48 to get the actual value
  #Multiply each digit with their respective power of 10
  #and add to result
  for i in range(len(tmp)):
      result += (ord(tmp[i])-48)*(10**((len(tmp)-1-i)))
  
  #If the original string had a negative symbol, multiply the result by -1
  if(s[0] == "-"):
      result *= -1
  return result

print(convert_to_int('-105') + 1)
# -104