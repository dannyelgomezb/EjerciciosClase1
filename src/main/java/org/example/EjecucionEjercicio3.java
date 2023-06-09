package org.example;

public class EjecucionEjercicio3 implements Ejercicio3{
    @Override
    public int CalcularIva(int ventas) {
        return ((ventas*21)/100);
    }
    @Override
    public int CalcularIva(int ventas, int iva) {
        return ((ventas*iva)/100);
    }
}