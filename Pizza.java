/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizzeria;

/**
 *
 * @author JUANCA
 */

public abstract class Pizza {
    String nombre;
    public void prepare() { System.out.println("Preparando pizza " + nombre); }
    public void bake()    { System.out.println("Horneando"); }
    public void cut()     { System.out.println("Cortando"); }
    public void box()     { System.out.println("Empacando"); }

    String getNombre() {
        return nombre; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

class CheesePizza extends Pizza{
    public CheesePizza() { this.nombre = "Piza de queso" ;}
}
class VeggiePizza extends Pizza{
    public VeggiePizza() { this.nombre = "Piza vegana" ;}
}
class ClamPizza extends Pizza{
    public ClamPizza() { this.nombre = "Piza de noc que sea clam" ;}
}
class PepperoniPizza extends Pizza{
    public PepperoniPizza() { this.nombre = "Piza depepperoni" ;}
}
