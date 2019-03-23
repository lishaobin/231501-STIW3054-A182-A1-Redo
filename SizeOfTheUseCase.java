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
class SizeOfTheUseCase {
     public static  int  UUCP;
     public static double TCF,SzUC;
     public void CaculateSzUC(int  UUCP,double TCF){
     this.UUCP=UUCP;
     this.TCF=TCF;
     SzUC=UUCP*TCF;
      System.out.println("======================================================================================================")  ;
      System.out.println("|                    size of the software (use case)                               |            "+SzUC+"")  ;
      System.out.println("======================================================================================================\n\n\n\n")  ;
     
     
     
     }
}
