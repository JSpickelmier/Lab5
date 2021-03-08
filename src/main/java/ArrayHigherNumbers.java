/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jacks
 */
public class ArrayHigherNumbers {
    public static void main(String[] args) {
        int [] SampleValues = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int greatnumb = 1;
        int counted = ArrayCount(SampleValues, greatnumb);
        
        
        
    System.out.println("The array contains " + counted + " nubers greater than " + greatnumb);
        
    }      
    
    public static int ArrayCount (int [] Array, int inputNumb){
        int count = 0;
    
            for (int number : Array) {
            if (number > inputNumb) {
                count ++;}}
            
            return count;
}
   
    
}
    

