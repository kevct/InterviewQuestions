# -*- coding: utf-8 -*-
"""
Created on Sun Sep 13 13:21:57 2020

@author: Kevin
"""

"""
This problem was recently asked by Google:
Given a sorted list of numbers, and two integers low and high representing the 
lower and upper bound of a range, return a list of (inclusive) ranges where the
 numbers are missing. A range should be represented by a tuple in the format of (lower, upper).
Here's an example and some starting code:
"""

def missing_ranges(nums, low, high):
  # Fill this in.
  result = []
  i = low+1
  while(i < high):
      #If a number is not in the range then create a tuple with the starting
      #point at that number and keep finding successive numbers that are also
      #not in the range until you can't
      if(i not in nums):
          temp = (i,i)
          for j in range(i+1, high+1):
              if(j not in nums):
                  temp = (i,j)
              else:
                  i = j
                  break
          result.append(temp)
      else:
          i+=1
  return result
  
print(missing_ranges([1, 3, 5, 10], 1, 10))
# [(2, 2), (4, 4), (6, 9)]
