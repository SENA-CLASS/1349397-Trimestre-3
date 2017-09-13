package co.edu.sena.programming.lesson02;


import java.lang.String;

public class Ejemplo01 {

    private String h;

    public static void main(String[] args) {
        long i = 2_3_4_2_3_4_2_3_4L;
        System.out.println(i);

        float a = 3_4.5_7F;

        // numero binario
        byte numero = 0b100;
        System.out.println(numero);

        short numero2 = (short)0b0010_1010_1010_1010;
        System.out.println(numero2);
        System.out.println(Short.BYTES);
        System.out.println(Short.MAX_VALUE);


        String cadena = "hola mundo";
        System.out.println(cadena.length());
        System.out.println(cadena.substring(5));
        System.out.println(cadena);

        char[] letras = cadena.toCharArray();

        for (char letra:letras
             ) {
            System.out.println(letra);
        }

        String aa ="asdfa";
        if(aa instanceof String ){
            System.out.println("verdad");
        }


        Object[] arrayObjects= new Object[10];
        arrayObjects[0]= new String("4");
        arrayObjects[1]= new Integer("4");

        for (Object o:arrayObjects
             ) {
            System.out.println(o);
        }

        Ejemplo01 aaa = new Ejemplo01();
        aaa.setH("sadfasdfasdf");
        System.out.printf(aaa.getH());


    }

    public String getH() {
        return h;
    }

    public void setH(String h) {
        this.h = h;
    }
}
