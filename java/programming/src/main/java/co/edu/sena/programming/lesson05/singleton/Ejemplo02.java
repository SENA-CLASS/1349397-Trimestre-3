package co.edu.sena.programming.lesson05.singleton;

public class Ejemplo02 {
    public static void main(String[] args) {
        Gato g1 = Gato.getInstancia();
        Gato g2 = Gato.getInstancia();
        Gato g3 = Gato.getInstancia();
        Gato g4 = Gato.getInstancia();
        Gato g5 = Gato.getInstancia();

        System.out.println(g1);
        System.out.println(g2);
        System.out.println(g3);
        System.out.println(g4);
        System.out.println(g5);

    }
}
