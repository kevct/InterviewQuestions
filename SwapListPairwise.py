# -*- coding: utf-8 -*-
"""
Created on Tue Sep 29 09:35:55 2020

@author: funny
"""

"""
Given a singly linked list, write a function to swap elements pairwise.

Input : 1->2->3->4->5->6->NULL
Output : 2->1->4->3->6->5->NULL
"""

# Node class  
class Node: 
  
    # Constructor to initialize the node object 
    def __init__(self, data): 
        self.data = data 
        self.next = None
    def __str__(self):
        s = str(self.data) + "->"
        if(self.next):
            s += str(self.next)
        else:
            s += "None"
        return s
    
def swapPairwise(node):
    stack = []
    tmp = node
    while(tmp): #Add list to stack
        stack.append(tmp)
        tmp = tmp.next
    for i in range(0, len(stack), 2):
        #For each 2nd element in list swap positions
        if not (i+1 > len(stack)-1):
            stack.insert(i, (stack.pop(i+1)))
    for j in range(len(stack)-1): #Link together the newly swapped nodes
        stack[j].next = stack[j+1]
    stack[-1].next = None #Set the last node's next to None
    return stack[0]
    
node = Node(1)
node.next = Node(2)
node.next.next = Node(3)
node.next.next.next = Node(4)
node.next.next.next.next = Node(5)
#1->2->3->4->5->None

print("Before: " + str(node))
node = swapPairwise(node)
print("After: " + str(node))
#2->1->4->3->5->None