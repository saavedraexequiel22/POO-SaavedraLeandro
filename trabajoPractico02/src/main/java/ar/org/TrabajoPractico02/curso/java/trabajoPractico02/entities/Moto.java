package ar.org.TrabajoPractico02.curso.java.trabajoPractico02.entities;

public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String marca, String modelo, double precio, int cilindrada) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }
    @Override
    public String getDetalle(){
        return "Cilindrada: " + cilindrada + "cc";
    }
}
