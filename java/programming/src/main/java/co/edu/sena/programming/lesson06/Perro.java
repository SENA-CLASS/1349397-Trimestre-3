package co.edu.sena.programming.lesson06;

public class Perro {
    private final String nombre;
    private final String raza;
    private final String sexo;

    public Perro(final String nombre, final String raza, final String sexo) {
        this.nombre = nombre;
        this.raza = raza;
        this.sexo = sexo;
    }

    public Perro withNombre(String nombre){
            return new Perro(nombre, this.raza, this.sexo);
    }

    public String getNombre() {
        return nombre;
    }

    public Perro withRaza(String raza){
        return new Perro(this.nombre, raza, this.sexo);
    }

    public String getRaza() {
        return raza;
    }

    public String getSexo() {
        return sexo;
    }
}
