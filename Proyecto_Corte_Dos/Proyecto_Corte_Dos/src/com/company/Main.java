package com.company;
import com.company.controller.GestionPersonal;
import com.company.model.Empleado;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        GestionPersonal gestionPersonal = new GestionPersonal();

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Agregar Nuevo Empleado");
            System.out.println("2. Calcular Salario de Empleado");
            System.out.println("3. Generar Informe de Productividad");
            System.out.println("4. Mostrar Estructura Jerárquica de la Empresa");
            System.out.println("5. Generar Informes Avanzados");
            System.out.println("6. Salir");

            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Ingrese el ID del empleado:");
                    int id = scanner.nextInt();
                    System.out.println("Ingrese el nombre del empleado:");
                    scanner.nextLine();
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese el apellido del empleado:");
                    String apellido = scanner.nextLine();
                    System.out.println("Ingrese el cargo del empleado:");
                    String cargo = scanner.nextLine();
                    System.out.println("Ingrese el salario del empleado:");
                    double salario = scanner.nextDouble();
                    System.out.println("Ingrese el departamento del empleado:");
                    scanner.nextLine();
                    String departamento = scanner.nextLine();

                    Empleado empleado = new Empleado(id, nombre, apellido, cargo, salario, departamento);
                    gestionPersonal.addEmpleado(empleado);
                    break;
                case 2:
                    System.out.println("Ingrese el ID del empleado:");
                    int idEmpleado = scanner.nextInt();
                    double salario = gestionPersonal.calcularSalario(idEmpleado);
                    System.out.println("El salario del empleado es: " + salario);
                    break;
                case 3:
                    gestionPersonal.generarReportes();
                    break;
                case 4:
                    gestionPersonal.mostrarEstructuraJerarquica();
                    break;
                case 5:
                    System.out.println("Ingrese el nombre del departamento para generar el informe avanzado:");
                    String nombreDepartamento = scanner.nextLine();
                    gestionPersonal.generarReporteAvanzado(nombreDepartamento);
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }
}
