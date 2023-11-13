import java.util.*;

public class Conta {
    private static final Scanner terminal = new Scanner(System.in);
    private static int valor, saida;

    public static void main(String[] args) {
        tratamento();
        terminal.close();
    }

    private static void tratamento() {
        try {
            while(true) {
                List<Integer> contas = new ArrayList<>();
                saida = 0;

                valor = terminal.nextInt();
                encerramento(valor);

                for(int i = 0; i < 3; i++) {
                    contas.add(terminal.nextInt());
                }

                contas.sort(Integer::compareTo);

                contas.stream().forEach(
                        conta -> {
                            if(conta <= valor)
                                pagamento(conta);
                        }
                );

                System.out.println(saida);
            }
        } catch(Exception ignored) {}
    }

    private static void pagamento(int conta) {
        saida++;
        valor -= conta;
    }

    private static void encerramento(int leitura) {
        if(leitura == 0) {
            System.exit(0);
        }
    }
}
