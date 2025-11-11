package EjerciciosArrays;

import java.util.Scanner;


public class Ej5_arr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int suma= 0;

        for (int i = 0; i < numeros.length; i++) {

            System.out.print("Introduce un numero: ");

            numeros[i]= scanner.nextInt();

            System.out.print(numeros[0] +","+numeros[1] +","+numeros[2] +","+numeros[3] +","+numeros[4]);

            System.out.println();

            int resultado = suma += numeros[i];

            System.out.println("la suma total sería: "+resultado);
        }


        scanner.close();
    }
}
