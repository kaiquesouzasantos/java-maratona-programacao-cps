import java.util.*;

public class Dobradura {
    private static final Scanner terminal = new Scanner(System.in);

    public static void main(String[] args) {
        tratamento();
        terminal.close();
    }

    private static void tratamento() {
        try {
            int a = 1;

            while(true) {
                int valor = terminal.nextInt();
                encerramento(valor);

                if(a > 1) {
                    System.out.println("\nCaso " + a);
                } else {
                    System.out.println("Caso " + a);
                }

                Double result = (Math.pow(4, valor) + Math.pow(2, valor +1) + 1);
                System.out.println(result.intValue());
                a++;
            }
        } catch(Exception a) { }
    }

    private static void encerramento(int a) {
        if(a <= -1 || a > 15) {
            System.exit(0);
        }
    }
}