package co.edu.sena.programming.lesson05.singleton;

public class Perro {
    private static final Perro instancia = new Perro();

    public Perro() {
    }

    public static Perro getInstancia() {
        return instancia;
    }
}
