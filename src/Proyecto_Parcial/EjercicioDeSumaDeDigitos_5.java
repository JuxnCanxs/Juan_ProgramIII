package Proyecto_Parcial;
import java.util.*;
public class EjercicioDeSumaDeDigitos_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Error: El numero debe de ser positivo.");
            return;
        }

        int sum = 0;
        int lastDigit = number % 10;
        while (number > 0) {
            sum += lastDigit;
            number /= 10;
            lastDigit = number % 10;
        }

        System.out.printf("SumDigits = %d + %d = %d%n", lastDigit, (number + lastDigit) % 10, sum);
        System.out.printf("La suma de los digitos es: %d%n", sum); ;
    }
}

