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
class MHforRisk { 
    Scanner s =new Scanner(System.in);
    public static double MH,MHR,p;
    public void CaculateMHR(double MH){
        this.MH=MH;
        
    System.out.println(" Identify the assumptions and apply a coefficient as a percentage :  ");
    p=s.nextDouble();
    MHR=(1+p)*MH;
    System.out.println("======================================================================================================")  ; 
    System.out.println("|                       Adjusting Man-hours for Risk                               |       "+MHR+"        | ")  ;
    System.out.println("======================================================================================================\n\n\n\n")  ;
    
    }
}
