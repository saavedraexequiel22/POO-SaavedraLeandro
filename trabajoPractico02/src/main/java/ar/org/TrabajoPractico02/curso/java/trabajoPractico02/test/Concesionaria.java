package ar.org.TrabajoPractico02.curso.java.trabajoPractico02.test;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import ar.org.TrabajoPractico02.curso.java.trabajoPractico02.entities.Vehiculo;
import ar.org.TrabajoPractico02.curso.java.trabajoPractico02.interfaces.VehiculoFactory;

public class Concesionaria {
    public static void main(String[] args) {
        // El codigo de prueba se encuentra en la clase Main del paquete principal.
        List<Vehiculo> vehiculos = VehiculoFactory.cargarVehiculos();
        System.out.println("===== Listado de Vehiculos =====");
        // Imprimir vehiculos
        vehiculos.forEach( System.out::println);

        // Vehiculo mas caro
        Vehiculo vehiculoMasCaro = Collections.max(vehiculos, Comparator.comparingDouble(Vehiculo::getPrecio));
        System.out.println("Vehiculo mas caro: " + vehiculoMasCaro.getMarca() + " " + vehiculoMasCaro.getModelo());

        // Vehiculo mas barato
        Vehiculo vehiculoMasBarato = Collections.min(vehiculos, Comparator.comparingDouble(Vehiculo::getPrecio));
        System.out.println("Vehiculo mas barato: " + vehiculoMasBarato.getMarca() + " " + vehiculoMasBarato.getModelo());
        System.out.println("=============================");

        vehiculos.stream()
                .filter(v -> v.getModelo().toLowerCase().contains("y"))
                .forEach(v -> System.out.println("Vehiculo que contiene en el modelo la letra 'Y': " + v.getMarca() + " " + v.getModelo() + " $" + v.getPrecio()));

                System.out.println("=============================");
                System.out.println("Vehiculos ordenados por marca, modelo, precio:");
                vehiculos.stream()
                .sorted(Comparator.comparing(Vehiculo::getMarca)
                        .thenComparing(Vehiculo::getModelo)
                        .thenComparingDouble(Vehiculo::getPrecio))
                .forEach(System.out::println);


    }
    
}


