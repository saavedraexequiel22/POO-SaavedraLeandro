
/*
 *contiene atributos y metodos comunes a todo los tipos de vehiculos. 
 * 
 */
package ar.or.centro08.curso.java.tpVehiculos.entities;

public abstract class Vehiculos {
    protected String color;
    protected String marca;
    protected int modelo;
    protected double precio;
    protected Radio radio;

    public Vehiculos(String color, String marca, int modelo, double precio) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public void agregarRadio(Radio radio) {
        if (this.radio == null) {
            this.radio = radio;
            System.out.println("Se ha agregado una radio: " + this.getClass().getSimpleName());
        } else {
            System.out.println("EL: " + this.getClass().getSimpleName() + "ya tiene radio.");
        }
    }

    public void cambiarRadio(Radio nuevaRadio) {
        if (this.radio != null) {
            this.radio = nuevaRadio;
            System.out.println("Se ha cambiado la radio del: " + this.getClass().getSimpleName());
        } else {
            System.out.println("El: " + this.getClass().getSimpleName() + "no tiene radio. Usa agregar radio.");
        }
    }

    public Radio getRadio() {
        return radio;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo=" + modelo +
                ", precio=" + precio +
                ", radio=" + (radio != null ? radio : "sin radio") +
                '}';
    }

}
