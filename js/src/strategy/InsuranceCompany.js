var InvalidInsuranceEvaluator = require("./evaluators/InvalidInsuranceEvaluator");

function InsuraceCompany(){
    var that = this;
    this.insuranceFee = 5;
    this.insuranceEvaluator = InvalidInsuranceEvaluator;
  return {    
      
      setInsuranceEvaluator : function(evaluator){
          that.insuranceEvaluator = evaluator;
          
      },
      quoteVehicle: function(){
           return that.insuranceEvaluator.getQuote(that.insuranceFee);
        }
   };
}

module.exports = InsuraceCompany; 