package Proyecto_Parcial;
import java.util.Scanner;
public class EjercicioCalculoDigitosRepetidos_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero positivo:");
        int num = scanner.nextInt();
        System.out.println("Ingrese un dígito (0-9):");
        int digit = scanner.nextInt();

        while (num <= 0) {
            System.out.println("Error: El número ingresado debe ser positivo. Por favor, ingrese nuevamente el número.");
            System.out.println("Ingrese un número entero positivo:");
            num = scanner.nextInt();
        }

        while (digit < 0 || digit > 9) {
            System.out.println("Error: El dígito ingresado debe ser un valor entre 0 y 9. Por favor, ingrese nuevamente el dígito.");
            System.out.println("Ingrese un dígito (0-9):");
            digit = scanner.nextInt();
        }

        int count = contarDigito(num, digit);
        System.out.println("El dígito " + digit + " aparece " + count + " veces en el número " + num);
    }

    private static int contarDigito(int num, int digit) {
        int count = 0;
        while (num != 0) {
            int lastDigit = num % 10;
            if (lastDigit == digit) {
                count++;
            }
            num /= 10;
        }
        return count;
    }
}
