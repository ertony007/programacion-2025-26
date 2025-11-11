package EjerciciosArrays;

public class Ej1_arr {
    public static void main(String[] args) {
        int[] numerosaleatorios = new int[10];


        for (int i = 0; i < numerosaleatorios.length; i++) {
            numerosaleatorios[i] =(int)(Math.random()*100)+1;
        }

        System.out.print("[ ");
        for (int i = 0; i < numerosaleatorios.length; i++) {
            System.out.print(numerosaleatorios[i]+ ", ");
        }
        System.out.print(numerosaleatorios[numerosaleatorios.length-1]+ "]");
    }
}
