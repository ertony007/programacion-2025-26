package EjerciciosCondiciones;

import java.util.Scanner;

public class Ej2_cond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero para ver si es par o impar");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " es par");
        } else
            System.out.println(num + " es impar");

        scanner.close();
    }
}
