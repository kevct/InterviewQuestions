#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Tue Aug 25 19:10:14 2020

@author: kevin
"""

"""
This problem was recently asked by Microsoft:
You are given a doubly linked list. Determine if it is a palindrome.
Can you do this for a singly linked list?
"""

class Node(object):
  def __init__(self, val):
    self.val = val
    self.next = None
    self.prev = None

def is_palindrome(node):
  # Fill this in.
  startnode = node
  endnode = startnode
  while(endnode.next!=None):
      endnode=endnode.next
      
  while(startnode is not endnode):
      if(startnode.val!=endnode.val):
          return False
      startnode = startnode.next
      endnode = endnode.prev
  return True

#-----------------------------------------------
"""
Traverse the given list from head to tail and push every visited node to stack.
Traverse the list again. For every visited node, pop a node from stack and 
compare data of popped node with currently visited node.
If all nodes matched, then return true, else false.
"""

def is_palindrome_single_linked(node):
  # Fill this in.
  stack = []
  temp = node
  
  #Add nodes to stack
  while(temp != None):
      stack.append(temp)
      temp = temp.next
  
  #Compare nodes to stack
  temp = node
  while(temp != None):
      if(stack.pop().val != temp.val):
          return False
      temp = temp.next
  
  return True

#-----------------------------------------------

node = Node('a')
node.next = Node('b')
node.next.prev = node
node.next.next = Node('b')
node.next.next.prev = node.next
node.next.next.next = Node('b')
node.next.next.next.prev = node.next.next
node.next.next.next.next = Node('a')
node.next.next.next.next.prev = node.next.next.next

print(is_palindrome(node))
# True

node = Node('a')
node.next = Node('b')
node.next.next = Node('b')
node.next.next.next = Node('b')
node.next.next.next.next = Node('a')
print(is_palindrome_single_linked(node))
# True