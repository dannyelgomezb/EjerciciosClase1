package org.example;

public class EjecucionEjercicio2 implements Ejercicio2{

    @Override
    public int CalcularDescuento(int Ventas, int Descuento) {
        return Ventas-(Ventas*Descuento/100);
    }
}
