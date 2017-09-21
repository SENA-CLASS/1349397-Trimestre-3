package co.edu.sena.programming.lesson05.singleton;

public class Ejemplo01 {
    public static void main(String[] args) {
        Perro p1 = Perro.getInstancia();
        Perro p3 = Perro.getInstancia();
        Perro p4 = Perro.getInstancia();
        Perro p2 = new Perro();

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);


    }
}
