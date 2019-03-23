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
public class WeightingTechnicalFactors {
     Scanner s =new Scanner(System.in);
     public static int pr1,pr2,pr3,pr4,pr5,pr6,pr7,pr8,pr9,pr10,pr11,pr12,pr13; 
     public static double TFactor ;
     
     public void CaculateWeightingTechnicalFactoprrs(){
         WeightingTechnicalFactors w =new WeightingTechnicalFactors();
         try{
         System.out.println("======================================================================================================")  ; 
         System.out.println("|                        Weighting Technical Factors                                             |")  ;
         System.out.println("======================================================================================================")  ;
         System.out.println("|Technical Factor|               Factor Description                  |Weight Factor|Project Rating ")  ;
         System.out.print ("|      TF1       |          Must have a distributed solution         |       2     |      " )  ;
         pr1=s.nextInt();
         System.out.print ("|      TF2       |   Must respond to specific performance objectives |       1     |      " )  ;
         pr2=s.nextInt();
         System.out.print ("|      TF3       |      Must meet end-user efficiency desires        |       1     |      " )  ;
         pr3=s.nextInt();
         System.out.print ("|      TF4       |          Complex internal processing              |       1     |      " )  ;
         pr4=s.nextInt();
         System.out.print ("|      TF5       |             Code must be reusable                 |       1     |      " )  ;
         pr5=s.nextInt();
         System.out.print ("|      TF6       |             Must be easy to install               |       0.5   |      " )  ;
         pr6=s.nextInt();
         System.out.print ("|      TF7       |             Must be easy to use                   |       0.5   |      " )  ;
         pr7=s.nextInt();
         System.out.print ("|      TF8       |               Must be portable                    |       2     |      " )  ;
         pr8=s.nextInt();
         System.out.print ("|      TF9       |             Must be easy to change                |       1     |      " )  ;
         pr9=s.nextInt();
         System.out.print ("|      TF10      |          Must allow concurrent users              |       1     |      " )  ;
         pr10=s.nextInt();
         System.out.print ("|      TF11      |       Includes special security features          |       1     |      " )  ;
         pr11=s.nextInt();
         System.out.print ("|      TF12      |     Must provide direct access for 3rd parties    |       1     |      " )  ;
         pr12=s.nextInt();
         System.out.print ("|      TF13      |     Requires special user training facilities     |       1     |      " )  ;
         pr13=s.nextInt();
         
         TFactor =pr1*2+pr2+pr3+pr4+pr5+pr6*0.5+pr7*0.5+pr8*2+pr9+pr11+pr12+pr13;
         System.out.println("|                               Total TFactor                                      |     "+ TFactor+"" )  ;
         System.out.println("======================================================================================================")  ;
         }
         catch (Exception e){
         System.out.println("=============================================") ; 
         System.out.println(" \n ||    Pleace input number !!!!!  ||\n");
         System.out.println("=============================================") ;
             w.CaculateWeightingTechnicalFactoprrs();
             TFactor=w.TFactor;
         }
         
     
     
     }
    
}
