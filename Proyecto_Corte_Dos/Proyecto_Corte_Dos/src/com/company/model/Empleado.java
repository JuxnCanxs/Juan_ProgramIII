package com.company.model;

public class Empleado {

        private int id;
        private String nombre;
        private String apellido;
        private String cargo;
        private double salario;
        private String departamento;

        public Empleado(int id, String nombre, String apellido, String cargo, double salario, String departamento) {
            this.id = id;
            this.nombre = nombre;
            this.apellido = apellido;
            this.cargo = cargo;
            this.salario = salario;
            this.departamento = departamento;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public String getCargo() {
            return cargo;
        }

        public void setCargo(String cargo) {
            this.cargo = cargo;
        }

        public double getSalario() {
            return salario;
        }

        public void setSalario(double salario) {
            this.salario = salario;
        }

        public String getDepartamento() {
            return departamento;
        }

        public void setDepartamento(String departamento) {
            this.departamento = departamento;
        }

}

