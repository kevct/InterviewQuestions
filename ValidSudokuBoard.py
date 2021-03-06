#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Fri Sep 25 10:46:35 2020

@author: kevin
"""

"""
This problem was recently asked by Facebook:
A Sudoku board is a 9x9 grid, where each row, column and each 3x3 subbox 
contains the number from 1-9. Here's an example of a Sudoku board.
-------------
|534|678|912|
|672|195|348|
|198|342|567|
|------------
|859|761|423|
|426|853|791|
|713|924|856|
|------------
|961|537|284|
|287|419|635|
|345|286|179|
|------------

Given a 9x9 board, determine if it is a valid Sudoku board. The board may 
be partially filled, where an empty cell will be represented by the space 
character ' '.
Here's an example and some starting code:
"""

def validate_sudoku(board):
  # Fill this in.
  for i in range(len(board)):
      for j in range(len(board[1])):
          if(board[i][j] != ' '):
              #Check if any other number in the row has the same value
              for k in range(len(board)):
                  if(k != i and board[i][j] == board[k][j]):
                      return False
              #Check if any other number in the column has the same value
              for l in range(len(board[1])):
                  if(l != j and board[i][j] == board[i][l]):
                      return False
              if(not notInBox(board, i - i % 3, j - j % 3)):
                  return False
  return True

#This function sourced from https://www.geeksforgeeks.org/check-if-given-sudoku-board-configuration-is-valid-or-not/
# Checks whether there is any duplicate  
# in current 3x3 box or not.  
def notInBox(arr, startRow, startCol):  
  
    st = set()  
  
    for row in range(0, 3):  
        for col in range(0, 3):  
            curr = arr[row + startRow][col + startCol]  
  
            # If already encountered before,  
            # return false  
            if curr in st:  
                return False
  
            # If it is not an empty cell,  
            # insert value at current cell in set  
            if curr != ' ':  
                st.add(curr)  
          
    return True

board = [
    [5, ' ', 4, 6, 7, 8, 9, 1, 2],
    [6, ' ', 2, 1, 9, 5, 3, 4, 8],
    [1,   9, 8, 3, 4, 2, 5, 6, 7],
    [8,   5, 9, 7, 6, 1, 4, 2, 3],
    [4,   2, 6, 8, 5, 3, 7, 9, 1],
    [7,   1, 3, 9, 2, 4, 8, 5, 6],
    [9,   6, 1, 5, 3, 7, 2, 8, 4],
    [2,   8, 7, 4, 1, 9, 6, 3, 5],
    [3,   4, 5, 2, 8, 6, 1, 7, 9],
]

print(validate_sudoku(board))
# True