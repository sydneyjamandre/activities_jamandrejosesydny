
import java.io.File;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class skill_test_no6 {
    
    
    //**********reading file if exist******//
    
   
       public static void main(String[] args) {
       
        File akonfile = new File("C:\\Users\\hp\\Downloads\\activities_perryjhonegordonas-main");
         if (akonfile.exists()) 
           {
            System.out.println("The directory or file exists.\n");
           } 
         else
          {
            System.out.println("The directory or file does not exist.\n");
          }
       }
  } 
 

