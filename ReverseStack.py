# -*- coding: utf-8 -*-
"""
Created on Wed Dec 16 16:45:26 2020

@author: funny
"""

"""
Write a program to reverse a stack using recursion. 
You are not allowed to use loop constructs like while, for..etc, 
and you can only use the following ADT functions on Stack S: 
isEmpty(S) 
push(S) 
pop(S)
"""

def reverseStack(stack):
    if stack:
        tmp = stack.pop()
        reverseStack(stack)
        insertStack(stack, tmp)

def insertStack(stack, toAdd):
    if not stack:
        stack.append(toAdd)
    else:
        tmp = stack.pop()
        insertStack(stack, toAdd)
        stack.append(tmp)

stack = [1,2,3,4]
reverseStack(stack)
print(stack)