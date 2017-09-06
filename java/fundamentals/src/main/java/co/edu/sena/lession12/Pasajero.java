package co.edu.sena.lession12;

public class Pasajero {
    private Taxi taxi;
    private int idPasajero;

    public Taxi getTaxi() {
        return taxi;
    }

    public void setTaxi(Taxi taxi) {
        this.taxi = taxi;
    }

    public int getIdPasajero() {
        return idPasajero;
    }

    public void setIdPasajero(int idPasajero) {
        this.idPasajero = idPasajero;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + this.idPasajero;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pasajero other = (Pasajero) obj;
        if (this.idPasajero != other.idPasajero) {
            return false;
        }
        return true;
    }

    

    @Override
    public String toString() {
        return "Pasajero{" +

                ", idPasajero=" + idPasajero +
                '}';
    }
}
