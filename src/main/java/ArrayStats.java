/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jacks
 */
public class ArrayStats {
    public static void main(String[] args) {
        int [] TestData = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int Total = getTotal(TestData);
        double Average = getAverage(TestData);
        int Highest = getHighest(TestData);
        int Lowest = getLowest(TestData);
        
        System.out.println("The total of the values in the array is " + Total);
        System.out.println("The average of the values in the array is " + Average);
        System.out.println("The highest value in the array is " + Highest);
        System.out.println("The lowest values in the array is " + Lowest);
    } 
    
    public static int getTotal(int [] Array){
        int total = 0;
        for (int i = 0; i < Array.length; i++){
            total += Array[i];
        }
        return total;
        }
                
     
    
     public static double getAverage(int [] Array){
        double total = 0;
        for (int i = 0; i < Array.length; i++){
            total += Array[i];
        }
        double average = total / Array.length;
        return average;
    }
     
      public static int getHighest(int [] Array){
    
      int highest = Array [0];
      for (int i = 1; i < Array.length; i++) { 
      if (Array [i] > highest)
          highest = Array[i];}
      
      return highest;}
      
       public static int getLowest(int [] Array){
           
           
      int lowest = Array [0];
      for (int i = 1; i < Array.length; i++) { 
      if (Array [i] < lowest)
          lowest = Array[i];}
      
      return lowest;
    }
    }
    
