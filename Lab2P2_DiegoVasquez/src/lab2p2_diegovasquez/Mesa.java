/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_diegovasquez;

/**
 *
 * @author Diego Vasquez
 */
public class Mesa {
    private int NumeroPlatos;
    private int NumeroUtensilios;
    private double Precio;

    public Mesa() {
    }

    public Mesa(int NumeroPlatos, int NumeroUtensilios, double Precio) {
        this.NumeroPlatos = NumeroPlatos;
        this.NumeroUtensilios = NumeroUtensilios;
        this.Precio = Precio;
    }

    public int getNumeroPlatos() {
        return NumeroPlatos;
    }

    public int getNumeroUtensilios() {
        return NumeroUtensilios;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setNumeroPlatos(int NumeroPlatos) {
        this.NumeroPlatos = NumeroPlatos;
    }

    public void setNumeroUtensilios(int NumeroUtensilios) {
        this.NumeroUtensilios = NumeroUtensilios;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    @Override
    public String toString() {
        return "NumeroPlatos=" + NumeroPlatos + "\nNumeroUtensilios=" + NumeroUtensilios + "\nPrecio=" + Precio;
    }
    
  
  
}
