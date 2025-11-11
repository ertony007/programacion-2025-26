package EjerciciosBucles;

import java.util.Scanner;

public class Ej15_bucl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;


        for (int i = 0; i != 5; i++){
            System.out.println("Introduce un numero");
            num = scanner.nextInt();
            if (num % 3 == 0) {
                System.out.println(num+" es multiplo de 3.");
            } else {
                System.out.println(num+" no es multiplo de 3.");
            }
        }
        scanner.close();
    }
}
