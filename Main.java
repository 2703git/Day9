import java.util.Scanner;

public class Main {
    public void Pr1(int n){
        for (int i=n; i>=1; i--){
            for (int j=1; j<=n-i; j++) {
                System.out.print("  ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void Pr2(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i==1 || i==n || j==1 || j==n || i==j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public int Pr3(int a, int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public int Pr4(Scanner scanner){
        int count = 0;
        int n;
        do {
            System.out.print("Enter number: ");
            n = scanner.nextInt();
            if (n>0){
                count++;
            }
        }while (n>=0);
        return count;
    }
    public int Pr5(int a, int b) {
        return (a * b) / Pr3(a, b);
    }
    public void Pr6(int a, int b){
        int x = a;
        int y = b;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("GCD of the numbers: "+a);
        System.out.println("LCM of the numbers: "+((x*y)/a));
    }
    public double Pr7(int n){
        double sum = 0;
        for (int i=1; i<=n; i++){
            sum = sum + 1.0/i;
        }
        return sum;
    }
    public void Pr8(int a, int b){
        for (int i=a+1; i<b; i++){
            for (int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
        }
    }
    public void Pr9(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("@ ");
            }
            System.out.println();
        }
    }
    public void Pr10(int n){
        for (int i=2; i<=n; i++){
            boolean prime = true;
            for (int j=2; j<i; j++){
                if(i%j==0){
                    prime = false;
                    break;
                }
            }
            if (prime){
                System.out.print(i+" ");
            }
        }
    }
    public void Pr11(int n) {
        for (int i=1; i<=n-1; i++) {
            for (int j=1; j<=n-1; j++) {
                if (i==j || i+j==n) {
                    System.out.print(n+" ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public void Pr12(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print(n+" ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public void Pr13(int n) {
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n; j++) {
                if (i==1 || i==n || j==i || j==n-i+1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public int Pr14(Scanner scanner){
        int sum = 0;
        int n;
        do {
            System.out.print("Enter number: ");
            n = scanner.nextInt();
            if (n>0){
                sum+=n;
            }
        }while (n!=0);
        return sum;
    }
    public int Pr15(String str){
        int count = 0;
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i)=='*'){
                count++;
            }
        }
        return count;
    }
}
