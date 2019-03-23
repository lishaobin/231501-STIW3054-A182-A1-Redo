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
class UnadjustedUseCasePoints {
    public static int uucp,tap,tuc;
    public void CaculateUUCP(int tap,int tuc){
    this.tap=tap;
    this.tuc=tuc; 
    uucp=tap+tuc;
    System.out.println("=================================================================================================")  ; 
    System.out.println("|                    Unadjusted Use Case Points                     |            "+uucp+"        |")  ;   
    System.out.println("=================================================================================================\n\n\n\n")  ;   
    
    }
    
}
