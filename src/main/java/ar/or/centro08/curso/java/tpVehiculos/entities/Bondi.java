package ar.or.centro08.curso.java.tpVehiculos.entities;

public final class Bondi extends Vehiculos {
    public Bondi(String color, String marca, int modelo, double precio) {
        super(color, marca, modelo, precio);
    }

    @Override
    public void agregarRadio(Radio radio) {
        super.agregarRadio(radio);
    }

}
