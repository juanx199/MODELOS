/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizzeria;

/**
 *
 * @author JUANCA
 */
public class Factory {
    public Pizza createPizza(String type) {
        switch (type) {
            case "cheese" -> {
                return new CheesePizza();
            }
            case "pepperoni" -> {
                return new PepperoniPizza();
            }
            case "Veggie" -> {
                return new VeggiePizza();
            }
            case "clam" -> {
                return new ClamPizza();
            }
            default -> {
            }
        }
        return null;
    }
}
