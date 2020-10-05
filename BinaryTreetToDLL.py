# -*- coding: utf-8 -*-
"""
Created on Mon Oct  5 12:13:13 2020

@author: Kevin
"""

"""
Given a Binary Tree (BT), convert it to a Doubly Linked List(DLL). 
The left and right pointers in nodes are to be used as previous and next 
pointers respectively in converted DLL. The order of nodes in DLL must be 
same as Inorder of the given Binary Tree. The first node of Inorder traversal 
(leftmost node in BT) must be the head node of the DLL.
"""

class Node():
    def __init__(self, data):
        self.data = data
        self.prev = None
        self.next = None
    
    def __str__(self):
        return f"{self.prev} <-> {self.data} <-> {self.next}"

class btNode():
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None

def btToDLL(root, prev):
    node = Node(root.data)
    if(root.left):
        node.prev = btToDLL(root.left)
    if(root.right):
        node.next = btToDLL(root.right)
    return node
    
        
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
print(btToDLL(root))