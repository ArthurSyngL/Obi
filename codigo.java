import java.util.Scanner;

public class codigo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();

        String input = scanner.nextLine();

        StringBuilder compressed = new StringBuilder();

        int count = 1;
        for (int i = 1; i <= N; i++) {
            if (i < N && input.charAt(i) == input.charAt(i - 1)) {

                count++;
            } else {

                compressed.append(count).append(" ").append(input.charAt(i - 1)).append(" ");
                count = 1;
            }
        }
        System.out.println(compressed);
    }
}
