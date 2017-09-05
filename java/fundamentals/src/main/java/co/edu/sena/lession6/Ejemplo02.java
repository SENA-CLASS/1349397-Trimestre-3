package co.edu.sena.lession6;

public class Ejemplo02 {
    public static void main(String[] args) {
        String greet = " Especificar los requisitos necesarios para desarrollar el sistema de información de acuerdo con las necesidades del cliente. ".trim();
        System.out.println(greet);

        System.out.println(greet.charAt(20));

        String str1 = "Not immutable";
        String str2 = "Strings are immutable";
        StringBuffer str3 = new StringBuffer( "Not immutable");

        boolean  result = str1.contentEquals( str3 );
        System.out.println(result);

        result = str2.contentEquals( str3 );
        System.out.println(result);


        String demo = str2.substring(9,12);
        System.out.println(demo);

    }
}
