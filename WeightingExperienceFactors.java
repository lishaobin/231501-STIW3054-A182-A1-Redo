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
public class WeightingExperienceFactors {
    public static int er1,er2,er3,er4,er5,er6,er7,er8; 
    public static double TEF ;
    Scanner s =new Scanner(System.in);
    public  void CaculateTEF(){
        WeightingExperienceFactors w =new WeightingExperienceFactors();
        try{
    System.out.println("======================================================================================================")  ; 
    System.out.println("|                          Weighting Experience Factors                                              |")  ;
    System.out.println("======================================================================================================")  ;
    System.out.println("|Experience Factor|                 Factor Description                  |Weight Factor|Project Rating ")  ;
    System.out.print  ("|       E1        |         Familiar with FPT software process          |      1      |       ")  ;
    er1=s.nextInt();
    System.out.print  ("|       E2        |              Application experience                 |     0.5     |       ")  ;
    er2=s.nextInt();
    System.out.print  ("|       E3        |             Paradigm experience (OO)                |      1      |       ")  ;
    er3=s.nextInt();
    System.out.print  ("|       E4        |             Lead analyst capability                 |     0.5     |       ")  ;
    er4=s.nextInt();
    System.out.print  ("|       E5        |                    Motivation                       |      0      |       ")  ;
    er5=s.nextInt();
    System.out.print  ("|       E6        |              Stable Requirements                    |      2      |       ")  ;
    er6=s.nextInt();
    System.out.print  ("|       E7        |              Stable Requirements                    |     -1      |       ")  ;
    er7=s.nextInt();
    System.out.print ("|       E8        |         Difficulty of programming language          |     -1      |       ")  ;
    er8=s.nextInt();
     
    TEF=er1+0.5*er2+er3+0.5*er4+2*er6-er7-er8;
    System.out.println("|                               Total EFactor                                          |      "+ TEF+"" )  ;
    System.out.println("======================================================================================================")  ;
       }
        
      catch(Exception e){
       System.out.println("=============================================") ; 
       System.out.println(" \n ||    Pleace input number !!!!!  ||\n");
       System.out.println("=============================================") ;
       w.CaculateTEF();
       TEF=w.TEF;
      }
    }
    
}
