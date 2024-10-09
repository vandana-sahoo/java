public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int limit = 10; // Change this limit to the desired number
        int sum = 0;

        for (int i = 1; i <= limit; i++) {
            sum += (i % 2 == 0) ? i : 0; // Check if the number is even, add to sum if true
        }

        System.out.println("Sum of even numbers up to " + limit + " is: " + sum);
    }
}
