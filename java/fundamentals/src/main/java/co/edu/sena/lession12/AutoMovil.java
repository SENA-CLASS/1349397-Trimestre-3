package co.edu.sena.lession12;

public class AutoMovil {

    private String placa;

    public AutoMovil(String placa) {
        this.placa = placa;
    }

    void encender(){
        System.out.println("run");
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "AutoMovil{" +
                "placa='" + placa + '\'' +
                '}';
    }
}
