package co.edu.sena.lession13;

public class Utils {

    public void doThis(){
        System.out.println("llegue al metodo doTHis");
        doThat();
        System.out.println("finaliza el metodo doThis y vuelve al metodo que lo llamo");

    }

    public void doThat(){
        System.out.println("llegue al metodo doThat");
        throw new UnsupportedOperationException("no se que sera este error");
        //System.out.println("termino el metodo doThat");

    }

}
