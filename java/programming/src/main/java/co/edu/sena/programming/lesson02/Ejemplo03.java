package co.edu.sena.programming.lesson02;

public class Ejemplo03 {
    public static void main(String[] args) {
        Empleado e = new Empleado();
        e.setNombre("michael");
        e.setSalario(2000000);
        System.out.println(e.getNombre());
        System.out.println(e.getSalario());
        foo(e);
        System.out.println(e.getNombre());
        System.out.println(e.getSalario());


        String a = null;
        System.out.println(a);



    }

    public static void foo(Empleado e){
        e = new Empleado();// modifica la stack
        e.setSalario(10000000); // modifica la heap
        System.out.println(e.getNombre());
        System.out.println(e.getSalario());
    }
}
