package strategy.evaluators;

public class InvalidVehicleEvaluator implements InsuranceEvaluator {
    public int getQuoteForVehicle(int data) {
        return -1;
    }
}
