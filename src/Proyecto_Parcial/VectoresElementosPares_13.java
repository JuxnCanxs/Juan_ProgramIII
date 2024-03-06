package Proyecto_Parcial;
import java.util.Scanner;
public class VectoresElementosPares_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de elementos del vector :");
        while (!scanner.hasNextInt()) {
            System.out.println("Error: ingrese un entero positivo.");
            scanner.next();
        }
        int n = scanner.nextInt();

        int[] vector = new int[n];

        System.out.println("Ingrese los elementos del vector :");
        for (int i = 0; i < n; i++) {
            System.out.printf("Elemento %d: ", i + 1);
            while (!scanner.hasNextInt()) {
                System.out.println("Error: ingrese un entero por linea.");
                scanner.next();
            }
            vector[i] = scanner.nextInt();
        }

        int max = findMax(vector);
        System.out.println("El número máximo en el vector es: " + max);
    }

    public static int findMax(int[] vector) {
        int max = vector[0];
        for (int i = 1; i < vector.length; i++) {
            if (vector[i] > max) {
                max = vector[i];
            }
        }
        return max;
    }
}
