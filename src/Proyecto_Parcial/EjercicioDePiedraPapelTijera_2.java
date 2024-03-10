package Proyecto_Parcial;
import java.util.*;
public class EjercicioDePiedraPapelTijera_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        String[] opciones = {"Piedra", "Papel", "Tijeras"};
        int opcionUsuario, opcionComputadora;
        String resultado;

        System.out.println("Bienvenido al juego de Piedra, Papel o Tijeras.");
        System.out.println("Por favor, elija una de las siguientes opciones:");
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijeras");
        System.out.print("Ingrese el número correspondiente a su elección: ");
        opcionUsuario = in.nextInt();

        while (opcionUsuario < 1 || opcionUsuario > 3) {
            System.out.println("Opción inválida. Por favor, ingrese un número válido.");
            System.out.print("Ingrese el número correspondiente a su elección: ");
            opcionUsuario = in.nextInt();
        }

        opcionComputadora = random.nextInt(3) + 1;
        System.out.println("La computadora eligió: " + opciones[opcionComputadora - 1]);

        if (opcionUsuario == opcionComputadora) {
            resultado = "Empate";
        } else if ((opcionUsuario == 1 && opcionComputadora == 3) ||
                (opcionUsuario == 2 && opcionComputadora == 1) ||
                (opcionUsuario == 3 && opcionComputadora == 2)) {
            resultado = "Ganaste";
        } else {
            resultado = "Perdiste";
        }

        System.out.println("Resultado: " + resultado);
    }
}
