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

                int ignored_01 = terminal.nextInt();
                encerramento(ignored_01);

                String palavra_01 = terminal.next();
                int ignored_02 = terminal.nextInt();
                String palavra_02 = terminal.next();

                String um, dois;

                if(ignored_01 < ignored_02) {
                    um = palavra_01;
                    dois = palavra_02;
                } else {
                    um = palavra_02;
                    dois = palavra_01;
                }

                for(int i = 0; i < um.length(); i++) {
                    if(um.split("")[i].equals(dois.split("")[i]))
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
