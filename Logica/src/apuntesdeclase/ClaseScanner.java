
package apuntesdeclase;
/* 
Errores de sintaxis: Ocurren en tiempo de compilación que es cuando se está escribiendo el código

Errores semánticos: Ocurren en tiempo de ejecución que es cuando corre el código. 
*/
import java.util.Scanner;

public class ClaseScanner {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num1, num2;
        
        System.out.println("Ingrese el primer número");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número");
        num2 = leer.nextInt();
        
        int suma = num1 + num2;
        int mult = num1 * num2;
        float div = num1/num2;
        int rest = num1 - num2;
        float mod = num1%num2;
        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la multiplicación es: " + mult);
        System.out.println("El resultado de la división es: " + div); 
        System.out.println("El resultado de la resta es: " + rest);   
        System.out.println("El resultado del módulo es: " + mod); 
        
        
    }
}


