import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scanner.nextInt();
        Main main = new Main();
        System.out.print("Prime numbers: ");
        main.Pr10(n);
    }
}
