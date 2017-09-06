package co.edu.sena.lession10;

public class Ejemplo02 {
    public static String var = "hola mundo";

    public static void main(String[] args) {
        Carro c1 = new Carro();
        System.out.println(c1.getMarca());
        c1 =cambiarColorCarro(c1,"mazda");
        System.out.println(c1.getMarca());

        System.out.println(var);
        System.out.println(Math.PI);
        System.err.println("mensaje");
        System.out.println();

    }

    public static Carro cambiarColorCarro(Carro carro, String marca){
        Carro ct = carro;
        ct.setMarca(marca);
        cambiarColorCarro2();
        return ct;
    }

    public static void cambiarColorCarro2(){

    }



}
