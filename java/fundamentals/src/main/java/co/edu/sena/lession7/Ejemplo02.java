package co.edu.sena.lession7;

import java.util.Scanner;

public class Ejemplo02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero = teclado.nextInt();

        switch (numero) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("este mes tiene 31 dias");
                break;
            case 2:
                System.out.println("este mes tiene 28 dias");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("este mes tiiene 30 dias");
                break;
            default:
                System.out.println("este mes no existe");
                break;

        }


    }
}
