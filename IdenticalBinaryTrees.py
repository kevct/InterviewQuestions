#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Fri Oct  2 11:54:13 2020

@author: kevin
"""

"""
Given two binary trees, the task is to find if both of them are identical or not. 
"""
class binTree():
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None
    
def identicalTrees(tree1, tree2):
    #If both trees are None then return true
    if(tree1 == None and tree2 == None):
        return True
    #If one of the trees is None but the other is not None then return false
    elif((not tree1 and tree2) or (tree1 and not tree2)):
        return False
    #Otherwise recursively call the function
    else:
        return (tree1.data == tree2.data) and (identicalTrees(tree1.left, tree2.left) and identicalTrees(tree1.right, tree2.right))
        

tree1 = binTree(1)
tree1.left = binTree(2)
tree1.right = binTree(3)
tree1.right.right = binTree(4)

"""
    1
    /\
   2  3
       \
        4
"""

tree2 = binTree(1)
tree2.left = binTree(2)
tree2.right = binTree(3)
"""
    1
    /\
   2  3
"""

print(identicalTrees(tree1, tree2))
#False
        