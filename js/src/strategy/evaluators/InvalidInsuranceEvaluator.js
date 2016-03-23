
var InsuranceEvaluator = require("./InsuranceEvaluator");

function InvalidInsuranceEvaluator(){}

InvalidInsuranceEvaluator.prototype = InsuranceEvaluator.prototype;

InvalidInsuranceEvaluator.getQuote= function(){
    return -1; 
}

module.exports = InvalidInsuranceEvaluator;

