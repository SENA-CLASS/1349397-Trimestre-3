package co.edu.sena.programming.lesson05;

public class Ejemplo04 {
    public static void main(String[] args) {
        Sede s1 = new Sede();
        s1.setNombreSede("Barrio Colombia");
        s1.setDireccion("calle 69 20 algo");
        s1.setEstado(EstadoSede.ACTIVA);


        System.out.println(s1.toString());
        System.out.println(s1.getEstado().name());
        System.out.println(s1.getEstado().ordinal());
        System.out.println(s1.getEstado().isEstado());
        System.out.println(s1.getEstado().getPosicion());

    }
}
