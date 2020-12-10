/*
Calculate the probability that a person is alive 
after he walks N steps on the square island provided that he 
dies if he steps outside the matrix.
*/

class IslandSurvive{
   public static void main(String[] args){
      System.out.print(islandSurvive(3,0,0,3));
   }
   
   /**
   * Finds the probability that a person is alive after he walks a specified number of steps on an nxn island
   *
   * @param n The size of the nxn array
   * @param x The starting x coordinate 
   * @param y The starting y coordinate
   * @param steps The number of steps to take
   * @return The probability that the person is alive
   */
   static double islandSurvive(int n, int x, int y, int steps){
      if(x == -1 || y == -1){
         return 0;
      }
      if(steps == 0){
         return 1;
      }
      return (islandSurvive(n, x-1, y, steps-1) + 
               islandSurvive(n, x+1, y, steps-1) +
               islandSurvive(n, x, y-1, steps-1) + 
               islandSurvive(n, x, y+1, steps-1))/(4*steps);
   }
}