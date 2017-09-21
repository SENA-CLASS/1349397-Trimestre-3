package co.edu.sena.programming.lesson04;

public class Ejemplo01 {

    public static int aa;

    public static void main(String[] args) {
        Foo2 objeto = new Baar2();
        System.out.println(objeto);
        System.out.println(objeto.getA());
        System.out.println(objeto.a);
        objeto.reportSum();

        objeto.toString();

        aa= 3;

    }

}
