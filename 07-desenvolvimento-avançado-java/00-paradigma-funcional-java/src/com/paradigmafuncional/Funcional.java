package com.paradigmafuncional;

import java.util.function.UnaryOperator;

public class Funcional {
    public static void main(String[] args) {
        UnaryOperator<Integer> calcularValorVezes3 = valor -> valor*3; // um conceito do paradgma funcional
        int valor = 10;
        System.out.println("O resultado é : "+calcularValorVezes3.apply(10));
    }
}
