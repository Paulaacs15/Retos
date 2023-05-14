package Retos;

import java.util.Scanner;

public class RetoV {

    public static void main(String[] args) {
        Scanner capturar = new Scanner(System.in);

        // declaramos variables
        int mes, dia;

       //solicitamos al usuario que ingrese el mes y dia en el que cumple años
       System.out.println("¿Digite el mes en el  que cumpleaños?");
       mes=capturar.nextInt();

       switch (mes) {
        case 0:
            if (dia >=21 && dia <=19 ){
            System.out.println("Algunas caracteristicas de los Aries es que son muy seguros de si mismos, saben lo que desean y que es lo ue buscan");
            } 
        case 1:
            if(dia >=20 && dia <=20){
            System.out.println("tu dia de nacimiento es" +dia);
            System.out.println("del mes de  Abril asi que tu signo es Tauro. Caracteristicas de Tauro es que tienen una gran inclinacion hascia el confort, los lujos y hacia una vida material holgada" );
            }
        case 2:
            if(dia >=21 && dia <=21){
            System.out.println("tu dia de nacimiento es" +dia);
            System.out.println("del mes de  Mayo asi que tu signo es Geminis. Caracteristicas de Geminis es que le gusta estar bien informados y saber que es lo que pasa a su alrededor");
            }   
        case 3:
            if(dia >=22 && dia <=22){
            System.out.println("tu dia de nacimiento es" +dia);
            System.out.println("del mes de  Junio asi que tu signo es Cancer. Caracteristicas de Cancer son que las personas de este signo suelen poseer una fuerte memoria emotiva");
            }
        case 4:
            if(dia >=23 && dia <=22){
            System.out.println("tu dia de nacimiento es" +dia);
            System.out.println("del mes de  Julio asi que tu signo es Leo. Caracteristicas de Leo son que las personas de este signo son personas  sociables y extrovertidas");
            }
        case 5: 
            if(dia >=23 && dia <=22){
            System.out.println("tu dia de nacimiento es" +dia);
            System.out.println("del mes de  Agosto asi que tu signo es Virgo. Caracteristicas de Virgo con un estilo metodico que le permite alcanzar sus objetivos");
            }
        case 6: 
            if(dia >=23 && dia <=23){
            System.out.println("tu dia de nacimiento es" +dia);
            System.out.println("del mes de  Septiembre asi que tu signo es Libra. Caracteristicas de Libra una naturaleza extrovertida, son comunicativos y sociables");
            }
        case 7:
            if(dia >=24 && dia <=21){
            System.out.println("tu dia de nacimiento es" +dia);
            System.out.println("del mes de  Octubre asi que tu signo es Escorpio. Caracteristicas de Escorpio tiene una personalidad absorbente y quieren abarcarlo todo");
            }
        case 8: 
            if(dia >=22 && dia <=22){
            System.out.println("tu dia de nacimiento es" +dia);
            System.out.println("del mes de  Noviembre asi que tu signo es Sagitario. Caracteristicas de Sagitario muy  optimista y confiado en las posiblidades que prueba brindarle la vida");
            }
        case 9: 
            if(dia >=23 && dia <=19){
            System.out.println("tu dia de nacimiento es" +dia);
            System.out.println("del mes de  Diciembre asi que tu signo es Capricornio. Caracteristicas de Capricornio Ambicioso muy perseverante para lograr tus propositos");
            }
        case 10: 
            if(dia >=23 && dia <=19){
            System.out.println("tu dia de nacimiento es" +dia);
            System.out.println("del mes de  Enero asi que tu signo es Acuario. Caracteristicas de Acuario son personas sociables y pueden entablar lazo estable");
            }
        case 11: 
            if(dia >=19 && dia <=20){
            System.out.println("tu dia de nacimiento es" +dia);
            System.out.println("del mes de  Febrero asi que tu signo es Pisis. Caracteristicas de Pisis tienen una alegria natural que contagia y una fuerte prfundidad emocional");
            }
        }
    }


