
var InsuranceEvaluator = require("./InsuranceEvaluator");

var SUVInsuranceEvalutor = Object.create(InsuranceEvaluator);

SUVInsuranceEvalutor.getQuote= function(){
    return 10; 
}

module.exports = SUVInsuranceEvalutor;

