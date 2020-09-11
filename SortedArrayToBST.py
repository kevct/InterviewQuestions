#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Thu Sep 10 08:52:31 2020

@author: kevin
"""

"""
This problem was recently asked by Apple:
Given a sorted array, convert it into a binary search tree.
Can you do this both recursively and iteratively?
"""

class Node(object):
    def __init__(self, val, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
    def __str__(self):
      return f"{self.val}, ({self.left}, {self.right})"

class Solution(object):
    #Recursive Solution
    def sortedArrayToBST(self, nums):
      # Fill this in.
      if(len(nums) == 1):
          return Node(nums[0])
      elif(not nums):
          return None
      else:
          #Keep splitting the list up in half until the list is either empty or there is only 1 element left
          return Node(nums[len(nums)//2], Solution().sortedArrayToBST(nums[:(len(nums)//2)]), Solution().sortedArrayToBST(nums[(len(nums)//2+1):]))
    
    #Modified Iterative Solution from 
    #https://codereview.stackexchange.com/questions/214874/building-balanced-bst-from-sorted-array-recursive-and-iterative-approaches
    def iSortedArrayToBST(self, array):
        size = len(array)

        # Stack stores tuples of the first and the last indices of half-segments:
        stack_indices = []
        stack_indices.append((0, size - 1))
    
        # Stack stores tree nodes:
        stack_nodes = []
    
        # Add to the stack a node that will be a root of the tree:
        root_node = Node(None)
        stack_nodes.append(root_node)
    
        while stack_indices:
            first, last = stack_indices.pop()
            node = stack_nodes.pop()
    
            if last < first:
                # The segment is degenerated. Keep the node empty.
                continue
            elif last == first:
                # Assign the value, it is the last bottom node.
                node.val = array[last]
                continue
            
            mid = (first + last) // 2
            node.val = array[mid]
            node.left = Node(None)
            node.right = Node(None)
    
            # Update stacks:
            # (right half-segment)
            stack_indices.append((mid + 1, last))
            stack_nodes.append(node.right)
            # (left half-segment)
            stack_indices.append((first, mid - 1))
            stack_nodes.append(node.left)
        assert not stack_nodes
    
        return root_node
          

n = Solution().sortedArrayToBST([-10, -3, 0, 5, 9])
#n = Node(0, Node(-3, Node(-10)), Node(9, Node(5)))
print(n)

n = Solution().iSortedArrayToBST([-10, -3, 0, 5, 9])
#n = Node(0, Node(-3, Node(-10)), Node(9, Node(5)))
print(n)
# 0, (-3, (-10, (None, None), None), 9, (5, (None, None), None))

#           0
#         /  \
#        /    \
#       /      \
#     -3       9
#     / \     / \
#   -10 None 5  None