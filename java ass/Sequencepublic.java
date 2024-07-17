public class Sequencepublic {
    // ... (other code)

    public static void main(String[] args) {
        // ... (other code)

        // Display Fibonacci sequence up to 500
        int firstTerm = 1;
        int secondTerm = 2;
        System.out.print(firstTerm + " " + secondTerm + " ");

        while (secondTerm <= 500) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(nextTerm + " ");
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
    

