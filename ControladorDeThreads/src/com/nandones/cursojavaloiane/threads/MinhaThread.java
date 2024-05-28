package com.nandones.cursojavaloiane.threads;

public class MinhaThread extends Thread {

    private String nome;
    private int tempo;
    public boolean finished;

    public MinhaThread(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
        this.finished = false;
        start();
    }

    public void run() {
        try {
            System.out.println(nome + " executando");
            for (int i = 0; i < 10; i++) {
                Teste.nomeThread = nome;
                Teste.proximoProcesso = true;
                Thread.sleep(tempo);
            }
            finished = true;
            System.out.println(nome + " finished.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
