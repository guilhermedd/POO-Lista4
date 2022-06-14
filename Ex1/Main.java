package Ex1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        IOperacaInteira[] operacoes = new IOperacaInteira[4];

        operacoes[0] = new Soma();
        operacoes[1] = new Multiplicacao();
        operacoes[2] = new MDC();
        operacoes[3] = new Mod();

        int aleatorio1 = rand.nextInt(100);
        int aleatorio2 = rand.nextInt(100);
        System.out.println("Soma dos numeros: " + aleatorio1 + " e " + aleatorio2 +
        " eh: " + operacoes[0].executar(aleatorio1, aleatorio2));

        aleatorio1 = rand.nextInt(100);
        aleatorio2 = rand.nextInt(100);
        System.out.println("Multiplicacao dos numeros: " + aleatorio1 + " e " + aleatorio2 +
                " eh: " + operacoes[1].executar(aleatorio1, aleatorio2));

        aleatorio1 = rand.nextInt(100);
        aleatorio2 = rand.nextInt(100);
        System.out.println("O MDC dos numeros: " + aleatorio1 + " e " + aleatorio2 +
                " eh: " + operacoes[2].executar(aleatorio1, aleatorio2));

        aleatorio1 = rand.nextInt(100);
        aleatorio2 = rand.nextInt(100);
        System.out.println("O Mod dos numeros: " + aleatorio1 + " e " + aleatorio2 +
                " eh: " + operacoes[3].executar(aleatorio1, aleatorio2));

    }

}
