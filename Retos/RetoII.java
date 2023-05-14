package Retos;

import java.util.Scanner;

public class RetoII {
    public static void main(String[] args) {

        Scanner capturar=new Scanner (System.in);
//Declaramos variables 
int peso;
int edad;
int dosisV;
char name;
String nameEnfer;
String nameBebe;
String nameMama;

//Solicitar nombres
System.out.println("Por favor digite su nombre Enfermera");
nameEnfer=capturar.nextLine();
System.out.println("Por favor digite nombre Bebe");
nameBebe=capturar.nextLine();
System.out.println("Por favor digite su nombre Mama");
nameMama=capturar.nextLine();

//Solicitar peso y edad bebe
System.out.println("Digite peso bebe");
peso=capturar.nextInt();
System.out.println("Digite edad bebe");
edad=capturar.nextInt();

//Calcular dosis vacuna
dosisV=(peso+10)/(edad*10)*8;

//Mostrar dosis vacuna
System.out.println("La dosis vacuna es de: " + peso/edad);

    }
    
}





