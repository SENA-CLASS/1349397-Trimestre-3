var numero =prompt("digite el numero");
console.log(typeof numero);

var a = Number.parseInt(numero);
let i, con=0;
for(i=1;i<=a;i++){
    if(a%i === 0){
        con++;
    }
}
if(con === 2){
    alert("es primo");
}else{
    alert("no es primo");
}

