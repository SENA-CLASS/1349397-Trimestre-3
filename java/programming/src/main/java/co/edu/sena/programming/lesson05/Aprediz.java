package co.edu.sena.programming.lesson05;

public class Aprediz {
    private String tipoDocumento;
    private String numeroDocumento;
    private String nombre;
    private EstadoAprendiz estado;

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public EstadoAprendiz getEstado() {
        return estado;
    }

    public void setEstado(EstadoAprendiz estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Aprediz{" +
                "tipoDocumento='" + tipoDocumento + '\'' +
                ", numeroDocumento='" + numeroDocumento + '\'' +
                ", nombre='" + nombre + '\'' +
                ", estado=" + estado +
                '}';
    }
}
