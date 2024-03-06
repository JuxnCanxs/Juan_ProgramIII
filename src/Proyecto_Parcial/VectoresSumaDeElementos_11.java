package Proyecto_Parcial;
import java.util.Scanner;
public class VectoresSumaDeElementos_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector:");
        int n = scanner.nextInt();
        int[] vector = new int[n];

        System.out.println("Ingrese los elementos del vector:");
        for (int i = 0; i < n; i++) {
            vector[i] = scanner.nextInt();
        }

        int sum = calcularSuma(vector);
        System.out.println("La suma de los elementos en el vector es: " + sum);
        System.out.println("Los numeros ingresados son: ");
        imprimirNumerosEnteros(vector);
    }

        private static int calcularSuma ( int[] vector){
            int sum = 0;
            for (int i = 0; i < vector.length; i++) {
                sum += vector[i];
            }
            return sum;
        }
        private static void imprimirNumerosEnteros ( int[] vector){
            System.out.println("{");
            int sum = 0;
            for (int i = 0; i < vector.length; i++) {
                sum += vector[i];
                System.out.print(vector[i]);
                System.out.print(i == vector.length - 1 ? "" : ", ");
            }
            System.out.println("}");
        }
    }