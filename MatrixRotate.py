#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Wed Aug 26 18:06:49 2020

@author: kevin
"""

"""
This problem was recently asked by Uber:
Given a square 2D matrix (n x n), rotate the 
matrix by 90 degrees clockwise.
"""

def rotate(mat):
    # Fill this in.
    result = []
    for i in range(len(mat)):
        temp = []
        #For each column, add to a temporary array
        for j in range(len(mat)-1, -1, -1):
            temp.append(mat[j][i])
        #Add the temporary array to the 2D array
        result.append(temp)
    return result

#mat = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
mat = [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12], [13, 14, 15, 16]]
# Looks like
# 1 2 3
# 4 5 6
# 7 8 9

# Looks like
# 7 4 1
# 8 5 2
# 9 6 3
print(rotate(mat))
# [[7, 4, 1], [8, 5, 2], [9, 6, 3]]