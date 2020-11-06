/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_technique;

import java.lang.reflect.Array;
import javax.swing.JOptionPane;



/**
 *
 * @author hp
 */
public class manipulated_String extends ARRAY_LIST {
     static  String pr = "perry jhone g gordonas";
    private static  String ff = "";
 private static int no = 0;
 private static String ss ="";
  public static void cc(String c){
     no = Integer.parseInt(c);    
  }
   public static void qq(String q){
    ss = String.valueOf(q);
  }
  
 public static  char pr(){
     char p ;
     
 p = pr.charAt(no);
  return p;
 }
 

 public static  int p(){
     int d =0;
     d = pr.indexOf(ss);
     return d;
 }}




 