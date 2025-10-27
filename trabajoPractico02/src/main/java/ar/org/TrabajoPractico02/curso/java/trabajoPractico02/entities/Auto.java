package ar.org.TrabajoPractico02.curso.java.trabajoPractico02.entities;

public class Auto extends Vehiculo {
    private int puertas;

    public Auto(String marca, String modelo, double precio, int puertas) {
        super(marca, modelo, precio);
        this.puertas = puertas;
    }

    @Override
    public String getDetalle() {
        return "Puertas: " + puertas;
    }
    
}
