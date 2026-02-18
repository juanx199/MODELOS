
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Estudiantes
 */


public class Main {

    public static void main(String[] args) {

       
        MotorTin motorBase = new MotorTin("CFM56", "CFM International", 27000);
        Avion avion1 = new Avion("737 MAX", "Boeing", 210, 6570, motorBase);

        // BLBLBLBLBLLBL
        Avion avion2 = avion1.clone();
        Avion avion3 = avion1.clone();
        Avion avion4 = avion1.clone();

        Avion avion5 = avion1.clone();
        avion5.setCapacidadPasajeros(180);
        avion5.setAutonomia(7000);

        
        Avion avion6 = avion1.clone();
        avion6.getMotorTin().setModelo("GE90");
        avion6.getMotorTin().setFabricante("DOBLE J");
        avion6.getMotorTin().setCaballosFuerza(33000);

        // Mostrar resultadoS
        avion1.mostrarInformacion();
        avion2.mostrarInformacion();
        avion3.mostrarInformacion();
        avion4.mostrarInformacion();
        avion5.mostrarInformacion();
        avion6.mostrarInformacion();
    }
}
