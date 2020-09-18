# -*- coding: utf-8 -*-
"""
Created on Fri Sep 18 13:33:49 2020

@author: funny
"""

"""
This problem was recently asked by Google:
Given a singly-linked list, reverse the list. This can be done iteratively or recursively. Can you get both solutions?
Example:
Input: 4 -> 3 -> 2 -> 1 -> 0 -> NULL
Output: 0 -> 1 -> 2 -> 3 -> 4 -> NULL
"""
class ListNode(object):
  def __init__(self, x):
    self.val = x
    self.next = None
  
  # Function to print the list
  def printList(self):
    node = self
    output = '' 
    while node != None:
      output += str(node.val)
      output += " "
      node = node.next
    print(output)

  # Iterative Solution
  def reverseIteratively(self, head):
    # Implement this.
    tmp = head
    stack = []
    while(tmp != None):
        stack.append(tmp)
        tmp = tmp.next
    
    tmp = stack.pop()
    while(stack):
        tmp.next = stack.pop()
        tmp = tmp.next
    tmp.next = None

  # Recursive Solution from https://www.geeksforgeeks.org/recursively-reversing-a-linked-list-a-simple-implementation/    
  def reverseRecursively(self, head):
    # Implement this.
    if(head == None):
        return None
    elif(head.next == None):
        return head
    node1 = head.reverseRecursively(head.next) 
    head.next.next = head 
    head.next = None
    return node1 

# Test Program
# Initialize the test list: 
testHead = ListNode(4)
node1 = ListNode(3)
testHead.next = node1
node2 = ListNode(2)
node1.next = node2
node3 = ListNode(1)
node2.next = node3
testTail = ListNode(0)
node3.next = testTail

print("Initial list: ")
testHead.printList()
# 4 3 2 1 0
testHead.reverseRecursively(testHead)
#testHead.reverseRecursively(testHead)
print("List after reversal: ")
testTail.printList()
# 0 1 2 3 4