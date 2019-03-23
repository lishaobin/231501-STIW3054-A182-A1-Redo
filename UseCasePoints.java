/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment11;

/**
 *
 * @author 11474
 */
public class UseCasePoints {
    public static double SzUC,EF,UCP;
    public void CaculateUCP(double EF,double SzUC){
        this.EF=EF;
        this.SzUC=SzUC;
        UCP=SzUC*EF;
    System.out.println("======================================================================================================")  ; 
    System.out.println("|                                 Use Case Points                                       |      "+ UCP+"")  ;
    System.out.println("======================================================================================================\n\n\n\n")  ;
    
    }
} 

