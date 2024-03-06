package Proyecto_Parcial;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class EjerciciosDeHashMapEliminarClaves_16 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero:");
        int num = scanner.nextInt();

        map.values().removeIf(value -> value < num);

        System.out.println("MAP sin valores menores a " + num + ": " + map);
    }
}

