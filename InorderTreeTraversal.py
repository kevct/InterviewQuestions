# -*- coding: utf-8 -*-
"""
Spyder Editor

This is a temporary script file.
"""

"""
This problem was recently asked by LinkedIn:
Given a binary tree, perform an in-order traversal both recursively and iteratively.
"""

class Node:
  def __init__(self, val=0, left=None, right=None):
    self.val = val
    self.left = left
    self.right = right


def inorder(node):
    # Fill this in.
    if(node != None):
        if(node.left == None):
            print(str(node.val), end=" ")
            inorder(node.right)
        else:
            inorder(node.left)
            print(str(node.val), end=" ")
            inorder(node.right)
        
  
  

def inorder_iterative(node):
    # Fill this in.
    temp = node
    stack = []
    while(True):
        #Keep pushing temp node into stack until temp node is null
        if(temp != None):
            stack.append(temp)
            temp = temp.left
        #If null...
        else:
            #If the stack is empty then we are done
            if(not stack):
                break
            #If the stack is not empty then we print the last item in stack
            #and we move to the right node and repeat cycle again
            else:
                poppedItem = stack.pop()
                print(str(poppedItem.val), end=" ")
                temp = poppedItem.right
                
      
      

#     12
#    /  \
#   6    4
#  / \   / \
# 2   3 7   8
n = Node(12, Node(6, Node(2), Node(3, Node(9), Node(10))), Node(4, Node(7), Node(8)))

inorder(n)
# 2 6 3 12 7 4 8

print()

inorder_iterative(n)
# 2 6 3 12 7 4 8
