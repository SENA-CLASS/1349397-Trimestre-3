package co.edu.sena.programming.lesson05;

public enum EstadoAprendiz {
    DESERTADO("ESTE APRENDIZ ESTA DESETADO"),
    RETIRO("RETIRO VOLUNTARIO"),
    APLAZADO("APLAZADO");

    private String descripcion;

    private EstadoAprendiz(String d){
        this.descripcion=d;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
