package Proyecto_Parcial;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class ListasEliminarElementosImpares_15 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Imgrese numeros enteros (ingrese '0' para terminar):");
        int num;
        while ((num = scanner.nextInt()) != 0) {
            list.add(num);
        }

        List<Integer> evenList = new ArrayList<>();
        for (Integer n : list) {
            if (n % 2 == 0) {
                evenList.add(n);
            }
        }

        System.out.println("Lista sin numeros impares: " + evenList);
    }
}
