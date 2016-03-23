package strategy.models;

import strategy.evaluators.InsuranceEvaluator;
import strategy.evaluators.InvalidVehicleEvaluator;


/**
 * InsuraceCompany
 *  Is the Context class
 *  Has a reference to a Strategy class
 *  Has an InvalidVehicleEvaluator Strategy by Default
 *  Is the used by the Client
 *  Passes Data (an integer) to the Strategy;
 * */
public class InsuranceCompany {

    private InsuranceEvaluator insuranceEvaluator;
    private int insuranceCompanyFee = 5;

    public InsuranceCompany(){
        insuranceEvaluator = new InvalidVehicleEvaluator();
    }

    public void setInsuranceEvaluator(InsuranceEvaluator evaluator){
        this.insuranceEvaluator = evaluator;
    }

    public int getQuoteForVehicle(){
        return insuranceEvaluator.getQuoteForVehicle(insuranceCompanyFee);
    }
}
