# -*- coding: utf-8 -*-
"""
Created on Sat Sep 12 16:19:19 2020

@author: funny
"""

"""
This problem was recently asked by Amazon:
The h-index is a metric that attempts to measure the productivity and citation impact of the publication of a scholar. The definition of the h-index is if a scholar has at least h of their papers cited h times.
Given a list of publications of the number of citations a scholar has, find their h-index.
Example:
Input: [3, 5, 0, 1, 3]
Output: 3

Explanation:
There are 3 publications with 3 or more citations, hence the h-index is 3.
Here's a starting point:
"""

def hIndex(publications):
  # Fill this in.
  publications.sort()
  maxH = publications[0]
  print(len(publications))
  print(publications)
  for i in range(1, len(publications)):
      if(maxH != publications[i] and len(publications)-i>=publications[i]):
          maxH = publications[i]
          
  return maxH
  
print(hIndex([0,1,2,6,8,2,4,5,5,5,4,3,4,5,76,10,2,4,4,9,9])) #[5, 3, 3, 1, 0]
# 3