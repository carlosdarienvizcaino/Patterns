
var InsuranceEvaluator = require("./InsuranceEvaluator");

function SUVInsuranceEvalutor(){}
SUVInsuranceEvalutor.prototype = InsuranceEvaluator.prototype;

SUVInsuranceEvalutor.getQuote= function(data){
    return data + 10; 
}

module.exports = SUVInsuranceEvalutor;

