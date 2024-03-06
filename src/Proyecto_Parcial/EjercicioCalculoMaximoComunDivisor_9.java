package Proyecto_Parcial;

import java.util.Scanner;

public class EjercicioCalculoMaximoComunDivisor_9 {
    // Function to calculate the GCD using the Euclidean algorithm
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número entero positivo:");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número entero positivo:");
        int num2 = scanner.nextInt();

        while (num1 <= 0 || num2 <= 0) {
            System.out.println("Error: Los números ingresados deben ser positivos. Por favor, ingrese nuevamente los números.");
            System.out.println("Ingrese el primer número entero positivo:");
            num1 = scanner.nextInt();
            System.out.println("Ingrese el segundo número entero positivo:");
            num2 = scanner.nextInt();
        }

        int mcd = calcularMaximoComunDivisor(num1, num2);
        System.out.println("El máximo común divisor (MCD) de " + num1 + " y " + num2 + " es: " + mcd);
    }

    private static int calcularMaximoComunDivisor(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}