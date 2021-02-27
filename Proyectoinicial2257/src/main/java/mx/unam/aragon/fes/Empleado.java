/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.aragon.fes;

/**
 *
 * @author Usuario
 */
public class Empleado extends Persona {

    private int numeroEmpleado;
    private String departamento;
    private float sueldo;
    private int horasextra;
    private Direccion domicilio;

    public Empleado() {
    }

    public Empleado(int numeroEmpleado, String departamento, float sueldo, int horasextra, Direccion domicilio) {
        this.numeroEmpleado = numeroEmpleado;
        this.departamento = departamento;
        this.sueldo = sueldo;
        this.horasextra = horasextra;
        this.domicilio = domicilio;
    }

    public Empleado(int numeroEmpleado, String departamento, float sueldo, int horasextra, Direccion domicilio, String nombre, String apPaterno, String apMaterno, int edad, String curp) {
        super(nombre, apPaterno, apMaterno, edad, curp);
        this.numeroEmpleado = numeroEmpleado;
        this.departamento = departamento;
        this.sueldo = sueldo;
        this.horasextra = horasextra;
        this.domicilio = domicilio;
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public int getHorasextra() {
        return horasextra;
    }

    public void setHorasextra(int horasextra) {
        this.horasextra = horasextra;
    }

    public Direccion getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Direccion domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "Empleado{" + "numeroEmpleado=" + numeroEmpleado + ", departamento=" + departamento + ", sueldo=" + sueldo + ", horasextra=" + horasextra + ", domicilio=" + domicilio + '}';
    }

    public float calcularsueldo() {
        //hora extra $150.0
        float sueldoTotal = 0.0f;
        sueldoTotal = this.sueldo + (this.horasextra * 150.0f);

        return sueldoTotal;
    }
}
