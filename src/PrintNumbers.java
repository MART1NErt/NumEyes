import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Give number");
        int n = num.nextInt();
        PrintNumbers prn = new PrintNumbers();
        prn.printNum(n);
    }

    public int printNum(int n) {
        if (n > 0) {
            System.out.print(n + " ");
            printNum(n - 1);
        }
        return 0;
    }
}

