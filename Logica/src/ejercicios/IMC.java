package ejercicios;

import java.util.Scanner;

public class IMC {

    public static void main(String[] args) {
        String[] users = new String[5];
        String[] passwords = new String[5];
        String userRegister;
        String passwRegister;
        String user;
        String passw;
        float peso;
        float talla;
        float IMC;
        boolean condition = true;
        Scanner sc = new Scanner(System.in);
        do {

            System.out.println("Bienvenido al menú, elija su opción\n 1. Registrar\n 2. Iniciar sesión \n 3. Salir");
            int opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese su usuario: ");
                    userRegister = sc.nextLine();
                    users[0] = userRegister;
                    System.out.println("Ingrese contraseña:");
                    passwRegister = sc.nextLine();
                    passwords[0] = passwRegister;
                    break;
                case 2:
                    System.out.println("Usuario:");
                    user = sc.nextLine();
                    System.out.println("Contraseña:");
                    passw = sc.nextLine();
                    if (user.equals(users[0]) && passw.equals(passwords[0])) {
                        System.out.println("Ingrese su peso en Kg");
                        peso = sc.nextFloat();
                        System.out.println("Ingrese su talla en metros");
                        talla = sc.nextFloat();
                        IMC = (peso / (talla * talla));
                        System.out.println("Su IMC es: " + IMC);
                    } else {
                        System.out.println("Usuario o contraseña no válidos");
                    }
                    break;
                case 3:
                    condition = false;
                    break;
                default:
                    System.out.println("Elije una opción válida\n");
                    break;
            }
        } while (condition);
    }
}
