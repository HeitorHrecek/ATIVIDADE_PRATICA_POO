package org.example;

public class Tarefa {
    private String nome;
    private String prazo;
    private boolean concluida;

    public Tarefa(String nome, String prazo) {
        this.nome = nome;
        this.prazo = prazo;
        this.concluida = false;
    }

    public String getNome() {
        return nome;
    }

    public String getPrazo() {
        return prazo;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void concluirTarefa(){
        this.concluida = true;
    }
    public void alterarPrazo(String date){
       this.prazo = date;
    }
}
