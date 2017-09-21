package co.edu.sena.programming.lesson05;

public class Ejemplo03 {
    public static void main(String[] args) {
        Aprediz a = new Aprediz();
        a.setTipoDocumento("CC");
        a.setNumeroDocumento("123");
        a.setNombre("pedro");
        a.setEstado(EstadoAprendiz.DESERTADO);

        System.out.println(a.toString());

        System.out.println(a.getEstado().getDescripcion());
    }
}
