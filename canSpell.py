#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Tue Sep 22 13:50:48 2020

@author: kevin
"""

"""
his problem was recently asked by Google:
A criminal is constructing a ransom note. In order to disguise his handwriting, 
he is cutting out letters from a magazine.
Given a magazine of letters and the note he wants to write, determine whether 
he can construct the word.
"""
class Solution(object):
  def canSpell(self, magazine, note):
    # Fill this in.
    for i in note:
        if i in magazine:
            magazine.remove(i)
        else:
            return False
    return True
    
print(Solution().canSpell(['a', 'b', 'c', 'd', 'e', 'f'], 'bed'))
# True

print(Solution().canSpell(['a', 'b', 'c', 'd', 'e', 'f'], 'cat'))
# False