/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_technique;

import static OOP_technique.manipulated_String.pr;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class ARRAY_LIST {
  public static String ARY(){
      ArrayList NAME = new ArrayList();
       String ca = "";
       ca = NAME.toString();
    NAME.add("PERRY");
    NAME.add("ROSE");
    NAME.add("MARY");
    NAME.add("ALBERT");
    NAME.add(0, ca);
    System.out.println(NAME);
   
    return ca;
  }  
}
        
   
  
      
 


