#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Tue Oct  6 23:29:53 2020

@author: kevin
"""

"""
Given a Binary Tree of size N , return the number of leaves in it.
"""
class btNode():
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None
        
def countLeaves(node):
    #If the left and right children are none, then the node is a leaf
    if(not node):
        return 0
    if(not node.left and not node.right):
        return 1
    return countLeaves(node.left) + countLeaves(node.right)

root = btNode(4)
root.left = btNode(2)
root.left.left = btNode(1)
root.left.right = btNode(3)
root.right = btNode(6)
root.right.left = btNode(5)

"""
          4
         /  \
        2    6
       /\    / 
      1  3  5
"""

print(countLeaves(root))
#3