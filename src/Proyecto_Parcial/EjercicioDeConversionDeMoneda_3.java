package Proyecto_Parcial;
import java.util.*;
public class EjercicioDeConversionDeMoneda_3 {
    public static void main(String[] args) {
        double tasaDolar = 3875.0, tasaEuro = 4302.5, monto;
        Scanner sc = new Scanner(System.in);

            System.out.print("Introduce el monto a cambiar en pesos colombianos: ");
            monto = sc.nextDouble();

            System.out.println("Tus " + monto + " pesos colombianos son:");
            System.out.println(monto / tasaDolar + " Dólares");
            System.out.println(monto / tasaEuro + " Euros");
    }
}


