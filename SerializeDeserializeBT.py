#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Sat Oct 10 21:42:33 2020

@author: kevin
"""

"""
Serialization is to store a tree in an array so that it can be later restored 
and Deserialization is reading tree back from the array. Now your task is to 
complete the function serialize which stores the tree into an array A[ ] and 
deSerialize which deserializes the array to tree and returns it.
"""

class Node():
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None
        
    def __str__(self):
        return f"{self.data}({self.left}, {self.right})"
    
def serializeBT(root):
    if(root == None):
        return [None]
    else:
        return [root.data] + serializeBT(root.left) + serializeBT(root.right)

def deserializeBT(arr): 
    if(not arr or not arr[0]):
        return None
    root = Node(arr[0])
    arr.pop(0)
    root.left = deserializeBT(arr[:(len(arr)//2)])
    root.right = deserializeBT(arr[(len(arr)//2):])
    return root

    
root = Node(1)
root.left = Node(2)
root.right = Node(3)
root.left.left = Node(4)
root.left.right = Node(5)
root.right.left = Node(6)
root.right.right = Node(7)
"""
        1
    2       3
  4   5   6   7
"""

print(root)
#1(2(4(None, None), 5(None, None)), 3(6(None, None), 7(None, None)))

print(serializeBT(root)) 
#[1, 2, 4, None, None, 5, None, None, 3, 6, None, None, 7, None, None]

print(deserializeBT(serializeBT(root))) 
#1(2(4(None, None), 5(None, None)), 3(6(None, None), 7(None, None)))
        
