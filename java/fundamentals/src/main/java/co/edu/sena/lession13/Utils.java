package co.edu.sena.lession13;

public class Utils {

    public void doThis() throws UnsupportedOperationException {
        System.out.println("llegue al metodo doTHis");

        //throw new UnsupportedOperationException("no se que sera este error");

        //System.out.println("finaliza el metodo doThis y vuelve al metodo que lo llamo");

    }

    public void doThat() throws UnsupportedOperationException, ArithmeticException{
        System.out.println("llegue al metodo doThat");

        int a= 1/0;

            //throw new UnsupportedOperationException("no se que sera este error");

        //System.out.println("termino el metodo doThat");

    }

}
