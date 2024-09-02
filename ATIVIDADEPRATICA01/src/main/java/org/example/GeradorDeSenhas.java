package org.example;

import java.util.Random;

public class GeradorDeSenhas {

    private  String MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
    private  String MAIUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private  String NUMEROS = "0123456789";
    private  String SIMBOLOS_ESPECIAIS = "!@#$%^&*()-_=+[]{}|;:',.<>?/";

    private Random random = new Random();

    public String gerarSenha(int comprimento, boolean incluirMinusculas, boolean incluirMaiusculas, boolean incluirNumeros, boolean incluirSimbolos) {
        if (!incluirMinusculas && !incluirMaiusculas && !incluirNumeros && !incluirSimbolos) {
            System.out.println("Selecione uma categoria! Ao menos uma deve ser selecionada");
        }

        StringBuilder caracteresPermitidos = new StringBuilder();

        if (incluirMinusculas) {
            caracteresPermitidos.append(MINUSCULAS);
        }
        if (incluirMaiusculas) {
            caracteresPermitidos.append(MAIUSCULAS);
        }
        if (incluirNumeros) {
            caracteresPermitidos.append(NUMEROS);
        }
        if (incluirSimbolos) {
            caracteresPermitidos.append(SIMBOLOS_ESPECIAIS);
        }

        if (comprimento <= 0) {
            return "";
        }

        StringBuilder senha = new StringBuilder(comprimento);
        for (int i = 0; i < comprimento; i++) {
            int index = random.nextInt(caracteresPermitidos.length());
            senha.append(caracteresPermitidos.charAt(index));
        }

        return senha.toString();
    }
}
