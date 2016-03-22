package strategy.evaluators;

import strategy.models.vehicles.Vehicle;

public enum InsuranceEvaluatorFactory {

    SUV_VEHICLE("SUV"){
        public InsuranceEvaluator makeInsuranceEvaluator(){
            return new SUVInsuranceEvaluator();
        }
    },
    SEDAN_VEHICLE("Sedan"){
        public InsuranceEvaluator makeInsuranceEvaluator(){
            return new SedanInsuranceEvaluator();
        }
    },
    INVALID_VEHICLE("Default"){
        public InsuranceEvaluator makeInsuranceEvaluator(){
            return new InvalidVehicleEvaluator();
        }
    };

    private String vehicleType;

    InsuranceEvaluatorFactory(String vehicleType){
        this.vehicleType = vehicleType;
    }

    public String getVehicleType(){
        return vehicleType;
    }

    public abstract InsuranceEvaluator makeInsuranceEvaluator();

    public static InsuranceEvaluator createInsuranceEvaluator(Vehicle vehicle){

        try {
            InsuranceEvaluatorFactory evaluator = InsuranceEvaluatorFactory.getVehicle(vehicle.getVehicleType());
            return evaluator.makeInsuranceEvaluator();
        }
        catch ( NullPointerException e){
            return new InvalidVehicleEvaluator();
        }
    }

    public static InsuranceEvaluatorFactory getVehicle(String type){

        for(InsuranceEvaluatorFactory i : InsuranceEvaluatorFactory.values()){

            if( i.getVehicleType().equals(type)){
                return i;
            }
        }
        return InsuranceEvaluatorFactory.INVALID_VEHICLE;
    }
}
