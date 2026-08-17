import java.util.Scanner;

public class Test15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String str = scanner.nextLine();
        Main main = new Main();
        System.out.println("Count: "+main.Pr15(str));
    }
}