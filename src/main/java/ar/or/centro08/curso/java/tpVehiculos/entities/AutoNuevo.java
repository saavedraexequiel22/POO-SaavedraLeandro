package ar.or.centro08.curso.java.tpVehiculos.entities;

public class AutoNuevo extends Vehiculos {
    public AutoNuevo(String color, String marca, int modelo, double precio, Radio radio) {
        super(color, marca, modelo, precio);
        this.radio = radio; // siempre tiene radio solo se puede cambiar
        radio.cambiarRadio();
    }
}
