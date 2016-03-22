package strategy;

import strategy.evaluators.InsuranceEvaluator;
import strategy.evaluators.InsuranceEvaluatorFactory;
import strategy.models.Vehicle;

public class InsuranceCompany {

    public InsuranceCompany(){}

    public int getQuoteForVehicle(Vehicle vehicle){

        InsuranceEvaluator insuranceEvaluator = InsuranceEvaluatorFactory.createInsuranceEvaluator(vehicle);

        int quote = insuranceEvaluator.getQuoteForVehicle();

        return quote;
    }
}
