/* Given a 2D screen, location of a pixel in the screen ie(x,y) and a color(K), 
your task is to replace color of the given pixel and all adjacent(excluding diagonally adjacent) 
same colored pixels with the given color K.
*/

class FloodFill{
   public static void main(String[] args){
      int[][] screen = {{1, 1, 1, 1, 1, 1, 1, 1},
                        {1, 1, 1, 1, 1, 1, 0, 0},
                        {1, 0, 0, 1, 1, 0, 1, 1},
                        {1, 2, 2, 2, 2, 0, 1, 0},
                        {1, 1, 1, 2, 2, 0, 1, 0},
                        {1, 1, 1, 2, 2, 2, 2, 0},
                        {1, 1, 1, 1, 1, 2, 1, 1},
                        {1, 1, 1, 1, 1, 2, 2, 1}
                         };
      int[][] result = floodFill(screen, 4, 4, 3);
      
      /*
         1 1 1 1 1 1 1 1 
         1 1 1 1 1 1 0 0 
         1 0 0 1 1 0 1 1 
         1 3 3 3 3 0 1 0 
         1 1 1 3 3 0 1 0 
         1 1 1 3 3 3 3 0 
         1 1 1 1 1 3 1 1 
         1 1 1 1 1 3 3 1 
      */
                         
      for(int[] i : result){
         for(int j : i){
            System.out.print(j + " ");
         }
         System.out.println();
      }
   }
   
   /**
   * Fills a specified pixel and all adjacent pixels with the specifed color
   *
   * @param screen The screen
   * @param x The x-coordinate  
   * @param y The y-coordinate 
   * @param k The new color
   * @return The updated screen
   */
   static int[][] floodFill(int[][] screen, int x, int y, int k){
      int original = screen[x][y];
      screen[x][y] = k;
      
      if(x-1 >= 0 && screen[x-1][y] == original){
         screen = floodFill(screen, x-1, y, k);
      }
      if(y-1 >= 0 && screen[x][y-1] == original){
         screen = floodFill(screen, x, y-1, k);
      }
      if(x+1 < screen[0].length && screen[x+1][y] == original){
         screen = floodFill(screen, x+1, y, k);
      }
      if(y+1 < screen.length && screen[x][y+1] == original){
         screen = floodFill(screen, x, y+1, k);
      }
      
      return screen;
   }
}