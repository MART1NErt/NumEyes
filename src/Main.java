import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Number of cats");
        int n = num.nextInt();
        System.out.println(NumEyes(n));
        System.out.println("________________________");
        PrintNumbers prn = new PrintNumbers();
        prn.printNum(n);
        System.out.println("\n________________________");
        Factorial bnm = new Factorial();
         System.out.println(bnm.factorial(n));
        System.out.println(Factorial.factorial(n));
        System.out.println("\n________________________");
        System.out.println(Fibonacci.fibonacci(n));
    }

    public static int NumEyes(int n) {
        if (n == 1)
            return 2;
        else
            return NumEyes(n - 1) + 2;
    }
}