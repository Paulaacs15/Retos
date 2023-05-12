package Retos;

import java.util.Scanner;

public class Reto4 {
    public static void main(String[] args) {
        Scanner capturar = new Scanner(System.in);

        // Declarar variables
        int juego;
        String eleu;
        String elem;

        // Solicitar datos
        System.out.println("1.Piedra, 2.papel o 3.tijera");
        eleu = capturar.nextLine();
        eleu.toLowerCase();
        //capturar
        switch (eleu) {
            case "piedra":
                eleu = "piedra";
                System.out.println("Haz elegido piedra");

                break;

            case "papel":
                eleu = "papel";
                System.out.println("Haz elegido papel");
                break;

            case "tijera":
                eleu = "tijera";
                System.out.println("Haz elegido tijera");
                break;
        }
        //metodo ramdon
        juego = (int) (Math.random() * 3);
        switch (juego) {
            case 0:
                elem = "piedra";
                System.out.println("saco piedra");
                if (elem == eleu) {
                    System.out.println("empate");

                } else if (elem == "piedra" && eleu == "tijera") {
                    System.out.println("perdiste");
                } else {
                    System.out.println("gano");
                }

            case 1:
                elem = "papel";
                System.out.println("saco papel");
                if (elem == eleu) {
                    System.out.println("empate");

                } else if (elem == "papel" && eleu == "tijera") {
                    System.out.println("gano");
                } else {
                    System.out.println("perdiste");
                }

            case 2:
                elem = "tijera";
                System.out.println("saco tijera");
                if (elem == eleu) {
                    System.out.println("empate");

                } else if (elem == "tijera" && eleu == "papel") {
                    System.out.println("perdio");
                } else {
                    System.out.println("gano");
                }

                break;

        }
    }
}
