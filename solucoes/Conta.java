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

                int[] contas = {acougue, farmacia, padaria};
                Arrays.sort(contas);
                
                int saida = 0;
                
                for(int conta : contas) {
                    if(conta <= valor) {
                        saida += 1;
                    } else {
                        break;
                    }
                }

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
