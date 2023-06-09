package org.example;

import java.util.List;

public class EjecucionEjercicio1 implements Ejercicio1 {

    @Override
    public void CalcularMayor(List<Integer> list) {
        System.out.println(list.stream().max(Integer::compareTo).get());
    }

    @Override
    public void CalcularMenor(List<Integer> list) {
        System.out.println(list.stream().min(Integer::compareTo).get());
    }
}
