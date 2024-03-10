package Proyecto_Parcial;
import java.util.*;
public class EjercicioOrdenamientoNuemeros_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int num2 = scanner.nextInt();

        System.out.print("Ingrese el tercer número entero: ");
        int num3 = scanner.nextInt();

        scanner.close();

        if (num1 >= num2 && num1 >= num3 && num2 <= num3) {
            System.out.println("Los números en orden ascendente son: " + num2 + ", " + num3 + ", " + num1);
        } else if (num1 >= num2 && num1 >= num3 && num2 >= num3) {
            System.out.println("Los números en orden ascendente son: " + num3 + ", " + num2 + ", " + num1);
        } else if (num2 >= num1 && num2 >= num3 && num1 <= num3) {
            System.out.println("Los números en orden ascendente son: " + num1 + ", " + num3 + ", " + num2);
        } else if (num2 >= num1 && num2 >= num3 && num1 >= num3) {
            System.out.println("Los números en orden ascendente son: " + num1 + ", " + num2 + ", " + num3);
        } else if (num3 >= num1 && num3 >= num2 && num1 <= num2) {
            System.out.println("Los números en orden ascendente son: " + num1 + ", " + num2 + ", " + num3);
        } else {
            System.out.println("Los números en orden ascendente son: " + num1 + ", " + num3 + ", " + num2);
        }
    }
}
