public class PrintNumbers {
    public static void main(String[] args) {
        int limit = 20; // Change the limit as per your requirement

        System.out.println("Numbers greater than 10 or less than 2:");
        for (int i = 0; i <= limit; i++) {
            // Using conditional (ternary) operator
            System.out.println((i > 10 || i < 2) ? i : "");
        }
    }
}
