package strategy;

import strategy.evaluators.SUVInsuranceEvaluator;
import strategy.evaluators.SedanInsuranceEvaluator;
import strategy.models.InsuranceCompany;

/**
 * Main is the client class
 * */
public class Main {
    public static void main(String[] args){

        InsuranceCompany insuranceCompany = new InsuranceCompany();
        int defaultQuote = insuranceCompany.getQuoteForVehicle();

        // Calculating Insurance for USV
        insuranceCompany.setInsuranceEvaluator(new SUVInsuranceEvaluator());
        int  suvQuote = insuranceCompany.getQuoteForVehicle();

        // Calcualting Insurace for Sedan
        insuranceCompany.setInsuranceEvaluator(new SedanInsuranceEvaluator());
        int sedanQuote = insuranceCompany.getQuoteForVehicle();

        print(defaultQuote);
        print(suvQuote);
        print(sedanQuote);

    }

    public static void print(Object o){
        System.out.println(o);
    }

}
