/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_diegovasquez;

/**
 *
 * @author Diego Vasquez
 */
public class Mesero {
     private String Nombre;
    private int Edad;
    private String Turno;
    private double Sueldo;
    private double Propina;

    public Mesero() {
    }

    public Mesero(String Nombre, int Edad, String Turno, double Sueldo, double Propina) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Turno = Turno;
        this.Sueldo = Sueldo;
        this.Propina = Propina;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public String getTurno() {
        return Turno;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public double getPropina() {
        return Propina;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public void setTurno(String Turno) {
        this.Turno = Turno;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }

    public void setPropina(double Propina) {
        this.Propina = Propina;
    }

    @Override
    public String toString() {
        return "Nombre=" + Nombre + "\nEdad=" + Edad + "\nTurno=" + Turno + "\nSueldo=" + Sueldo + "\nPropina=" + Propina;
    }
}
