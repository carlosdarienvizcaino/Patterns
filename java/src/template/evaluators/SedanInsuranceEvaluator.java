package template.evaluators;

/**
 *  method: vehicleInsuranceFee() is a hook to the template method
 *  getQuoteForVehicle()
* */

public class SedanInsuranceEvaluator extends InsuranceEvaluator {

    @Override
    protected double vehicleInsuranceFee(){
        // Complex logic goes here ...
        return 5.0;
    }
}
