/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_diegovasquez;

/**
 *
 * @author Diego Vasquez
 */
public class Bartender {
    private String Nombre;
    private int Edad;
    private String Turno;
    private double Sueldo;
    private int LicoresDisp;

    public Bartender() {
    }

    public Bartender(String Nombre, int Edad, String Turno, double Sueldo, int LicoresDisp) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Turno = Turno;
        this.Sueldo = Sueldo;
        this.LicoresDisp = LicoresDisp;
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

    public int getLicoresDisp() {
        return LicoresDisp;
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

    public void setLicoresDisp(int LicoresDisp) {
        this.LicoresDisp = LicoresDisp;
    }

    @Override
    public String toString() {
        return "Nombre=" + Nombre + "\nEdad=" + Edad + "\nTurno=" + Turno + "\nSueldo=" + Sueldo + "\nLicoresDisp=" + LicoresDisp;
    }
    
    
}
