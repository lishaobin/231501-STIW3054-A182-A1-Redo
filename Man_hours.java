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
public class Man_hours {
    public static int er1,er2,er3,er4,er5,er6,er7,er8,ER,x; 
    public static double UCP,MH;
    public void CaculateMH(int er1,int er2,int er3,int er4,int er5,int er6,int er7,int er8,double UCP){
    this.er1=er1;
    this.er2=er2;
    this.er3=er3;
    this.er4=er4;
    this.er5=er5;
    this.er6=er6;
    this.er7=er7;
    this.er8=er8;
    this.UCP= UCP;
    x=0;
    if (er1<3)
        x++;
    if (er2<3)
        x++;
    if (er3<3)
        x++;
    if (er4<3)
        x++;
    if (er5<3)
        x++;
    if (er6<3)
        x++;
    if (er7>=3)
        x++;
    if (er8>=3)
        x++;
    if (x<=2)
        ER=20;
    if (x>2)
        ER=28;
  
    
    MH=ER*UCP;
    System.out.println("======================================================================================================")  ; 
    System.out.println("|                                 Man-hours from UCP                                    |      "+ MH+"")  ;
    System.out.println("======================================================================================================\n\n\n\n")  ;
    }
}
