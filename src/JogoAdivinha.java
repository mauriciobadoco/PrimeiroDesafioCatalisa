import java.util.Scanner;
import java.util.Random;



public class JogoAdivinha {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
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
            int jogada2 = input.nextInt();
            jogo2 = jogada2;

                if (jogo2 == valor) {
                    pontos = pontos + 10;
                    System.out.println("Você Venceu, Total de pontos: " + pontos);
                } else if (((jogo2 != valorMaior)) || (jogo2 != (valorMenor))) {
                    System.out.println("Você perdeu");
                } else if (jogador == jogo2) {
                     System.out.println("Número digitado repetido");
                }else{
                    pontos = pontos + 5;
                }
            }else
            System.out.println("Você perdeu");

        System.out.println("O número digitado foi " +jogador+ " E "+jogo2);
        System.out.println("O número do computador foi:"+valor);
        System.out.println("Você obteve a pontuação"+pontos);
        }
}
