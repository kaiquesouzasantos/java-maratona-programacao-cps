import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Prefixo {
    private static final Scanner terminal = new Scanner(System.in);

    public static void main(String[] args) {
        tratamento();
        terminal.close();
    }

    private static void tratamento() {
        try {
            while(true) {
                int contador = 0;
                List<String> palavras = new ArrayList<>();

                int ignored_01 = terminal.nextInt();
                encerramento(ignored_01);

                palavras.add(terminal.next());
                int ignored_02 = terminal.nextInt();
                palavras.add(terminal.next());

                palavras = palavras.stream().sorted(Comparator.comparing(String::length)).toList();

                for(int i = 0; i < palavras.get(0).length(); i++) {
                    if(palavras.get(0).split("")[i].equals(palavras.get(1).split("")[i]))
                        contador++;
                    else
                        break;
                }

                System.out.println(contador);
            }
        } catch(Exception ignored) {}
    }

    private static void encerramento(int leitura) {
        if(leitura == 0) {
            System.exit(0);
        }
    }
}
