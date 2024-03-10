package Proyecto_Parcial;
import java.util.*;
public class EjercicioDeCalculoInteresesCompuestos_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el monto de la inversion inicial: ");
        double initialAmount = scanner.nextDouble();

        System.out.print("Ingrese la tasa de interes anual (Porcentaje): ");
        double interestRate = scanner.nextDouble() / 100;

        System.out.print("Ingrese el numero de años: ");
        int years = scanner.nextInt();

        double finalAmount = initialAmount * Math.pow(1 + interestRate, years);

        System.out.printf("El importe fianl es: %.2f%n", finalAmount);
    }
}
