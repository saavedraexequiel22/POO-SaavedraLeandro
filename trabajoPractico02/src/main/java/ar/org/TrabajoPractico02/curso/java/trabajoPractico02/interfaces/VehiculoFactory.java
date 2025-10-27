
package ar.org.TrabajoPractico02.curso.java.trabajoPractico02.interfaces;

import java.util.List;
import java.util.ArrayList;
import ar.org.TrabajoPractico02.curso.java.trabajoPractico02.entities.Vehiculo;
import ar.org.TrabajoPractico02.curso.java.trabajoPractico02.entities.Auto;
import ar.org.TrabajoPractico02.curso.java.trabajoPractico02.entities.Moto;
public class VehiculoFactory {

public static List<Vehiculo> cargarVehiculos() {
        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Auto("Peugeot", "206", 200000.0, 4));
        vehiculos.add(new Moto("Honda", "Titan", 60000.0, 125));
        vehiculos.add(new Auto("Peugeot", "208", 250000.0, 5));
        vehiculos.add(new Moto("Yamaha", "YBR", 80500.50, 160));
        return vehiculos;
    }
}