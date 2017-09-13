package co.edu.sena.programming.lesson03;

public class Ejemplo01 {
    public static void main(String[] args) {
        System.out.println(promedio());

    }

    public static float promedio(int... num){
        float resultado =0;
        if(num.length>0) {
            for (int n : num
                    ) {
                resultado += n;
            }
            return (float) (resultado / num.length);
        }else{
            return resultado;
        }
    }
}
