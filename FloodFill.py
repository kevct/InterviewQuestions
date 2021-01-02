""" Given a 2D screen, location of a pixel in the screen ie(x,y) and a color(K), 
your task is to replace color of the given pixel and all adjacent(excluding diagonally adjacent) 
same colored pixels with the given color K. """

def floodFill(arr, x, y, k):
   original = arr[x][y]
   arr[x][y] = k
   if(x-1 >= 0 and arr[x-1][y] == original):
      floodFill(arr, x-1, y, k)
   if(y-1 >= 0 and arr[x][y-1] == original):
      floodFill(arr, x, y-1, k)
   if(x+1 < len(arr[x]) and arr[x+1][y] == original):
      floodFill(arr, x+1, y, k)
   if(y+1 < len(arr[y]) and arr[x][y+1] == original):
      floodFill(arr, x, y+1, k)
   


result = [[1, 1, 1, 1, 1, 1, 1, 1],
         [1, 1, 1, 1, 1, 1, 0, 0],
         [1, 0, 0, 1, 1, 0, 1, 1],
         [1, 2, 2, 2, 2, 0, 1, 0],
         [1, 1, 1, 2, 2, 0, 1, 0],
         [1, 1, 1, 2, 2, 2, 2, 0],
         [1, 1, 1, 1, 1, 2, 1, 1],
         [1, 1, 1, 1, 1, 2, 2, 1]]

floodFill(result,4,4,3)

for i in result:
    print(i)
