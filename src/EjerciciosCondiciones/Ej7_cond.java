package EjerciciosCondiciones;

import java.util.Scanner;

public class Ej7_cond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean si = true;
        boolean no = false;

        System.out.println("¿Tienes el titulo de bachiller?");
        String resp = scanner.nextLine();
        if ("SI".equals(resp.toUpperCase()))
            System.out.println("Bienvenido");
        else if ("NO".equals(resp.toUpperCase()))
            System.out.println("¿Has superado la prueba de acceso?");
        String resp2 = scanner.nextLine();
            if ("NO".equals(resp.toUpperCase()))
                System.out.println("¿Y a qué esperas para irte?");
            else
                System.out.println("Bienvenido");
        scanner.close();
    }
}
