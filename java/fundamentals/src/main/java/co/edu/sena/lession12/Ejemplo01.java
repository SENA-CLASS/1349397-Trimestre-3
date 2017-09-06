package co.edu.sena.lession12;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Ejemplo01 {
    public static void main(String[] args) {
        Taxi t1 = new Taxi("ABC123");

        t1.setPasajeroList(new HashSet<>());// inicializando la lista
        System.out.println(t1.hashCode());

        Pasajero p1= new Pasajero();
        p1.setIdPasajero(1);
        p1.setTaxi(new Taxi("ABC123"));
        System.out.println(p1.getTaxi().hashCode());


        t1.getPasajeroList().add(p1);


        System.out.println(t1.toString());

        for (Pasajero p:t1.getPasajeroList()
             ) {
            System.out.println(p.getIdPasajero());
            System.out.println(p.getTaxi().getPlaca());
        }

    }
}


