
var InsuranceEvaluator = require("./InsuranceEvaluator");

// Inherits from InsuranceEvaluator
function SUVInsuranceEvaluator(){}
SUVInsuranceEvaluator.prototype = InsuranceEvaluator.prototype;

SUVInsuranceEvaluator.getQuote= function(data){
    return data + 5; 
}

module.exports = SUVInsuranceEvaluator;

