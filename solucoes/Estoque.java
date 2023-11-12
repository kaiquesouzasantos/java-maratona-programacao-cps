import java.util.Scanner;

public class Estoque {
    private static final Scanner terminal = new Scanner(System.in);

    public static void main(String[] args) {
        tratamento();
        terminal.close();
    }

    private static void tratamento() {
        try {
            while(true) {
                int n = terminal.nextInt();
                encerramento(n);
                int m = terminal.nextInt();

                int[][] estoque = new int[n][m];

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        estoque[i][j] = terminal.nextInt();
                    }
                }

                int total = 0;
                int p = terminal.nextInt();

                for (int i = 0; i < p; i++) {
                    int tipo = terminal.nextInt() - 1;
                    int tamanho = terminal.nextInt() - 1;

                    if (estoque[tipo][tamanho] > 0) {
                        estoque[tipo][tamanho] -= 1;
                        total += 1;
                    }
                }

                System.out.println(total);
            }
        } catch(Exception ignored) {}
    }

    private static void encerramento(int leitura) {
        if(leitura == 0) {
            System.exit(0);
        }
    }
}
