import java.util.Scanner;

package Retos;

public class RetoVI {
    public static void main(String[] args) {
        Scanner capturar = new Scanner(System.in);
    
    //declaramos variables
    int t_com, precio, n=0, cont=0;

    //solictamos cantidad productos
    System.out.println("¿Cuantos productos desea comprar?");
    n = capturar.nextInt();
    
   //for
    for(cont=0; cont<n; cont++){
        System.out.println("Digite el precio de producto" + cont);
        precio = capturar.nextInt();
        t_com= t_com+precio;
    
       System.out.println("El total de su compra es: " + t_com);
    }
  }
}
