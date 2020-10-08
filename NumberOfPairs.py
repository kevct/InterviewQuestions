# -*- coding: utf-8 -*-
"""
Created on Wed Oct  7 23:12:01 2020

@author: Kevin
"""

"""
Given two arrays X[] and Y[] of size M and N respectively. Find number of pairs 
such that xy > yx where x is an element from X[] and y is an element from Y[].
"""

def numberOfPairs(x, y):
    count = 0
    combinations = []
    for i in x:
        for j in y:
            combinations.append((i, j))
    for k in combinations:
        if(pow(k[0], k[1]) > pow(k[1], k[0])):
            count += 1
    return count

x = [2, 1, 6]
y = [1, 5]
print(numberOfPairs(x, y)) #3

x = [10, 19, 18]
y = [11, 15, 9]
print(numberOfPairs(x, y)) #2