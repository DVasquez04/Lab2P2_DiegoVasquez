/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_diegovasquez;

/**
 *
 * @author Diego Vasquez
 */
public class Chefs {
    private String Nombre;
    
    private int Edad;
    
    private String Turno;
    
    private int Estrellas;
    
    private double Sueldo;

    public Chefs() {
    }

    public Chefs(String Nombre, int Edad, String Turno, int Estrellas, double Sueldo) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Turno = Turno;
        this.Estrellas = Estrellas;
        this.Sueldo = Sueldo;
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

    public int getEstrellas() {
        return Estrellas;
    }

    public double getSueldo() {
        return Sueldo;
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

    public void setEstrellas(int Estrellas) {
        this.Estrellas = Estrellas;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }

    @Override
    public String toString() {
        return "Nombre=" + Nombre + "\nEdad=" + Edad + "\nTurno=" + Turno + "\nEstrellas=" + Estrellas + "\nSueldo=" + Sueldo;
    }
    
    
}
