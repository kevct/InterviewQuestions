#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Wed Sep 23 13:24:47 2020

@author: kevin
"""

"""
This problem was recently asked by Apple:
You are given an array. Each element represents the price of a stock on that 
particular day. Calculate and return the maximum profit you can make from 
buying and selling that stock only once.
For example: [9, 11, 8, 5, 7, 10]
Here, the optimal trade is to buy when the price is 5, and sell when it is 10, 
so the return value should be 5 (profit = 10 - 5 = 5).
Here's your starting point:
"""
def buy_and_sell(arr):
  #Fill this in.
  maxProfit = [0] * (len(arr)-1) #Initialize list with zeroes
  for i in range(len(arr)-1):
      for j in range(i, len(arr)):
          #For each number in the array find the max possible value 
          if (arr[j]-arr[i] > maxProfit[i]):
              maxProfit[i] = arr[j]-arr[i]
  #Once done then sort the array and return the largest profit
  maxProfit.sort()
  return maxProfit[-1]
  
print(buy_and_sell([9, 11, 8, 5, 7, 10]))
# 5