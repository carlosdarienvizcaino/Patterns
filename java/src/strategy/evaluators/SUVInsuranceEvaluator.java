package strategy.evaluators;

public class SUVInsuranceEvaluator implements InsuranceEvaluator {

    public int getQuoteForVehicle(int data) {
        return data+10;
    }
}
