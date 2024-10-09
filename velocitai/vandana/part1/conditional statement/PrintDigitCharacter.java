public class PrintDigitCharacter {
    public static void main(String[] args) {
        char ch = '5'; // Change this to the character you want to check

        // Using the conditional operator to check if the character is a digit
        String message = (Character.isDigit(ch)) ? "The character is a digit: " + ch : "The character is not a digit.";
        
        System.out.println(message);
    }
}

