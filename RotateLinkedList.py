#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Thu Oct  1 11:49:06 2020

@author: kevin
"""
"""
Given a singly linked list of size N. The task is to rotate the linked list 
counter-clockwise by k nodes, where k is a given positive integer smaller than 
or equal to length of the linked list.
"""

class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
    def __str__(self):
        return f"{self.data} -> {self.next}"
        
def rotateLinkedList(node, k):
    arr = []
    tmp = node
    while(tmp):
        arr.append(tmp)
        tmp = tmp.next
    for i in range(len(arr)-1, len(arr)-1-k, -1):
        arr.insert(0, arr.pop())
    for i in range(len(arr)-1):
        arr[i].next = arr[i+1]
    arr[-1].next = None
    result = arr[0]
    return result

node = Node(1)
node.next = Node(2)
node.next.next = Node(3)
node.next.next.next = Node(4)
node.next.next.next.next = Node(5)
node.next.next.next.next.next = Node(6)
node.next.next.next.next.next.next = Node(7)
node.next.next.next.next.next.next.next = Node(8)
#1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> None

node = rotateLinkedList(node, 3)
print(node)
#6 -> 7 -> 8 -> 1 -> 2 -> 3 -> 4 -> 5 -> None

