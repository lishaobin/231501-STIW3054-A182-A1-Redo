/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment11;

import java.util.Scanner;

/**
 *
 * @author 11474
 */
public class WeightingActors {
     public  int asq,aaq,acq,tap;
    Scanner s=new Scanner(System.in);
    
    public void CaculateWeightingActors(){
        WeightingActors w =new WeightingActors();
     
     try{
   System.out.println("=================================================================================================")  ;    
   System.out.println("|                           Weighting Actors for Complexity                                      |")  ;   
   System.out.println("=================================================================================================")  ;   
   System.out.println("|Actor Type |      Description                         |       Weight Factor       |     Qnty  ");
   System.out.print  ("| Simple    |       Defined API                        |              1            |       "); 
   asq=s.nextInt();
   System.out.print  ("| Average   | Interactive or Protocol driven interface |              2            |       "); 
   aaq=s.nextInt();
   System.out.print  ("| Complex   |      Graphical User Interface            |              3            |       "); 
   acq=s.nextInt();
 
   tap=1*asq+(2*aaq)+(3*acq);
   System.out.println("|                       Total Actor Points                                         |       "+tap);
   System.out.println("=================================================================================================")  ;    
    }
    catch(Exception e){
         System.out.println("=============================================") ; 
         System.out.println(" \n ||    Pleace input number !!!!!  ||\n");
         System.out.println("=============================================") ;
         w.CaculateWeightingActors();
         tap = w.tap;
         
     }
     
    }
    
}
