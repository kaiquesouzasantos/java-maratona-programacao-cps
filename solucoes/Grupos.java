import java.util.Scanner;

public class Grupos {
    static int[][] juntos = new int[1000010][2];
    static int[][] separados = new int[1000010][2];
    static int[] grupo = new int[1000010];
    private static final Scanner terminal = new Scanner(System.in);

    public static void main(String[] args) {
        tratamento();
        terminal.close();
    }

    private static void tratamento() {
        try {
            while(true) {
                int e = terminal.nextInt();
                encerramento(e);

                int m = terminal.nextInt();
                int d = terminal.nextInt();

                for(int i = 1; i <= m; i++) {
                    juntos[i][0] = terminal.nextInt();
                    juntos[i][1] = terminal.nextInt();
                }

                for(int i = 1; i <= d; i++) {
                    separados[i][0] = terminal.nextInt();
                    separados[i][1] = terminal.nextInt();
                }

                for(int i = 1; i <= e/3; i++) {
                    int a = terminal.nextInt();
                    int b = terminal.nextInt();
                    int c = terminal.nextInt();

                    grupo[a] = grupo[b] = grupo[c] = i;
                }

                int saida = 0;

                for(int i = 1; i <= m; i++)
                    if(grupo[juntos[i][0]] != grupo[juntos[i][1]])
                        saida++;

                for(int i = 1; i <= d; i++)
                    if(grupo[separados[i][0]] == grupo[separados[i][1]])
                        saida++;

                System.out.println(saida);
            }
        } catch(Exception ignored) {}
    }

    private static void encerramento(int leitura) {
        if(leitura == 0) {
            System.exit(0);
        }
    }
}
