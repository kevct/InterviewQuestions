#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Thu Aug 27 10:03:21 2020

@author: kevin
"""

"""
This problem was recently asked by Twitter:
Given a linked list, remove all duplicate values from the linked list.
For instance, given 1 -> 2 -> 3 -> 3 -> 4, then we wish to return the 
linked list 1 -> 2 -> 4.

"""


class Node(object):
  def __init__(self, val, next=None):
    self.val = val
    self.next = next
  def __str__(self):
    if not self.next:
      return str(self.val)
    return str(self.val) + " " + str(self.next)

class Solution(object):
  def deleteDuplicates(self, node):
    # Fill this in.
    temp = node.next
    result = [node]
    
    while(temp != None):
        #Check if the current node value is the same as the top of the stack
        #if so, pop the node from the stack
        if(temp.val == result[-1].val):
            result.pop()
            result[-1].next = temp.next
        else:
            #Otherwise, add the node to the stack
            result.append(temp)
        temp = temp.next

n = Node(1, Node(2, Node(3, Node(3, Node(4)))))
print(n)
# 1 2 3 3 4
Solution().deleteDuplicates(n)
print(n)
# 1 2 4