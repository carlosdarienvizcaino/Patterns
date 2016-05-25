package template.evaluators;
/**
 *  This class has a template method: getQuoteForVehicle
 *  the template method has an invariant method: companyAndStateFee()
 *  and a variant (or primitive, hoo operation) method: vehicleInsuranceFee()
 *
 *  Although this class implements a default behavior. The subclasses
 *  such as SUVInsuranceEvaluator will implement a more concrete behavior
 *  of the vehicleInsuranceFee() method.
 *
 * */
public class InsuranceEvaluator {

    // This is the template method
    // And it has a default implementation
    public double getQuoteForVehicle(double stateFee){
        double finalFee = 0;

        finalFee += companyAndStateFee(stateFee);

        finalFee += vehicleInsuranceFee();

        return finalFee;
    }

    private double companyAndStateFee(double stateFee){
       return stateFee * 1.10;
    }

    protected double vehicleInsuranceFee(){
        return 0;
    }
}
