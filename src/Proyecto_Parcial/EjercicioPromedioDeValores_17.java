package Proyecto_Parcial;
import java.util.*;

public class EjercicioPromedioDeValores_17 {
    public static void main(String[] args) {
        HashMap<String, List<Integer>> grades = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Ingrese el nombre de un estudiante(o 'listo' para finalizar):");
            String name = scanner.nextLine();
            if ("listo".equalsIgnoreCase(name)) {
                break;
            }

            System.out.println("Ingrese las calificaciones para " + name + " (separadas por espacio):");
            List<Integer> list = new ArrayList<>();
            String input = scanner.nextLine();
            Scanner lineScanner = new Scanner(input);

            while (lineScanner.hasNextInt()) {
                list.add(lineScanner.nextInt());
            }
            lineScanner.close();

            grades.put(name, list);
        }

        for (Map.Entry<String, List<Integer>> entry : grades.entrySet()) {
            double sum = entry.getValue().stream().mapToInt(Integer::intValue).sum();
            double avg = sum / entry.getValue().size();
            System.out.printf("%s's calificaciones promedio de:%.2f%n", entry.getKey(), avg);
        }
    }
}
