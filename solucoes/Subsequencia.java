import java.util.Scanner;

public class Subsequencia {
    private static final Scanner terminal = new Scanner(System.in);

    public static void main(String[] args) {
        tratamento();
        terminal.close();
    }

    private static void tratamento() {
        try {
            while(true) {
                int na = terminal.nextInt();
                int nb = terminal.nextInt();

                encerramento(na, nb);

                int[] a = new int[na];
                int[] b = new int[nb];

                for (int i=0; i<na; i++) {
                    a[i] = terminal.nextInt();
                }

                for (int i=0; i<nb; i++) {
                    b[i] = terminal.nextInt();
                }

                String resp = "Sim";
                int i = 0, j = 0;

                while (true) {
                    if (a[i] == b[j]) {
                        i += 1;
                        j += 1;
                    }
                    else {
                        i += 1;
                    }

                    if (j == b.length)
                        break;
                    if (i == a.length) {
                        resp = "Nao";
                        break;
                    }
                }

                System.out.println(resp);
            }
        } catch(Exception ignored) {}
    }

    private static void encerramento(int na, int nb) {
        if(na == 0 && nb == 0) {
            System.exit(0);
        }
    }
}
