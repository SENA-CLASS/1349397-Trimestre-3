package co.edu.sena.programming.lesson05;

public class Sede {
    private String nombreSede;
    private String direccion;
    private EstadoSede estado;


    public String getNombreSede() {
        return nombreSede;
    }

    public void setNombreSede(String nombreSede) {
        this.nombreSede = nombreSede;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public EstadoSede getEstado() {
        return estado;
    }

    public void setEstado(EstadoSede estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Sede{" +
                "nombreSede='" + nombreSede + '\'' +
                ", direccion='" + direccion + '\'' +
                ", estado=" + estado +
                '}';
    }
}
