package ar.or.centro08.curso.java.tpVehiculos.entities;

public class Radio {
    private String marca;
    private double potencia;
    private Vehiculos vehiculo;

    public Radio(String marca, int potencia) {
        this.marca = marca;
        this.potencia = potencia;
    }

    public void agregarRadio(Vehiculos vehiculo) {
        if (this.vehiculo == null) {
            this.vehiculo = vehiculo;
        } else {
            System.out.println("esta radio ya esta asignada a un vehiculo");
        }
    }

    public void cambiarRadio() {
        this.vehiculo = null;
    }

    @Override
    public String toString() {
        return "radio {" + marca + "/" + potencia + "}";
    }
}
