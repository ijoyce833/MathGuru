import java.util.Scanner;

public class MathGuru {
    public static void main(String[] args) {
        int calc = 0;
        String c = "yes";
        int n;
        while (c.equals("yes")) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Which calculation would you like to do? Type the corresponding number.");
            System.out.println("1: 2^n");
            System.out.println("2: n!");
            System.out.println("3: nth Fibonacci number");
            calc = sc.nextInt();

            if (calc > 3 || calc < 1) {
                System.out.println("Not a recognized command");
            }

            else {
                System.out.println("Please enter n.");
                n = sc.nextInt();
                while (n > 20) {
                    System.out.println("Please select a value below 20");
                    n = sc.nextInt();
                }
                if (calc == 1) {

                } else if (calc == 2) {
                    int result = nfact(n);
                    System.out.println(result);
                } else if (calc == 3) {
                    int result = fab(n);
                    System.out.println(result);
                }
            }

            System.out.println("Would you like to continue? (yes/no)");
            c = sc.next();
        }
    }

    public static int fab(int n) {
        int[] fibbos = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181 };

        return fibbos[n];
    }

    public static int nfact(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * (nfact(n - 1));
    }
    
    public static int nthpower(int n) {
        return (int) Math.pow(2, n);
    }
}
