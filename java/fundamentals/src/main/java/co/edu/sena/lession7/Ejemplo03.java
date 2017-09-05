package co.edu.sena.lession7;

import java.util.Scanner;

public class Ejemplo03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String numero = teclado.next();

        switch (numero) {
            case "a":
            case "A":
                System.out.println("escribio una a en mayuscula o minuscula");
                break;
            case "B":
            case "b":

                System.out.println("escribio una b en mayuscula o minuscula");
                break;

            default:
                System.out.println("no se que letra sera esa");
                break;

        }

    }
}
