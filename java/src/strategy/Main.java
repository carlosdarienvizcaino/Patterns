package strategy;

import strategy.evaluators.SUVInsuranceEvaluator;
import strategy.evaluators.SedanInsuranceEvaluator;
import strategy.models.InsuranceCompany;

/**
 * Main is the Client class
 *  Knows about the Context (InsuraceCompany) class
 *  Knows about the different strategies there is
 *      In order to abstract the Client from the Strategies
 *      a Factory class could be used in order to create a strategy given the
 *      clients need.
 *
 *      Client ==>
 *                  Context ==>
 *                              StrategyFactory
 *                              <== Strategy (requested Strategy
 *
 *      Perhaps the client could give an input like a String "SUV"
 *
 *
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

        print("Default quote is -1. Result is " + defaultQuote);
        print("SUV quote is 15. Result is " + suvQuote);
        print("Sedan quote is 10. Result is " + sedanQuote);

    }

    public static void print(Object o){
        System.out.println(o);
    }

}
