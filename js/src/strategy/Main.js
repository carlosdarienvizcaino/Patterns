// Import Strategies
var SUVInsuranceEvaluator = require("./evaluators/SUVInsuranceEvaluator"); 
var SedanInsuranceEvaluator = require("./evaluators/SedanInsuranceEvaluator");

// Create an Insurance Object
 var insuranceCompany = require("./models/InsuranceCompany")();
 
// Make quote for USV Vehicle
insuranceCompany.setInsuranceEvaluator( SUVInsuranceEvaluator );
var suvQuote = insuranceCompany.quoteVehicle();

// Make quote for Sedan Vehicle
insuranceCompany.setInsuranceEvaluator( SedanInsuranceEvaluator );
var sedanQuote = insuranceCompany.quoteVehicle();

// SUV Quote is supported
console.log("SUV Quote: " + suvQuote);

// Sedan quote is not supported 
console.log("Sedan Quote: " + sedanQuote);




