package strategy.evaluators;
/**
 *  Favours Open Closed Principle
 *      when a new Strategy is needed
 *
 *  Program to an interface not to an implementation
 * */
public interface InsuranceEvaluator {

    int getQuoteForVehicle(int data);
}
