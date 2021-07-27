package com.paradigmafuncional;

public class ImperativoXDeclarativo {
        public static void main(String[] args) {
            Funcao1 funcao1 = valor -> {
                return valor;
            };
            System.out.println(funcao1.gerar("Joao"));
        }
    }

    interface Funcao1 {
        String gerar(String valor);
}
