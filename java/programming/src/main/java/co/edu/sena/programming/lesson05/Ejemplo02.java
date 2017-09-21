package co.edu.sena.programming.lesson05;

public class Ejemplo02 {
    public static void main(String[] args) {
        System.out.println(EstadosComputador.APAGADO);
        System.out.println(EstadoComputador2.APAGADO);
        System.out.println(EstadosComputador.APAGADO.ordinal());
        System.out.println(EstadosComputador.PRENDIDO.ordinal());
        System.out.println(EstadosComputador.SUSPENDIDO.ordinal());
        System.out.println(EstadosComputador.APAGADO.name());
        System.out.println(EstadosComputador.PRENDIDO.name());
        System.out.println(EstadosComputador.SUSPENDIDO.name());
    }
}
