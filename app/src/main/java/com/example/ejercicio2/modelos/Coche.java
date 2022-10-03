package com.example.ejercicio2.modelos;

public class Coche {
    private String marca, modelos, color;

    public Coche(String marca, String modelos, String color) {
        this.marca = marca;
        this.modelos = modelos;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelos() {
        return modelos;
    }

    public void setModelos(String modelos) {
        this.modelos = modelos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelos='" + modelos + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
