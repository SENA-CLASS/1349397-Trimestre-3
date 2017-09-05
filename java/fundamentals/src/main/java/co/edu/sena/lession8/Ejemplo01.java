package co.edu.sena.lession8;

public class Ejemplo01 {
    public static void main(String[] args) {

        Carro [] carros = new Carro[10];
        carros[0]= new Carro();
        carros[1]= new Carro();
        carros[2]= new Carro();
        carros[3]= new Carro();
        carros[4]= new Carro();
        carros[5]= new Carro();
        carros[6]= new Carro();
        carros[7]= new Carro();


        for (int i = 0; i < carros.length ; i++) {
            if(carros[i].getPlaca()==null){
                continue;
            }else {

                System.out.println(carros[i].getPlaca());
            }
        }

        for (Carro ct: carros
             ) {
            System.out.println(ct);
        }

    }
}
