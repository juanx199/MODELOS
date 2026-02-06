/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizzeria;

import java.util.Scanner;

/**
 *
 * @author JUANCA
 */

public class Main {
    public static void main(String[] args) {
        Factory fabrica = new Factory();
        Store tienda = new Store(fabrica);
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("### GOLA, BIENBENIDO A MI PIZZERIA ###");
        System.out.println("¿Qué pizza quiere ordenar? \n 1. cheese \n 2. pepperoni \n 3.clam \n 4. veggie\n");
        
        String eleccion = teclado.nextLine().toLowerCase().trim();
        
        System.out.println("\n Procesando pedido c:");
        
        // 4. Se lo pasamos a la tienda (que usará la fábrica)
        Pizza miPizza = tienda.orderPizza(eleccion);
        
        // 5. Verificación final
        if (miPizza != null) {
            System.out.println("\n¡Disfrute su " + miPizza.getNombre() + "!");
        } else {
            System.out.println("\nError: No tenemos esa pizza en el menú.");
        }

        teclado.close();
    }
}
