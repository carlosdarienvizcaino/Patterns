package template;

import template.evaluators.SUVInsuranceEvaluator;
import template.evaluators.SedanInsuranceEvaluator;
import template.models.InsuranceCompany;

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
        double defaultQuote = insuranceCompany.getQuoteForVehicle();

        // Calculating Insurance for USV
        insuranceCompany.setInsuranceEvaluator(new SUVInsuranceEvaluator());
        double suvQuote = insuranceCompany.getQuoteForVehicle();

        // Calcualting Insurace for Sedan
        insuranceCompany.setInsuranceEvaluator(new SedanInsuranceEvaluator());
        double sedanQuote = insuranceCompany.getQuoteForVehicle();

        print("Default quote is -1.0. Result is " + defaultQuote);
        print("SUV quote is 10.8. Result is " + suvQuote);
        print("Sedan quote is 10.5. Result is " + sedanQuote);

    }

    public static void print(Object o){
        System.out.println(o);
    }

}
