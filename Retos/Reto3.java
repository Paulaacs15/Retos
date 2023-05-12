package Retos;

import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) {
        Scanner capturar=new Scanner (System.in);
//Declaramos variables
int moneda;
String ele;
String res;

//Solicitar 
System.out.println("Elija 1.cara o 2.sello");
ele=capturar.nextLine();
ele.toLowerCase();

switch (ele) {
    case "cara":
    System.out.println("Haz elegido cara");
     ele="cara";
        break;
    case "sello":
        System.out.println("Haz elegido sello");
     ele="sello";
    break;
            }
 moneda = (int)(Math.random()*2);
 switch (moneda) {
    case 0:
    System.out.println("maquina escogio cara");
    res="cara";

    if(ele == res){
        System.out.println("ganaste");
   
       }else {
        System.out.println("perdiste");
      }
        break;
       
   
        case 1:
        res="sello";
        System.out.println("MAQUINA cayo sello");
      if(ele == res){
        System.out.println("ganaste");
   
    }
    else {
        System.out.println("perdiste");
     }
   
            break;

        }

    
}

}

