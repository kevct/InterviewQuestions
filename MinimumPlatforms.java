/*
Given arrival and departure times of all trains that reach a railway station. 
Your task is to find the minimum number of platforms required for the railway station so that no train waits.
Note: Consider that all the trains arrive on the same day and leave on the same day. 
Also, arrival and departure times will not be same for a train, but we can have arrival 
time of one train equal to departure of the other.
In such cases, we need different platforms, i.e at any given instance of time, 
same platform can not be used for both departure of a train and arrival of another.
*/
import java.util.ArrayList;

class MinimumPlatforms{
   public static void main(String[] args){
      int arr[][] = {{900,910},{940,1200},{950,1120},{1100,1130},{1500,1900},{1800,2000}};
      int arr2[][] = {{900,1000},{1100,1200},{1235,1240}};
      System.out.println(minimumPlatforms(arr)); //3
      System.out.println(minimumPlatforms(arr2)); //1
   }
   
   /**
   * Finds the minimum number of platforms required so that no train waits.
   * 
   * @param arr The arrival and departure times of the trains in order of their arrival
   * @return The minimum number of platforms needed
   */
   static int minimumPlatforms(int[][] arr){
      ArrayList<int[]> result = new ArrayList<int[]>();
      
      for(int[] i : arr){
         if(result.size() > 0){
            for(int j = 0; j < result.size(); j++){
               //If the departure time of the nodes in result < arrival time of the current node
               if(result.get(j)[1] < i[0]){
                  result.add(j, i);
                  result.remove(j+1);
                  break;
               }else if(j == result.size()-1){
                  result.add(i);
                  break;
               }
            }
         }else{
            result.add(i);
         }
      }
      
      return result.size();
   }
}