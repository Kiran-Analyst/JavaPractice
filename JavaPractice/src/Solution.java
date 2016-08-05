import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    

    public static void insertIntoSorted(int[] ar) {
        // Fill up this function 
    	System.out.println("Insert Function called");
        int arLength = ar.length;
        int lastElement = ar[arLength-1];
        for(int i=arLength-2;i>=0;i--){
            if(lastElement<ar[i]){
                ar[i+1]=ar[i];
                printArray(ar);
            }
            
            else{
                ar[i+1]=lastElement;
                printArray(ar);
                break;
            }
            
        }
    }
    
    
/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
         System.out.println("No Call");
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    
    
}
 
