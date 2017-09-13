package co.edu.sena.programming.lesson02;

public class Ejemplo02 {
    public static void main(String[] args) {
        int x =5;
        int y = x;
        System.out.println(x);
        System.out.println(y);
            x=10;
        System.out.println(x);
        System.out.println(y);

        Empleado e1 = new Empleado();
        e1.setNombre("hernando");
        Empleado e2 = e1;
        System.out.println(e1.getNombre());
        System.out.println(e2.getNombre());
        //e1 = new Empleado(); // modificando la stack
        e1.setNombre("jorge"); // estoy modificando la heap
        System.out.println(e1.getNombre());
        System.out.println(e2.getNombre());






    }
}
