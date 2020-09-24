#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Thu Sep 24 11:21:55 2020

@author: kevin
"""

"""
This problem was recently asked by Amazon:
Given a sorted linked list of integers, remove all the duplicate elements in 
the linked list so that all elements in the linked list are unique.
Here's an example and some starter code:
"""
class Node:
  def __init__(self, value, next=None):
    self.value = value
    self.next = next

  def __repr__(self):
    return f"({self.value}, {self.next})"


def remove_dup(lst):
  # Fill this in.
  tmp = lst
  while(tmp.next != None):
      if(tmp.value == tmp.next.value):
          tmp.next = tmp.next.next
      else:
          tmp = tmp.next

lst = Node(1, Node(2, Node(2, Node(3, Node(3)))))

remove_dup(lst)
print(lst)
# (1, (2, (3, None)))