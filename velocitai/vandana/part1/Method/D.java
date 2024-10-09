public class NumberCheck{

  public static void main(String[] args) {
        int num = 10;
        isEven(num);
        isDivisibleBy5(num);

}
 // Method to check if number is even and print the result

    public static void isEven(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }

// Method to check if number is divisible by 5 and print the result

    public static void isDivisibleBy5(int num) {
        if (num % 5 == 0) {
            System.out.println(num + " is divisible by 5.");
        } else {
            System.out.println(num + " is not divisible by 5.");
        }
    }


}
