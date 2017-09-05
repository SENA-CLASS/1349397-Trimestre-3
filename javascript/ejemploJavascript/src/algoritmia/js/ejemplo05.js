var x; //es un dato undefined no tiene se sabe que tipo es

if(x === undefined){
    console.log("no esta definda");
}else{
    console.log("definida");
}

var y; //es un dato undefined no tiene se sabe que tipo es

if(y){
    console.log("definida");
}else{
    console.log("no esta definda");
}

var a;

console.log(a+2);

var myArray = new Array();
console.log(myArray[0]);
if (!myArray[0]) {
    console.log("acabo de pasar un undefined a true en la condición");
}


var n = null;
console.log(n * 32);
if(n){
    console.log("estoy en verdadero");
}else{
    console.log("estoy en lo falso");
}

