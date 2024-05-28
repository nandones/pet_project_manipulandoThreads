package com.nandones.cursojavaloiane.threads;

public class Teste {

    public static String nomeThread = "";
    public static boolean proximoProcesso = false;

    public static void main(String args[]) {

        MinhaThread thread1 = new MinhaThread("Thread #1", 900);
        MinhaThread thread2 = new MinhaThread("Thread #2", 1200);
        MinhaThread thread3 = new MinhaThread("Thread #3", 1500);
        MinhaThread thread4 = new MinhaThread("Thread #4", 1650);
        MinhaThread thread5 = new MinhaThread("Thread #5", 100);

        GUIThreads painel = new GUIThreads(thread1, thread2, thread3, thread4, thread5);
    }
}
