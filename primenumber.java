import java.util.Scanner;
public class primenumber {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        Boolean isprime = isprime(number);
        if (isprime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }
        input.close();
    }
    public static Boolean isprime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3;i <= Math.sqrt(num);i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}