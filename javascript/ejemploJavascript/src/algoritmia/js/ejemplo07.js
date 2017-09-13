//Variable hoisting

/**
 * Ejemplo 1
 */
x=x+1;
console.log(x);
//console.log(x === undefined); // true
var x;
//var x = 3;

/**
 * Ejemplo 2
 */
// devolverá un valor undefined
var myvar = "my value";

(function() {
    console.log(myvar); // undefined
    var myvar = "local value";
})();

suma(5,4);
function suma(a, b) {
    resultado =a+b;
    console.log(resultado);
    var a,b,resultado; // Variable hoisting
}

const RR = 5;

console.log(RR);

TT =6;

var suma= 4;



