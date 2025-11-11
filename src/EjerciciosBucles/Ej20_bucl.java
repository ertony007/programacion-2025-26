package EjerciciosBucles;

import java.util.Scanner;

public class Ej20_bucl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        do {
            System.out.println("Introduce un numero y te dire si es positivo o negativo");
            num = scanner.nextInt();
            if (num >0){
                System.out.println(num+" es positivo");
            } else if (num <0) {
                System.out.println(num + " es negativo");
            }
        } while (num != 0);
        scanner.close();
    }
}
