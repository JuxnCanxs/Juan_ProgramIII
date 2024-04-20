package com.company.model;
import java.util.ArrayList;

public class Departamento {
        private String nombre;
        private ArrayList<Empleado> empleados;

        public Departamento(String nombre) {
            this.nombre = nombre;
            this.empleados = new ArrayList<>();
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public ArrayList<Empleado> getEmpleados() {
            return empleados;
        }

        public void addEmpleado(Empleado empleado) {
            this.empleados.add(empleado);
        }

        public void removeEmpleado(Empleado empleado) {
            this.empleados.remove(empleado);
        }
}

