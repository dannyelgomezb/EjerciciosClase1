package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Integer> lista2 = List.of(1,3,4,5,11,6,8,9,0);
        System.out.println("-------------------------- Ejercicio 1 ----------------------------");
        System.out.println("El número mayor");
        EjecucionEjercicio1 Ejercicio1=new EjecucionEjercicio1();
        Ejercicio1.CalcularMayor(lista2);

        System.out.println("El número menor");
        Ejercicio1.CalcularMenor(lista2);

        //EJERCICIO 2

        int ventas = 800000;
        int descuento = 15;

        EjecucionEjercicio2 ejercicio2=new EjecucionEjercicio2();
        System.out.println("-------------------------- Ejercicio 2 ----------------------------");
        System.out.println("El Valor de la venta con descuento es: "+ ejercicio2.CalcularDescuento(ventas, descuento));

        System.out.println("------------------------> Ejercicio 3 <--------------------------");
        int precio = 80000;
        int iva = 12;
        EjecucionEjercicio3 ejercicio3= new EjecucionEjercicio3();
        System.out.println("Prueba con Iva definido");
        System.out.println(ejercicio3.CalcularIva(precio,iva));
        System.out.println("Prueba con Iva no definido");
        System.out.println(ejercicio3.CalcularIva(precio));

    }

}