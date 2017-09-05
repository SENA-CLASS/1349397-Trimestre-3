if (true) {
    var x = 5; // esta variable estaria en el ambito global
}
console.log(x); // x vale 5


if (true) {
    let y = 5; // esta variable solo esxite en el ambito local de el if
}
console.log(y); // x vale 5