package co.edu.sena.programming.lesson04;

public class Baar2 extends Foo2 {
        public int a=5;
        private int resultado =30;
        private int sum =10;

    @Override
    public int getA() {
        return a;
    }

    @Override
    public void setA(int a) {
        this.a = a;
    }

    @Override
    public void reportSum(){
        sum+=resultado;
        System.out.println(sum);
    }
}
