package EjerciciosBucles;

import java.util.Scanner;

public class Ej14_bucl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int suma = 0;

        for (int i=0; i != 15; i++) {
            System.out.println("Introduce el numero que quieras sumar: ");
            contador = scanner.nextInt();
            suma = suma + contador;
        }
        System.out.println("La suma total es: "+suma);
        scanner.close();
    }
}
