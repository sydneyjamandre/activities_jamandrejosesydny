/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skills_test;

/**
 *
 * @author hp
 */
public class skill_test_no1 {
    public static void main(String arg[]){
        
        //********COPY ARRAY********//
        
        
        int a[] = {10, 19, 50,20,88}; 
        int b[] = new int[a.length];
      b=a;
       System.out.println(" array a[] is:  "); 
        for (int i=0; i<a.length; i++) 
            System.out.print(a[i]+" "); 
        System.out.println("\n\n array b[] is: "); 
        for (int i=0; i<b.length; i++) 
            System.out.print(b[i] + " "); 
    } 
    }
    
    
    
    
    
    
    

