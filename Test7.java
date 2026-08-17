import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scanner.nextInt();
        Main main = new Main();
        System.out.printf("Sum: %.3f",main.Pr7(n));
    }
}