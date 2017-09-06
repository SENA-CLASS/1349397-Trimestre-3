package co.edu.sena.lession13;

public class Ejemplo01 {
    public static void main(String[] args) {
        int a[] = new int[3];


        try {
            a[3]=9;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }




        System.out.println("paso el error");
    }
}
