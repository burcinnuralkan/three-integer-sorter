import java.util.Scanner;
import java.util.Arrays;

public class ThreeIntegerSorter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three integers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int[] numbers = {n1, n2, n3};

        Arrays.sort(numbers);

        System.out.print("Sorted (ascending): ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.print("\nSorted (descending): ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

        sc.close();
    }
}
