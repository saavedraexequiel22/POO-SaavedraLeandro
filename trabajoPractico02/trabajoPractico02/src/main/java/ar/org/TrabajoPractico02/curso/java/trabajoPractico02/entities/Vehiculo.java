package ar.org.TrabajoPractico02.curso.java.trabajoPractico02.entities;

public abstract class Vehiculo implements Comparable<Vehiculo> {// permite ordenar vehiculos por marca y
                                                                // moedelo.
    protected String marca;
    protected String modelo;
    protected double precio;

    public Vehiculo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public abstract String getDetalle();// permite que cada subclase implemente su propio detalle
                                        // especifico(polimporfismo).

    @Override
    public int compareTo(Vehiculo otroVehiculo) {// Ordena primero por marca luego por modelo.
        return this.marca.compareTo(otroVehiculo.marca) != 0 ? this.marca.compareTo(otroVehiculo.marca)
                : this.modelo.compareTo(otroVehiculo.modelo);

    }

    @Override
    public String toString() {
        return String.format("Marca: %s // Modelo: %s // %s // Precio: $%,.2f",
                marca, modelo, getDetalle(), precio);
    }

}
