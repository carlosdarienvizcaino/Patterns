package strategy.evaluators;

/**
 *  Used as the default algorithm for InsuranceCompany
 */

public class SUVInsuranceEvaluator implements InsuranceEvaluator {

    public int getQuoteForVehicle(int data) {
        return data+10;
    }
}
