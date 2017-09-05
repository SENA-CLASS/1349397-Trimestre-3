//Variable hoisting

/**
 * Ejemplo 1
 */

console.log(x === undefined); // true
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