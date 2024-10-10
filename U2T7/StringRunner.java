import java.util.Scanner;

public class StringRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = 0; 
        System.out.print("Enter a word: ");
        String prevStr = scan.nextLine(); 
        int wordCount = 1; 
        while (score < 50) {
            System.out.print("Enter another word: "); 
            String currentStr = scan.nextLine(); 
            wordCount++; 

            if (prevStr.compareTo(currentStr) < 0){
                score+=2;
                System.out.println("+2 points: current word alphabetically after; SCORE: " + score);
            } else if (prevStr.compareTo(currentStr) > 0){
                score-=5;
                System.out.println("-5 points: current word alphabetically before; SCORE: " + score);
            } else if (prevStr.equals(currentStr)){
                score-=10; 
                System.out.println("-10 points: current word alphabetically equals; SCORE: " + score);
            } 

            if (prevStr.length() == currentStr.length()){
                score+=3; 
            }

            String firstLetter = prevStr.substring (0,1); 
            int ifFound = currentStr.indexOf(firstLetter); 
            String last2 = prevStr.substring(prevStr.length() - 2 ); 
            String first2 = currentStr.substring(0,2); 
            if (last2.equals(first2))  {  
                score+=5; 
                System.out.println("+5 points: last 2 of previous match first 2 of current; SCORE: " + score);
            } 
            if (ifFound != -1) {
                score+=3; 
                System.out.println("+3 points: first letter of previous is found in current; SCORE: " + score);
            }

            prevStr = currentStr; 

    }

    System.out.println("You have a score of " + score);     //Print a message detailing the points they accrue after each word along with their current score
    System.out.println("It took you " + wordCount + " words! Try again for a lower word count!"); 

}
}
