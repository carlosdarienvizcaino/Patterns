package strategy.evaluators;

public class SedanInsuranceEvaluator implements InsuranceEvaluator{

    public int getQuoteForVehicle(int data) {
       // TODO: Logic goes here
        return data+5;
    }
}
