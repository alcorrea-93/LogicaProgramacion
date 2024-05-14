
package apuntesdeclase;

import java.util.Scanner;


public class EstructurasControl {
    public static void main(String[] args) {
      
    /*If simple
    If else
    If anidado

     int num1 = (int) (Math.random()*11);
     int num2 = (int) (Math.random()*11);
     
     if (num1 > num2){
         System.out.println("cliente paga");
     }else if (num1 < num2){
         System.out.println("casa paga");
     } else {
         System.out.println("empate");
     } 
     //Switch: Aquí se conoce de antemano qu´pe opción quiere o le tocó
  */   
     int puntosCasa = 500;
     int puntosUsuario =500;
     Scanner sc = new Scanner(System.in);
        System.out.println("""
                           Seleccione:
                           1. Le suma a la casa y le resta al usuario
                           2. Le suma al usuario y le resta a la casa
                           3. No suma""");
       int opcion = sc.nextInt();
       
        switch (opcion) {
            case 1:
            puntosCasa = puntosCasa + 100;
            puntosUsuario = puntosUsuario - 100;
            break;
            case 2:
            puntosCasa = puntosCasa - 100;
            puntosUsuario = puntosUsuario + 100;
            break;
            default: 
            break;
        }
     
    }
    }
