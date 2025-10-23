package ar.org.TrabajoPractico02.curso.java.trabajoPractico02.test;

public class Concesionaria {
    public static void main(String[] args) {
        // El codigo de prueba se encuentra en la clase Main del paquete principal.
        List<Vehiculo> vehiculos = cargarVehiculos();

        // Imprimir vehiculos
        vehiculos.forEach( System.out::println);

        // Vehiculo mas caro
        Vehiculo vehiculoMasCaro = Collections.max(vehiculos, Comparator.comparingDouble(vehiculos::getPrecio));
        System.out.println("Vehiculo mas caro: " + vehiculoMasCaro.getMarca() + " " + vehiculoMasCaro.getModelo());

        // Vehiculo mas barato
        Vehiculo vehiculoMasBarato = Collections.min(vehiculos, Comparator.comparingDouble(vehiculos::getPrecio));
        System.out.println("Vehiculo mas barato: " + vehiculoMasBarato.getMarca() + " " + vehiculoMasBarato.getModelo());
        System.out.println("=============================");


    }
    
}
