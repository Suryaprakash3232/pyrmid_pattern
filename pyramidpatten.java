import java.util.Scanner;

public class pyramidpatten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of levels for the pyramid: ");
        int levels = scanner.nextInt();

        for (int i = 1; i <= levels; i++) {
            // Print leading spaces
            for (int j = 1; j <= levels - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }

        scanner.close();
    }
}
