#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Mon Aug 31 18:45:31 2020

@author: kevin
"""

"""
This problem was recently asked by Amazon:
A task is a some work to be done which can be assumed takes 1 unit of time. 
Between the same type of tasks you must take at least n units of time before 
running the same tasks again.
Given a list of tasks (each task will be represented by a string), and a 
positive integer n representing the time it takes to run the same task again, 
find the minimum amount of time needed to run all tasks.
Here's an example and some starter code:
"""

def schedule_tasks(tasks, n):
  # Fill this in.
  index = 0;
  result = []
  while(tasks):
      if(tasks[index] in result):
          withinN = False
          for i in range(1, n):
              if(result[len(result)-i] == tasks[index]):
                  withinN = True
                  break
          if(not withinN):
              result.append(tasks.pop(index))
              index = 0
          elif(index == (len(tasks)-1)):
              result.append("idle")
              index = 0
          else:
              index += 1
      else:
          result.append(tasks.pop(index))
          index = 0
      print(result)
  return len(result)
      

print(schedule_tasks(['q', 'q', 's', 'q', 'w', 'w'], 4))
# print 6
# one of the possible orders to run the task would be
# 'q', 'w', idle, idle, 'q', 'w'