package co.edu.sena.programming.lesson05.singleton;

public class Gato implements java.io.Serializable {

    private final static Gato instancia = new Gato();

    public Gato() {
        if (instancia != null) {
            throw new IllegalStateException("Already initialized.");
        }
    }

    public static Gato getInstancia() {
        return instancia;
    }


}
