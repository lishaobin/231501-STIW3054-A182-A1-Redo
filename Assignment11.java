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
public class Assignment11 {
 public static int tap,tuc,UUCP,er1,er2,er3,er4,er5,er6,er7,er8,TRME;
 public static double TFactor,TCF,SzUC,TEF,EF,UCP,MH,MHR;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WeightingActors wa=new  WeightingActors(); 
        wa.CaculateWeightingActors();
        tap= wa.tap;
        WeightingUseCases  wuc=new  WeightingUseCases();
        wuc.CaculateWeightingUseCases();
        tuc=wuc.tuc;
        UnadjustedUseCasePoints uucp=new UnadjustedUseCasePoints();
        uucp.CaculateUUCP(tap,tuc);
        UUCP=uucp.uucp;
        WeightingTechnicalFactors wtf= new  WeightingTechnicalFactors();
        wtf.CaculateWeightingTechnicalFactoprrs();
        TFactor=wtf.TFactor;
        TechnicalComplexityFactor tcf= new TechnicalComplexityFactor(); 
        tcf.CaculateTCF(TFactor, UUCP);
        TCF=tcf.TCF;
        SizeOfTheUseCase sotuc= new SizeOfTheUseCase();
        sotuc.CaculateSzUC(UUCP, TCF);
        SzUC=sotuc.SzUC;
        WeightingExperienceFactors wef=new WeightingExperienceFactors();
        wef.CaculateTEF();
        
        er1=wef.er1;
        er2=wef.er2;
        er3=wef.er3;
        er4=wef.er4;
        er5=wef.er5;
        er6=wef.er6;
        er7=wef.er7;
        er8=wef.er8;
        
        TEF=wef.TEF;
        ExperienceFactor ef = new  ExperienceFactor(); 
        ef.CaculateEF(TEF);
        EF=ef.EF;
        UseCasePoints ucp =new  UseCasePoints(); 
        ucp.CaculateUCP(EF, SzUC);
        UCP=ucp.UCP;
        Man_hours mh=new Man_hours();
        mh.CaculateMH(er1, er2, er3, er4, er5, er6, er7, er8, UCP);
        MH=mh.MH;
        MHforRisk mhr=new MHforRisk();
        mhr.CaculateMHR(MH);
        MHR=mhr.MHR;
        WeightingReportsforComplexity wrfc =new  WeightingReportsforComplexity();
        wrfc.CaculateTRME();
        TRME = wrfc.TRME;
        TotalManHours tmh =new TotalManHours();
        tmh.CaculateTMH(MHR, TRME);
         
                
        
        
    }
    
}
