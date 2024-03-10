package Proyecto_Parcial;
import java.util.*;
public class EjercicioGenaracionNumerosAleatoriosConSuma_8 {
    public static void main(String[] args) {
        Random random = new Random();
        int num1 = random.nextInt(10) + 1;
        int num2 = random.nextInt(10) + 1;
        int sum = num1 + num2;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la suma de " + num1 + " y " + num2 + ": ");
        int userSum = scanner.nextInt();
        scanner.close();

        if (userSum == sum) {
            System.out.println("¡correcto! la suma es " + sum);
        } else {
            System.out.println("Incorrecto. la suma es " + sum);
        }
    }
}

