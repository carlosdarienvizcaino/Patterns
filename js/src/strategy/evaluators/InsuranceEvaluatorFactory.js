
// Evaluators are depencies for the Factory Module
var SUVInsuranceEvaluator = require("./SUVInsuranceEvaluator");
var InvalidInsuraceEvaluator = require("./InvalidInsuranceEvaluator");

function InsuraceEvaluatorFactory(){
    var that = this;  
    this.evaluators = {
        "SUV": SUVInsuranceEvaluator
    }
    return {
        createEvaluator : function(vehicleType){
          var evaluator = that.evaluators[vehicleType];        
          return evaluator === undefined ? InvalidInsuraceEvaluator : evaluator;
        }  
    };
}

module.exports = InsuraceEvaluatorFactory;