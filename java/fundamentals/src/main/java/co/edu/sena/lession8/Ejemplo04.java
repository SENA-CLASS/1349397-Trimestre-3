package co.edu.sena.lession8;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Ejemplo04 {
    public static void main(String[] args) {
        Date fecha = new Date();
        System.out.println(fecha);

        final Date currentTime = new Date();

        final SimpleDateFormat sdf =
                new SimpleDateFormat("EEE, MMM d, yyyy hh:mm:ss a z");


        sdf.setTimeZone(TimeZone.getTimeZone("GMT-5"));
        System.out.println("GMT time: " + sdf.format(currentTime));
    }
}
