package Proyecto_Parcial;
import java.util.Scanner;
public class VectoresProductoDeElementosPares_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector:");
        int n = scanner.nextInt();
        int[] vector = new int[n];

        System.out.println("Ingrese los elementos del vector:");
        for (int i = 0; i < n; i++) {
            vector[i] = scanner.nextInt();
        }

        int product = calcularProductoDePares(vector);
        System.out.println("El producto de numeros pares es: " + product);
        System.out.println("Los numeros ingresados son: ");
        imprimirNumerosPares(vector);
    }

    private static int calcularProductoDePares(int[] vector) {
        int product = 1;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 == 0) {
                product *= vector[i];
            }
        }
        return product;
    }
    private static void imprimirNumerosPares ( int[] vector){
        System.out.println("{");
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 == 0) {
                System.out.print(vector[i]);
                System.out.print(i == vector.length - 1 ? "" : ", ");
            }
        }
        System.out.println("}");
    }
}

