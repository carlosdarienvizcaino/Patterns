package template.evaluators;

public class InvalidVehicleEvaluator extends InsuranceEvaluator {

    @Override
    public double getQuoteForVehicle(double num){
        return -1;
    }

}
