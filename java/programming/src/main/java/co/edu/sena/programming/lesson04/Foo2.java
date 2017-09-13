package co.edu.sena.programming.lesson04;

public class Foo2 {
    public int a=20;
    protected int resultado = 20;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    protected void reportSum(){

        System.out.println(resultado);
    }
}
