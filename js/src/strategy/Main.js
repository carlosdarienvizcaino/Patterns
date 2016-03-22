

// Create an Insurance Object
 var insuranceCompany = require("./models/InsuranceCompany")();
 
// Make quote for USV Vehicle
var suvQuote = insuranceCompany.quoteVehicle("SUV");

// Make quote for Sedan Vehicle
var sedanQuote = insuranceCompany.quoteVehicle("Sedan");

// SUV Quote is supported
console.log("SUV Quote: " + suvQuote);

// Sedan quote is not supported 
console.log("Sedan Quote: " + sedanQuote);


