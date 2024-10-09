



public class SquareDivisibleBy5 {

    // Method to check if the square of a number is divisible by 5

    public static void checkSquareDivisibleBy5(int num) {
        int square = num * num;  // Calculate the square 
        if (square % 5 == 0) {   // square is divisible by 5
            System.out.println("The square of " + num + " is " + square + " and it is divisible by 5.");
        } else {
            System.out.println("The square of " + num + " is " + square + " and it is not divisible by 5.");
        }
    }

    // Main method

    public static void main(String[] args) {
        int numb = 10;  // Example number
        checkSquareDivisibleBy5(numb);  // Call the method
}




}











