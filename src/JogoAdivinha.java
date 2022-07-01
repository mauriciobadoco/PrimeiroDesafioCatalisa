import java.util.Scanner;
import java.util.Random;


public class JogoAdivinha {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean jogadas = true;
        int somaPonto = 0;
        int nivel;

        System.out.println("Selecione o nível de dificuldade?");
        System.out.println("--------------------------------------");
        System.out.println("Fácil   até  4 -> Digite 'F' <-\n");
        System.out.println("Difícil até 10 -> Digite 'D' <-");
        System.out.println("--------------------------------------\n");
        String dific = input.next();
        if ("f".equalsIgnoreCase(dific)) {
            nivel = 4;
        } else {
            nivel = 11;
        }

        while (jogadas) {

            System.out.println("Digite um número ");
            int jogador = input.nextInt();
            Random aleatorio = new Random();
            int valor = (aleatorio.nextInt(nivel) +1 );
            int valorMaior = valor + 1;
            int valorMenor = valor - 1;
            int jogo2 = 0;
            int pontos = 0;
            if (jogador == valor) {
                pontos = pontos + 10;
                System.out.println("Parabéns, VOCÊ VENCEU. Ganhou: " + pontos + "pontos");
            } else if (((jogador == valorMaior)) || (jogador == (valorMenor))) {
                pontos = pontos + 5;
                System.out.println("Você ganhou 5 pontos");
                System.out.println("Você tem mais uma chance, digite outro número:");
                jogo2 = input.nextInt();

                if (jogo2 == valor) {
                    pontos = pontos + 10;
                    System.out.println("Parabéns, VOCÊ VENCEU. Ganhou: " + pontos + "pontos");
                } else if (((jogo2 == valorMaior)) || (jogo2 == (valorMenor))){
                    pontos = pontos + 5;
                    System.out.println("Você ganhou + 5 pontos");
                }else {
                    System.out.println("Você perdeu");
                }
            } else
                System.out.println("Você perdeu");

            System.out.println("O primeiro número digitado foi " + jogador + "\n");
            if (jogo2 != 0){
                System.out.println("O segundo número digitado foi: " + jogo2 + "\n");
            }

            System.out.println("O número do computador foi:" + valor + "\n");
            System.out.println("Você obteve:" + pontos + " pontos");
            System.out.print("_________________________ \n Você quer continuar jogando?  S ou N\n");
            String resp = input.next();
            jogadas = "s".equalsIgnoreCase(resp);
            somaPonto = somaPonto + pontos;
        }

        System.out.println("Você fez no total: " + somaPonto + " pontos\n");
        System.out.println("OBRIGADO POR JOGAR COMIGO");
    }
}