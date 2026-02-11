/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modelosblbl;

import java.util.concurrent.atomic.AtomicLong;

public final class DatabaseConnection {

    // -instance: DatabaseConnection
    private static volatile DatabaseConnection instance;

    // -host: String
    private final String host;

    // -user: String
    private final String user;

    // -pass: String
    private final String pass;

    // -name: String
    private final String name;

    // -getUniqueIdentificator: Number  (helper para generar un id único)
    private static final AtomicLong SEQ = new AtomicLong(0);
    private final Number uniqueIdentificator;

    // -DatabaseConnection(host,user,pass,name)
    private DatabaseConnection(String host, String user, String pass, String name) {
        this.host = host;
        this.user = user;
        this.pass = pass;
        this.name = name;
        this.uniqueIdentificator = getUniqueIdentificator();
    }

    // -getUniqueIdentificator: Number
    private Number getUniqueIdentificator() {
        return SEQ.incrementAndGet();
    }

    // +getDatabaseConnection(host,user,pass,name): DatabaseConnection
    public static DatabaseConnection getDatabaseConnection(
            String host, String user, String pass, String name
    ) {
        if (instance == null) {
            synchronized (DatabaseConnection.class) {
                if (instance == null) {
                    instance = new DatabaseConnection(host, user, pass, name);
                }
            }
        }
        return instance;
    }

    // (Opcional) getters útiles
    public String getHost() { return host; }
    public String getUser() { return user; }
    public String getName() { return name; }
    public Number getConnectionId() { return uniqueIdentificator; }

    @Override
    public String toString() {
        return "DatabaseConnection{" +
                "host='" + host + '\'' +
                ", user='" + user + '\'' +
                ", name='" + name + '\'' +
                ", id=" + uniqueIdentificator +
                '}';
    }
}

// Client -> usa DatabaseConnection
class Client {
    public static void main(String[] args) {
        DatabaseConnection c1 = DatabaseConnection.getDatabaseConnection(
                "localhost", "admin", "1234", "MiBD"
        );

        DatabaseConnection c2 = DatabaseConnection.getDatabaseConnection(
                "otrohost", "otroUser", "otraPass", "OtraBD"
        );

        // Debe ser la misma instancia (Singleton)
        System.out.println(c1);
        System.out.println("¿Misma instancia? " + (c1 == c2));
    }
}
