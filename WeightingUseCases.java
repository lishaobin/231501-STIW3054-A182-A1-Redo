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
public class WeightingUseCases {
    Scanner s =new Scanner(System.in);
  public int usq,uaq,ucq,tuc;
  
  
  public void CaculateWeightingUseCases(){
      
      WeightingUseCases w =new WeightingUseCases();
      
  try{
  System.out.println("=================================================================================================")  ;   
  System.out.println("|                               Weighting Use Cases                                             |")  ;   
  System.out.println("=================================================================================================")  ;   
  System.out.println("|Use Case Type |      Description                         |       Weight Factor       |     Qnty  ");
  System.out.print  ("| Simple       |       3 or fewer transactions            |              5            |       "); 
   usq=s.nextInt();
  System.out.print  ("| Average      |        4 to 7 transactions               |              10           |       "); 
   uaq=s.nextInt();
  System.out.print  ("| Complex      |      Greater than 7 transactions         |              15           |       "); 
   ucq=s.nextInt();
   tuc=5*usq+(10*uaq)+(15*ucq);
  System.out.println("|                       Total Actor Points                                            |       "+tuc);
  System.out.println("=================================================================================================")  ; 
  }
  catch (Exception e){
         System.out.println("=============================================") ; 
         System.out.println(" \n ||    Pleace input number !!!!!  ||\n");
         System.out.println("=============================================") ;
            w.CaculateWeightingUseCases();
            tuc=w.tuc;
         }
  }
}
  
  

