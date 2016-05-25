package template.models;

import template.evaluators.InsuranceEvaluator;
import template.evaluators.InvalidVehicleEvaluator;

/**
 * InsuranceCompany is the Context class
 *
 * We set the specific strategy we want to use SUV or Sedan,
 * then the client (us) request for the quote of the vehicle.
 *
 *
 * */
public class InsuranceCompany {

    private InsuranceEvaluator insuranceEvaluator;
    private double insuranceCompanyFee = 5;

    public InsuranceCompany(){
        insuranceEvaluator = new InvalidVehicleEvaluator();
    }

    public void setInsuranceEvaluator(InsuranceEvaluator evaluator){
        this.insuranceEvaluator = evaluator;
    }

    public double getQuoteForVehicle(){
        return insuranceEvaluator.getQuoteForVehicle(insuranceCompanyFee);
    }
}
