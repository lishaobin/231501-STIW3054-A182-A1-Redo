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
class TotalManHours {
    public static double TMH,MHR;
       public static int TRME;
       public void CaculateTMH(double MHR, int TRME){
       this.TRME=TRME;
       this.MHR=MHR;
       TMH=MHR+TRME;
       System.out.println("======================================================================================")  ; 
       System.out.println("|                         Total Man-Hours                            |"+TMH+"         |")  ;
       System.out.println("======================================================================================")  ;
    }
}
