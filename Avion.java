/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author Estudiantes
 */
public class Avion implements Cloneable {

    private String modelo;
    private String fabricante;
    private int capacidadPasajeros;
    private double autonomia;
    private MotorTin motor;

    public Avion(String modelo, String fabricante, int capacidadPasajeros, double autonomia, MotorTin motor) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.capacidadPasajeros = capacidadPasajeros;
        this.autonomia = autonomia;
        this.motor = motor;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public void setAutonomia(double autonomia) {
        this.autonomia = autonomia;
    }

    public MotorTin getMotorTin() {
        return motor;
    }

    @Override
    public Avion clone() {
        try {
            Avion copia = (Avion) super.clone();
            copia.motor = motor.clone(); 
            return copia;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Error al clonar Avion");
        }
    }

    public void mostrarInformacion() {
        System.out.println("----- AVIÓN -----");
        System.out.println("Modelo: " + modelo);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Capacidad: " + capacidadPasajeros);
        System.out.println("Autonomía: " + autonomia);
        motor.mostrarInfo();
        System.out.println();
    }
}
