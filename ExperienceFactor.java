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
class ExperienceFactor {
    public static double TEF,EF;
    public void CaculateEF(double TEF){
        this.TEF=TEF;
        EF=1.4-0.03*TEF;
    System.out.println("======================================================================================================")  ; 
    System.out.println("|                               Total EFactor                                          |      "+ EF+"")  ;
    System.out.println("======================================================================================================")  ;
    
    }
}
