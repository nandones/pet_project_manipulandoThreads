package com.nandones.cursojavaloiane.threads;

public class GUIThreads extends Thread {

    MinhaThread t1;
    MinhaThread t2;
    MinhaThread t3;
    MinhaThread t4;
    MinhaThread t5;

    public GUIThreads(MinhaThread t1, MinhaThread t2, MinhaThread t3, MinhaThread t4, MinhaThread t5) {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
        this.t4 = t4;
        this.t5 = t5;
        start();
        System.out.println("controle inicializado");
    }

    public void run() {
        String controleLocal = "";
        String thread1 = "t1: ";
        String thread2 = "t2: ";
        String thread3 = "t3: ";
        String thread4 = "t4: ";
        String thread5 = "t5: ";

        while (true) {
            System.out.println("controle(" + Teste.nomeThread + ") && controleLocal(" + controleLocal + ")");
            if (!Teste.nomeThread.equals("")) {
                controleLocal = Teste.nomeThread;
                System.out.println("controle(" + Teste.nomeThread + ") && controleLocal(" + controleLocal + ")");
                break;
            }
        }

        while (!t1.finished || !t2.finished || !t3.finished || !t4.finished || !t5.finished) {
            if (Teste.proximoProcesso) {
                switch (Teste.nomeThread) {
                    case "Thread #1":
                        thread1 += "+";
                        thread2 += "-";
                        thread3 += "-";
                        thread4 += "-";
                        thread5 += "-";
                        Teste.proximoProcesso = false;
                        break;
                    case "Thread #2":
                        thread1 += "-";
                        thread2 += "+";
                        thread3 += "-";
                        thread4 += "-";
                        thread5 += "-";
                        Teste.proximoProcesso = false;
                        break;
                    case "Thread #3":
                        thread1 += "-";
                        thread2 += "-";
                        thread3 += "+";
                        thread4 += "-";
                        thread5 += "-";
                        Teste.proximoProcesso = false;
                        break;
                    case "Thread #4":
                        thread1 += "-";
                        thread2 += "-";
                        thread3 += "-";
                        thread4 += "+";
                        thread5 += "-";
                        Teste.proximoProcesso = false;
                        break;
                    case "Thread #5":
                        thread1 += "-";
                        thread2 += "-";
                        thread3 += "-";
                        thread4 += "-";
                        thread5 += "+";
                        Teste.proximoProcesso = false;
                        break;
                }
                controleLocal = Teste.nomeThread;
                System.out.println("\n\n" +
                        thread1 + "\n" +
                        thread2 + "\n" +
                        thread3 + "\n" +
                        thread4 + "\n" +
                        thread5 + "\n\n"
                );
            }
            try {
                Thread.sleep(1); // Pequeno delay para evitar loop ocupado
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("end.");
    }
}
