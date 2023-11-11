import java.util.*;

public class Cartoes {
    private static final Scanner terminal = new Scanner(System.in);
    private static final List<Integer> saida = new ArrayList<>();

    public static void main(String[] args) {
        tratamento();
        terminal.close();
    }

    private static void tratamento() {
        try {
            while(true) {
                int arthur = 0, francisco = 0;

                int num_cartas = terminal.nextInt();
                encerramento(num_cartas);

                List<Integer> cartas = new ArrayList<>();

                for (int i = 0; i < num_cartas; i++) {
                    cartas.add(terminal.nextInt());
                }

                Collections.sort(cartas);

                while(!cartas.isEmpty()) {
                    if(cartas.get(0) >= cartas.get(cartas.size() -1)) {
                        arthur += cartas.stream().findFirst().get();
                        cartas.remove(0);
                    } else {
                        arthur += cartas.get(cartas.size() -1);
                        cartas.remove(cartas.size() -1);
                    }

                    if(cartas.get(0) >= cartas.get(cartas.size() -1)) {
                        francisco += cartas.stream().findFirst().get();
                        cartas.remove(0);
                    } else {
                        francisco += cartas.get(cartas.size() -1);
                        cartas.remove(cartas.size() -1);
                    }
                }

                if(num_cartas % 2 != 0) {
                    continue;
                }

                saida.add(arthur);
            }
        } catch(Exception ignored) {}
    }

    private static void encerramento(int leitura) {
        if(leitura == 0) {
            int ultimo = saida.size() -1;
            for(int i = 0; i < saida.size(); i++) {
                if(i == ultimo) {
                    System.out.print(saida.get(i));
                } else {
                    System.out.println(saida.get(i));
                }
            }
            System.exit(0);
        }
    }
}
