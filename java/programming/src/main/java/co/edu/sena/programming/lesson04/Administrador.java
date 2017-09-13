package co.edu.sena.programming.lesson04;


import java.util.Objects;

public class Administrador extends Empleado {
    private float peso;

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Administrador that = (Administrador) o;
        return Float.compare(that.peso, peso) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(peso);
    }
}
