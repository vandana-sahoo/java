public class CharCheck{

  public static void main(String[] args) {

    char e = 'A';  
        char f = 'b'; 

         checkIfUpperCase(e); 
        checkIfVowel(e);    

}
  // Method to check if a character is an uppercase letter

    public static void checkIfUpperCase(char ch) {
        if (ch >= 'A' && ch <= 'Z') {            
            System.out.println(ch + " is an uppercase letter.");
        } else {
            System.out.println(ch + " is not an uppercase letter.");
        }
    }

   // Method to check if an uppercase letter is a vowel (A, E, I, O, U)

    public static void checkIfVowel(char ch) {
        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {  // Check if the character is a vowel
            System.out.println(ch + " is a vowel.");
        } else {
            System.out.println(ch + " is not a vowel.");
        }
    }


}
