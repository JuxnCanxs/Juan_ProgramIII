package com.company.controller;

import com.company.model.Departamento;
import com.company.model.Empleado;

import java.util.ArrayList;

public class GestionPersonal {
    private ArrayList<Empleado> empleados;
    private ArrayList<Departamento> departamentos;

    public GestionPersonal() {
        this.empleados = new ArrayList<>();
        this.departamentos = new ArrayList<>();
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

    public ArrayList<Departamento> getDepartamentos() {
        return departamentos;
    }

}
