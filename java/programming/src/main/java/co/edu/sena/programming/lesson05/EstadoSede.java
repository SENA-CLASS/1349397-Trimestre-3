package co.edu.sena.programming.lesson05;

public enum  EstadoSede {
    ACTIVA(true, 3),
    INACTIVA(false, 6);

    private boolean estado;
    private int posicion;

    EstadoSede(boolean estado, int posicion) {
        this.estado = estado;
        this.posicion = posicion;
    }

    public boolean isEstado() {
        return estado;
    }

    public int getPosicion() {
        return posicion;
    }
}
