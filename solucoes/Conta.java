import java.util.*;

public class Conta {
    private static final Scanner terminal = new Scanner(System.in);

    public static void main(String[] args) {
        tratamento();
        terminal.close();
    }

    private static void tratamento() {
        try {
            while(true) {
                int valor = terminal.nextInt();
                encerramento(valor);

                int acougue = terminal.nextInt();
                int farmacia = terminal.nextInt();
                int padaria = terminal.nextInt();

                int resp = 0;

                int [] contas = {acougue, farmacia, padaria};
                Arrays.sort(contas);

                if (contas[0] + contas[1] + contas[2] <= valor)
                    resp = 3;
                else if (contas[0] + contas[1] <= valor)
                    resp = 2;
                else if (contas[0] <= valor)
                    resp = 1;
                else
                    resp = 0;

                System.out.println(resp);
            }
        } catch(Exception ignored) {}
    }

    private static void encerramento(int leitura) {
        if(leitura == 0) {
            System.exit(0);
        }
    }
}
