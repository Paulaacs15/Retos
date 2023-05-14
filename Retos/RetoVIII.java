package Retos;
import java.util.Scanner;

public class RetoVIII {
    public static void main(String[] args) {
        Scanner capturar = new Scanner(System.in);
    
    //declaramos variables
    int juego;
    String eleu, elem, res;

    //preguntamos al usuario si desea jugar
    System.out.println("¿Deseas juegar piedra, papel o tijera?");
    res=capturar.nextLine();

        do{
        System.out.println("1.Piedra, 2.Papel, 3.Tijera");
        juego = capturar.nextInt();

        //metodo random
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

                } else if (elem == "tijera" && ele == "papel") {
                    System.out.println("perdio");
                } else {
                    System.out.println("gano");
                }
            default:
                break;
            }
            System.out.println("¿Quieres volver a jugar? 1.si 2.no");
            juego = capturar.nextInt();
        } while (juego == 1);

        System.out.println("¡Hasta luego!");

        }
    }
