
import java.io.File;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class skill_test_no7 {
      public static void main(String args[]) throws IOException {
      
      File myfiles = new File("C:\\Users\\hp\\Documents\\GitHub");
      if (myfiles.exists()) {
    
     String contents[] = myfiles.list();
      System.out.println("List of file/directory is: ");
      for(int i=0; i<contents.length; i++) 
         System.out.println(contents[i]);
        }else{
          System.out.println("file does not exist.\n");
      }
      }
}
      
