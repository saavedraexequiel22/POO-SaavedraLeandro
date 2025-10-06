package tes;

import ar.or.centro08.curso.java.tpVehiculos.entities.AutoClasico;
import ar.or.centro08.curso.java.tpVehiculos.entities.AutoNuevo;
import ar.or.centro08.curso.java.tpVehiculos.entities.Bondi;
import ar.or.centro08.curso.java.tpVehiculos.entities.Radio;

public class TesVehiculo {
    public static void main(String[] args) {
        Radio r01 = new Radio("sony", 50);
        Radio r02 = new Radio("Pioner", 60);

        System.out.println("***AutoClasico***");
        AutoClasico clasico = new AutoClasico("rojo", "Toyota", 1978, 2200000.0);
        clasico.agregarRadio(r02);
        clasico.cambiarRadio(r01);
        System.out.println(clasico);

        System.out.println("***AutoNuevo**");
        AutoNuevo nuevo = new AutoNuevo("verde", "Citroen", 2000, 50000.0, r02);
        nuevo.cambiarRadio(r01);
        System.out.println(nuevo);

        System.out.println("**Bondi**");
        Bondi bondi1 = new Bondi("Naranja", "BMW", 1978, 50000.0);
        bondi1.agregarRadio(r02);
        System.out.println(bondi1);

    }

}
