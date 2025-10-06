package ar.or.centro08.curso.java.tpVehiculos.entities;

public class AutoClasico extends Vehiculos {
    public AutoClasico(String color, String marca, int modelo, double precio) {
        super(color, marca, modelo, precio);// usa el contructor sin radio
    }

    @Override
    public void agregarRadio(Radio radio) {
        super.agregarRadio(radio);
    }

}
