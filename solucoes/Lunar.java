import java.util.Scanner;

public class Lunar {
    private static final Scanner terminal = new Scanner(System.in);

    public static void main(String[] args) {
        tratamento();
        terminal.close();
    }

    private static void tratamento() {
        try {
            int contadorTeste = 1;

            while(true) {
                int maior, menor, contador;
                int []temperatura = new int[10000];

                int n = terminal.nextInt();
                int m = terminal.nextInt();

                encerramento(n, m);

                int soma = 0;

                for(contador = 0; contador < m; contador++){
                    soma += temperatura[contador] = terminal.nextInt();
                }

                maior = menor = soma;

                for(; contador < n; contador++) {
                    temperatura[contador] = terminal.nextInt();

                    soma += temperatura[contador] - temperatura[contador - m];

                    if(soma > maior) {
                        maior = soma;
                    } else if(soma < menor) {
                        menor = soma;
                    }
                }

                System.out.println("Teste "  + contadorTeste++ + "\n" + (menor / m) + " " + (maior / m) + "\n");
            }
        } catch(Exception ignored) {}
    }

    private static void encerramento(int na, int nb) {
        if(na == 0 && nb == 0) {
            System.exit(0);
        }
    }
}
