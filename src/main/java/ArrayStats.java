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
        int [] TestData = {1,2,3,4,5,6,7,8,9,10,12,13,14,15,16,17,18,19,20};
        
        
    }
    
    public static int getTotal(int [] Array){
        
     
    }
     public static int getAverage(int [] Array){
         
         
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
    
