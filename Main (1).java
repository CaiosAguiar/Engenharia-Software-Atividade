import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static final int[] ORIGINAL = {64, 25, 12, 22, 11, 90, 5, 42, 25, 1};

    public static void main(String[] args) {
        Ordenador ordenador = Ordenador.getInstance();

        System.out.println("Mesma instância? " + (ordenador == Ordenador.getInstance()));

        System.out.println("\n=== Teste dos três algoritmos ===");
        OrdenacaoStrategy[] estrategias = {
            new InsertionSort(), new SelectionSort(), new BubbleSort()
        };
        for (OrdenacaoStrategy e : estrategias) {
            int[] v = ORIGINAL.clone();
            ordenador.setEstrategia(e);
            System.out.println("\nAlgoritmo: " + e);
            System.out.println("Antes : " + Arrays.toString(v));
            ordenador.ordenar(v);
            System.out.println("Depois: " + Arrays.toString(v));
        }

        Scanner sc = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\n=== Escolha o algoritmo ===");
            System.out.println("1 - Insertion Sort");
            System.out.println("2 - Selection Sort");
            System.out.println("3 - Bubble Sort");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            if (!sc.hasNextInt()) {
                break;
            }
            opcao = sc.nextInt();

            OrdenacaoStrategy escolhida = null;
            switch (opcao) {
                case 1: escolhida = new InsertionSort(); break;
                case 2: escolhida = new SelectionSort(); break;
                case 3: escolhida = new BubbleSort(); break;
                case 0: System.out.println("Encerrando..."); break;
                default: System.out.println("Opção inválida!");
            }

            if (escolhida != null) {
                int[] v = ORIGINAL.clone();
                ordenador.setEstrategia(escolhida);
                System.out.println("\nAlgoritmo: " + escolhida);
                System.out.println("Antes : " + Arrays.toString(v));
                ordenador.ordenar(v);
                System.out.println("Depois: " + Arrays.toString(v));
            }
        } while (opcao != 0);

        sc.close();
    }
}
