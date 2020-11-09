/*
This problem was recently asked by LinkedIn:
Given a list of points as a tuple (x, y) and an integer k, 
find the k closest points to the origin (0, 0).
*/

import java.lang.Math;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

class ClosestPoints{
   public static void main(String[] args){
      int[][] arr = {{-3, 4}, {3, 1}, {0, 0}, {1, 2}};
      ArrayList<int[]> result = closestPoints(arr, 2);
      for(int[] i : result){
         System.out.print("(" + i[0] + ", " + i[1] + ") ");
      }
   }
   
   /**
   * Finds the k closest points to the origin in a given array of points
   * 
   * @param arr The array to be processed
   * @param k The number of points to find
   * @return An arraylist containing the k points closest to the origin
   */
   static ArrayList<int[]> closestPoints(int[][] arr, int k){
      ArrayList<int[]> result = new ArrayList<int[]>();
      ArrayList<double[]> dist = new ArrayList<double[]>();
      
      //Add the first k elements of the array into the ArrayList    
      //dist ArrayList will have the formal {distance from origin, index of point in arr};  
      for(int i = 0; i < k; i++){
         double tmp[] = {Math.sqrt(Math.pow(arr[i][0], 2) + Math.pow(arr[i][1], 2)), i};
         dist.add(tmp);
      }
      //Sort the arraylist by distance from origin
      Collections.sort(dist, new SortByLength());
      
      //For the remaining elements check if its smaller than the elements in the array
      for(int i = k; i < arr.length; i++){
         double tmp[] = {Math.sqrt(Math.pow(arr[i][0], 2) + Math.pow(arr[i][1], 2)), i};
         //If the current distance is less than the largest distance in the dist ArrayList
         if(tmp[0] < (dist.get(dist.size()-1))[0]){
            int j = dist.size()-1;
            //Find the proper position to put the tmp variable in the array
            while(j > 0 && tmp[0] < (dist.get(j))[0]){
               j--;
            }
            dist.add(j, tmp);
            //Remove the last element in the array
            dist.remove(dist.size()-1);
         }
      }
      
      //Add the points to the result array
      for(double[] i : dist){
         result.add(arr[(int)(i[1])]);
      }
      return result;
   }    
}

class SortByLength implements Comparator<double[]>{
   /**
   * Compares the length of two points from the origin
   * 
   * @param arr1
   * @param arr2
   * @return -1 If arr1 < arr2, 1 if arr1 > arr2, or 0 otherwise
   */
   @Override
   public int compare(double[] arr1, double[] arr2){
      if(arr1[0] > arr2[0]){
         return 1;
      }else if(arr1[0] < arr2[0]){
         return -1;
      }else{
         return 0;
      }
   }
}