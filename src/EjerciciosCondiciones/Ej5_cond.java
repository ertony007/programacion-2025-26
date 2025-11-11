package EjerciciosCondiciones;

import java.util.Scanner;

public class Ej5_cond {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce 2 numeros");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num1 == num2) {
            System.out.println(num1 + " y " + num2 + " son iguales");
        } else
            System.out.println(num1 + " y " + num2 + " no son iguales");
        scanner.close();
    }
}
