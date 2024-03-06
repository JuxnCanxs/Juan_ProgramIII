package Proyecto_Parcial;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
public class EjerciciosDeListasEliminarDuplicados_14 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese números enteros (ingrese '0' para terminar):");
        int num = scanner.nextInt();
        while (num != 0) {
            list.add(num);
            num = scanner.nextInt();
        }

        List<Integer> uniqueList = removeDuplicates(list);
        System.out.println("Lista sin duplicados: " + uniqueList);
    }

    public static List<Integer> removeDuplicates(List<Integer> list) {
        List<Integer> uniqueList = new ArrayList<>(new LinkedHashSet<>(list));
        return uniqueList;
    }
}
