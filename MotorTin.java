/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Estudiantes

     */
public class MotorTin implements Cloneable {

    private String modelo;
    private String fabricante;
    private int caballosFuerza;

    public MotorTin(String modelo, String fabricante, int caballosFuerza) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.caballosFuerza = caballosFuerza;
    }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getFabricante() { return fabricante; }
    public void setFabricante(String fabricante) { this.fabricante = fabricante; }

    public int getCaballosFuerza() { return caballosFuerza; }
    public void setCaballosFuerza(int caballosFuerza) { this.caballosFuerza = caballosFuerza; }

    @Override
    public MotorTin clone() {
        try {
            return (MotorTin) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Error al clonar Motor");
        }
    }

    public void mostrarInfo() {
        System.out.println("Motor: " + modelo);
        System.out.println("Fabricante Motor: " + fabricante);
        System.out.println("Caballos: " + caballosFuerza);
    }
}