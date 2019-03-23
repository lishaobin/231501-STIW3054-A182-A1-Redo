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
public class WeightingReportsforComplexity {
    Scanner s =new Scanner(System.in);
    public static int rsq,raq,rcq,rsa,raa,rca,TRME; 
    
    public void CaculateTRME(){
        WeightingReportsforComplexity w =new WeightingReportsforComplexity();
         try{
    System.out.println("======================================================================================")  ; 
    System.out.println("|                         Weighting Reports for Complexity                           |")  ;
    System.out.println("======================================================================================")  ;
    System.out.println("|      Report Type      |              Quantity               |  Average Man-hours  ")  ;
    System.out.print  ("|        Simple         |                 ")  ;
    rsq=s.nextInt();           
    System.out.print  ("                                                              |         ");
    rsa=s.nextInt(); 
    System.out.print  ("|        Average        |                 ")  ;
    raq=s.nextInt(); 
    System.out.print  ("                                                              |         ");
    raa=s.nextInt(); 
    System.out.print  ("|        Complex        |                 ")  ;
    rcq=s.nextInt();    
    System.out.print  ("                                                              |         ");
    rca=s.nextInt();
  
   
    TRME =rsq*rsa+raq*raa+rcq*rca;
    System.out.println("|               Total Report Man-hour Estimate                 |       "+TRME+"        |")  ;
     }
   catch (Exception e){
         System.out.println("=============================================") ; 
         System.out.println(" \n ||    Pleace input number !!!!!  ||\n");
         System.out.println("=============================================") ;
    w.CaculateTRME();
    TRME=w.TRME;
   }
    } 
    
}
