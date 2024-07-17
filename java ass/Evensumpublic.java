public class Evensumpublic {
    // ... (other code)

    public static void main(String[] args) {
        // ... (other code)

        // Sum of even Fibonacci numbers up to 4 million
        int firstTerm = 1;
        int secondTerm = 2;
        int sum = secondTerm; // Initialize sum with the second term

        while (secondTerm <= 4000000) {
            int nextTerm = firstTerm + secondTerm;
            if (nextTerm % 2 == 0) {
                sum += nextTerm;
            }
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        System.out.println("Sum of even Fibonacci numbers: " + sum);
    }
}
