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
public class TechnicalComplexityFactor {
    public static double TFactor,TCF;
     public static  int  UUCP;
     public  void CaculateTCF(double TFactor, int  UUCP){
         this.TFactor=TFactor;
         this.UUCP=UUCP;
         TCF=0.01*(TFactor+UUCP);
                
         System.out.println("======================================================================================================")  ;
         System.out.println("|                       Technical Complexity Factor                                |            "+TCF+"")  ;
         System.out.println("======================================================================================================")  ;


}
}
