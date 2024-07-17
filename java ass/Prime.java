public class Prime {
    // ... (other code)

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // ... (other code)

        // Display prime numbers between 1 to 500
        for (int i = 1; i <= 500; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}