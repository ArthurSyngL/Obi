import java.util.*;

public class distintos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] sequencia = new int[N];
        for (int i = 0; i < N; i++) {
            sequencia[i] = scanner.nextInt();
        }

        int maiorIntervalo = 0;
        Set<Integer> numerosDistintos = new HashSet<>();

        int inicio = 0;
        for (int fim = 0; fim < N; fim++) {
            while (numerosDistintos.contains(sequencia[fim])) {
                numerosDistintos.remove(sequencia[inicio]);
                inicio++;
            }
            numerosDistintos.add(sequencia[fim]);
            maiorIntervalo = Math.max(maiorIntervalo, fim - inicio + 1);
        }

        System.out.println(maiorIntervalo);
    }
}
