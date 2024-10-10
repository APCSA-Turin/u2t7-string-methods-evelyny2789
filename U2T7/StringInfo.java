import java.util.Scanner; 
public class StringInfo {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in); 
        System.out.println("Enter first string: ");
        String word1 = scan.nextLine();
        int length1 = word1.length(); 

        System.out.println("Enter second string: ");
        String word2 = scan.nextLine(); 
        int length2 = word2.length(); 

        if (length1 > length2) {
            System.out.println(word1 + " is longer");
        } else if (length2 > length1) {
            System.out.println(word2 + " is longer");
        } else if (length1 == length2) {
            System.out.println("Both strings are the same length"); 
        }

        int half1 = length1/2; 
        String firstHalf = word1.substring(0, half1); 
        String secondHalf  = word1.substring(half1); 
        System.out.println("First half: " + firstHalf);
        System.out.println("Second half: " + secondHalf);

        int half2 = length2/2; 
        String firstHalf2 = word2.substring(0, half2);
        String secondHalf2 = word2.substring(half2); 
        System.out.println("First half: " + firstHalf2);
        System.out.println("Second half: " + secondHalf2);

        int str1 = word1.indexOf(word2);
        if (str1 == -1){
            System.out.println(word2 + " is not found in " + word1);
        } else  {
            System.out.println(word2 + " is found in " + word1 + " at index " + str1);
        }
        
    }
}
