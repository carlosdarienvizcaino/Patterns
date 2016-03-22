var insuraceEvaluatorFactory = require("../evaluators/InsuranceEvaluatorFactory")();

function InsuraceCompany(){
  return {    
      quoteVehicle: function(vehicle){
           
           // Get Evaluator
           var evaluator = insuraceEvaluatorFactory.createEvaluator(vehicle);
           
           // return quote
           return evaluator.getQuote();
        }
   };
}

module.exports = InsuraceCompany; 
