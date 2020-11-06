/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skills_test;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Skills_test_no2 {
    
  //******  //CALCULATE EMLEMENTS OF ARRAY//*******
    
    
    public static void main(String arg[]){
        Scanner put = new Scanner(System.in);
        System.out.println("how many numbers??:");
        int array = put.nextInt();
        
        double[] arr = new double[array];
        double ave = 0;
        
        for (int i = 0; i < arr.length;i++){
           System.out.println("enter no"+"("+(i+1)+")" +":");
            arr[i] = put.nextDouble();
             
        }
  
        for(int i=0; i < arr.length;i++){
            ave = ave + arr[i];  
        }double average = ave / arr.length;
        System.out.println("average of array elements is: "+ average);
    } 
    }
