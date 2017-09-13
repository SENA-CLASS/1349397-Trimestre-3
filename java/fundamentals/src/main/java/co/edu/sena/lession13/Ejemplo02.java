package co.edu.sena.lession13;

public class Ejemplo02 {
    public static void main(String[] args) {
        Utils u = new Utils();
        try {
            u.doThis();
            u.doThat();
        } catch (UnsupportedOperationException e) {
            e.printStackTrace();
            System.out.println("este error no conocido");
        } catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("esto no puede dividir entre 0");
        }
    }
}
