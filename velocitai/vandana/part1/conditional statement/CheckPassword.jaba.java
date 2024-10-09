
public class CheckPassword {
    public static void main(String[] args) {
        String password = "qspider";  // The password you want to check

        // Using the conditional operator to check if the password matches
        String message = (password.equals("qspider")) ? "Password is correct." : "Password is incorrect.";
        
        System.out.println(message);
    }
}
