"""
Given a string consisting of lowercase english alphabets. Find the repeated character present first in the string.
"""

def findFirstRepeat(str):
   for i in str:
      if(str.count(i) > 1):
         return i
   return -1
      
print(findFirstRepeat("abbcbc"))
