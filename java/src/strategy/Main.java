package strategy;

import strategy.models.InsuranceCompany;
import strategy.models.vehicles.SUVVehicle;
import strategy.models.vehicles.SedanVehicle;

/**
 * Main is the client class
 * */
public class Main {
    public static void main(String[] args){
        InsuranceCompany insuranceCompany = new InsuranceCompany();
        int quote1 = insuranceCompany.getQuoteForVehicle( new SUVVehicle() );
        int quote2 = insuranceCompany.getQuoteForVehicle( new SedanVehicle() );

        // Null represents any vehicle that is not supported
        int quote3 = insuranceCompany.getQuoteForVehicle(null);

        print(quote1);
        print(quote2);
        print(quote3);

    }

    public static void print(Object o){
        System.out.println(o);
    }

}
