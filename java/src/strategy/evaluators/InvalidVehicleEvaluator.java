package strategy.evaluators;

public class InvalidVehicleEvaluator implements InsuranceEvaluator {

    public int getQuoteForVehicle() {
        return -1;
    }
}
