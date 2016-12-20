// Looping Example for Arrays
// by Urban Reininger
// Fall 2016

import java.util.Random; 

public class LoopThrough20
{
   public static void main(String args[]){
       
        int sum = 0; // this is for the adding loop
               
        int[] arr = new int[20];
        String[] snacks = {"m&m", "crunch", "mounds", "ramen"};
        
        // This creates an instace of the random util
        Random randomGenerator = new Random();
     
        
        // this for loop prints out the numbers 0 to 20
        for(int i =0; i<=20; i++){
            System.out.println(i);
        }
        
        // this for loop prints out the numbers 20 to 0
        for(int i =20; i>=0; i--){
            System.out.println(i);
        }
        
        // this for loop adds up the numbers 0 to 20 and prints it out
        for(int i =0; i<=20; i++){
            sum = sum + i;
            System.out.println(sum);
        }
        
        // this for loop prints out 20 random numbers
        for(int i =0; i<=20; i++){
            int randomInt = randomGenerator.nextInt(20);
            System.out.println(randomInt);
        } 
        
        // this for loop prints out 20 random numbers
        for(int i =0; i<20; i++){
            int randomInt = randomGenerator.nextInt(20);
            arr[i]= randomInt;
            System.out.print(arr[i]+",");
           
        } 
        
        // this is a loop that prints out all of the snacks
        for(int i = 0; i < snacks.length; i++)
        {
            //System.out.println(i);
            //System.out.println(snacks[i]);             
        }
       
    }
}
