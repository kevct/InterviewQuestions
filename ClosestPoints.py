#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Fri Sep 11 12:42:21 2020

@author: kevin
"""

"""
Hi, here's your problem today. This problem was recently asked by LinkedIn:
Given a list of points as a tuple (x, y) and an integer k, find the k closest points to the origin (0, 0).
Here's an example and some starter code:
"""
import math

def closest_points(points, k):
  # Fill this in.
  result = []
  dist = []
  #Populate the result with the first k points
  for i in range(k):
      result.append(points[i])
      dist.append(math.sqrt(points[i][0]**2 + points[i][1]**2))
      
  for i in range(k, len(points)):
      #Compare the rest of the elements with the elements in result
      #and if the element has a smaller distance than the largest distance
      #in result then swap those two
      length = math.sqrt(points[i][0]**2 + points[i][1]**2)
      maxIndex = -1
      maxDist = -1
      for j in range(k):
          if(dist[j] > length):
              if(maxDist == -1):
                  maxIndex = j
                  maxDist = dist[j]
              elif(dist[j] < maxDist):
                  maxIndex = j
                  maxDist = dist[j]
      if(maxIndex != -1):
          dist[maxIndex] = length
          result[maxIndex] = points[i]
          
  return result

print(closest_points([(3, 1), (-3, 4), (0, 0), (1, 2)], 2))
# [(1, 2), (0, 0)]