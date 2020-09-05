#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Sun Aug 30 11:33:57 2020

@author: kevin
"""

"""
This problem was recently asked by Twitter:
Given 2 strings s and t, find and return all indexes in string s where t is an anagram.
Here's an example and some starter code:
"""

def find_anagrams(s, t):
  # Fill this in.
  listS = list(s)
  listT = list(t)
  result = []
  index = 0
  
  #Start at index 0
  while(index+len(t)-1 < len(listS)):
      for j in range(len(t)):
          #If the index + j of s is in t, pop that element in t
          if(listS[index + j] in listT):
              listT.remove(listS[index + j])
          #If element in s isn't in t, reset list t and move on to the next index
          else:
              listT = list(t)
              index+=1
              break
      #If t is empty, then that means that s starting at index is an anagram of t
      if(len(listT)==0):
          result.append(index)
          listT = list(t)
          index += len(t)
  return result
  

print(find_anagrams('acdbacdacb', 'abc'))
# [3, 7]