#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Tue Sep 15 11:51:28 2020

@author: kevin
"""
"""
 This problem was recently asked by Twitter:
Given a tree, find if the binary tree is height balanced or not. A height 
balanced binary tree is a tree where every node's 2 subtree do not differ in 
height by more than 1.
Here's some starter code:
"""
class Node:
  def __init__(self, value, left=None, right=None):
    self.value = value
    self.left = left
    self.right = right

def height(node):
    if(not node):
        return 0
    else:
        return 1 + max(height(node.left), height(node.right))

def is_height_balanced(tree):
    # Fill this in.
    if(not tree):
        return True
    if(abs(height(tree.left)-height(tree.right)) <= 1 and is_height_balanced(tree.left) 
    and is_height_balanced(tree.right)):
        return True
    return False

#     1
#    / \
#   2   3
#  /
# 4  
n4 = Node(4)
n3 = Node(3)
n2 = Node(2, n4)
n1 = Node(1, n2, n3)

print(is_height_balanced(n1))
# True

#     1
#    / 
#   2   
#  /
# 4  
n1 = Node(1, n2)
print(is_height_balanced(n1))
# False