package EjerciciosBucles;

import java.util.Scanner;

public class Ej13_bucl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el numero de veces que quieres que se repita");
        int num = scanner.nextInt();
        int contador = 0;

        do {contador++;
            System.out.println(contador);
        } while (contador != num);
        scanner.close();
    }
}
