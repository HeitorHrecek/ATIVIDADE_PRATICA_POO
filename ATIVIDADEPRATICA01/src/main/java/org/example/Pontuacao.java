package org.example;

public class Pontuacao {
    private int pontuacao;

    public int getPontuacao() {
        return pontuacao;
    }

    public void adicionarPontos(int pontos){
        this.pontuacao = pontuacao + pontos;
    }
    public void removerPontos(int pontos){
       if(pontuacao - pontos >=0){
           this.pontuacao -= pontos;
       }
    }

}
