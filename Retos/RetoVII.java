import java.util.Scanner;

package Retos;

public class RetoVII {
    public static void main(String[] args) {
        Scanner capturar = new Scanner(System.in);
    
    //declararmos variables 
    int res, per, total, cont=0;

    //solictamos cantidad productos
    System.out.println("¿Cuanto dinero desea apostar?");
    res = capturar.nextInt();

    //for
    for(cont=0; cont<res; cont++){
        System.out.println("Tiene un total de: " + per);
        total= capturar.nextInt();
        total= total+per;

      }
    }
}
