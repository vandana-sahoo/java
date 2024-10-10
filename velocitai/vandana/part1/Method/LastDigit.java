public class LastDigit{

    public static void printLastDigit(int number) {
        int lastdigit = number % 10; 
        System.out.println("The last digit of " + number + " is: " + lastdigit);
    }

    public static void main(String[] args) {
        int number = 12345; 
        printLastDigit(number); 
    }
}
