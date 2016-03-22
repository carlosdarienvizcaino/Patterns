
var InsuranceEvaluator = require("./InsuranceEvaluator");

var InvalidInsuranceEvaluator = Object.create(InsuranceEvaluator);

InvalidInsuranceEvaluator.getQuote= function(){
    return -1; 
}

module.exports = InvalidInsuranceEvaluator;

