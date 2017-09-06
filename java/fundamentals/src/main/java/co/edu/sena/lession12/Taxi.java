package co.edu.sena.lession12;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class Taxi extends AutoMovil {

    private Collection<Pasajero> pasajeroList;


    public Taxi(String placa) {
        super(placa);
    }

    public void conducir(){
        this.encender();
    }

    public Collection<Pasajero> getPasajeroList() {
        return pasajeroList;
    }

    public void setPasajeroList(Collection<Pasajero> pasajeroList) {
        this.pasajeroList = pasajeroList;
    }




    @Override
    public String toString() {
        return "Taxi{" +
                "pasajeroList=" + pasajeroList+" ," +
                "placa="+ this.getPlaca() +
                '}';
    }
}
