package EjerciciosArrays;

public class Ej4_arr {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        int suma = 0;
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        for (int i = 0; i < numeros.length; i++) {
            suma = numeros[i] + suma;
        }
        System.out.println("la suma total seria: "+suma);

    }
}
