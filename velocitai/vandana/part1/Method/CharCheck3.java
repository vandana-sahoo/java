public class CharCheck3{

  public static void main(String[] args) {
    isEven(89);

}

 // Method to check if number is even and print the result

    public static int isEven(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
return num;
    }


}
