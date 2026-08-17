import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main main = new Main();
        int res = main.Pr4(scanner);
        System.out.println("Total positive numbers: "+res);
    }
}