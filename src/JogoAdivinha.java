import java.util.Scanner;
import java.util.Random;



public class JogoAdivinha {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean jogadas = true;
        int somaPonto = 0;
        while (jogadas) {

            System.out.println("Digite um número de 0 a 3: ");
            int jogador = input.nextInt();
            Random aleatorio = new Random();
            int valor = aleatorio.nextInt(4);
            int valorMaior = valor + 1;
            int valorMenor = valor - 1;
            int jogo2 = 0;
            int pontos = 0;
            if (jogador == valor) {
                pontos = pontos + 10;
                System.out.println("Você Venceu, Total de pontos: " + pontos);
            } else if (((jogador == valorMaior)) || (jogador == (valorMenor))) {
                pontos = pontos + 5;
                System.out.println("Você ganhou 5 pontos");
                System.out.println("Você tem mais uma chance, digite outro número");
                jogo2 = input.nextInt();

                if (jogo2 == valor) {
                    pontos = pontos + 10;
                    System.out.println("Você Venceu, Total de pontos: " + pontos);
                } else {
                    System.out.println("Você perdeu");
                }
            } else
                System.out.println("Você perdeu");

            System.out.println("O número digitado foi " + jogador + " E " + jogo2);
            System.out.println("O número do computador foi:" + valor);
            System.out.println("Você obteve a pontuação" + pontos);

            System.out.println("Você quer continuar jogando?");
            System.out.print("\n _________________________\n ");
            System.out.print("Para continuar digite = 1 \n");
            System.out.print("Para    sair   digite = 2 \n");
            System.out.print("__________________________\n");
            int resp = input.nextInt();

            switch (resp) {
                case 1 -> {
                }
                case 2 -> jogadas = false;
            }
            somaPonto = somaPonto + pontos;
        }
        System.out.println("Você fez a pontuação de :" + somaPonto);
    }
}