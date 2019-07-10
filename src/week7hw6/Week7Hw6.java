package week7hw6;

import java.util.Random;
import java.util.Scanner;

public class Week7Hw6 {
    public static void main(String[] args) {
        Scanner keyIn = new Scanner(System.in);
        String[] tests = { "Cherries", "Oranges", "Plums", "Bells", "Melons", "Bars"};
        Random random = new Random();
        String outputString = "";
        String word1 = "";
        String word2 = "";
        String word3 = "";
        char playAgain = 'y';
        double totalUserMoneyInserted = 0.0;
        double totalUserMoneyWon = 0.0;
        
        while (playAgain == 'y'){
            outputString = "";
            System.out.println("How much money you want to insert?");
        int userMoney = keyIn.nextInt();
        totalUserMoneyInserted = totalUserMoneyInserted + userMoney;
        
        for (int wordCount = 1; wordCount <= 3; wordCount++){
        int randomOutput = random.nextInt(tests.length);      
        
        if(wordCount == 1){
            word1 = tests[randomOutput];
        } else if (wordCount == 2){
            word2 = tests[randomOutput];
        } else if (wordCount == 3){
            word3 = tests[randomOutput];
        }
        
        
        }
        
        outputString = outputString + ("\n[" + word1 + "]" + "[" + word2 + "]" + "[" + word3 + "]");
        
        if ( (word1 != word2) && (word1 != word3) && (word2 != word3)){
            outputString = outputString + "\n\nYou have won $0";
            totalUserMoneyWon = totalUserMoneyWon + 0;
        } else if ( ((word1 == word2) && (word1 != word3)) || ((word2 == word3) && (word2 != word1)) || ((word3 == word1) && (word3 != word2))){
            outputString = outputString + "\n\nYou have won $" + userMoney * 2;
            totalUserMoneyWon = totalUserMoneyWon + (userMoney * 2);
        } else {
            outputString = outputString + "\n\nYou have won $" + userMoney * 3;
            totalUserMoneyWon = totalUserMoneyWon + (userMoney * 3);
        }
        
        outputString = outputString + "\n\nAmount money you've inserted: $" + totalUserMoneyInserted + "\nAmount money you've won: $" + totalUserMoneyWon;
        
        System.out.println(outputString + "\n\nType YES to play again, or type NO to exit!");
        playAgain = keyIn.next().charAt(0);
        }
        if( totalUserMoneyInserted > totalUserMoneyWon){
            System.out.println("You inserted $" + totalUserMoneyInserted + " and won $" + totalUserMoneyWon +
                               ", in total you lost $" + (totalUserMoneyInserted - totalUserMoneyWon));
        } else if (totalUserMoneyWon > totalUserMoneyInserted){
            System.out.println("You inserted $" + totalUserMoneyInserted + " and won $" + totalUserMoneyWon +
                               ", in total you won $" + (totalUserMoneyWon - totalUserMoneyInserted ));
        } else{
             System.out.println("You inserted $" + totalUserMoneyInserted + " and won $" + totalUserMoneyWon +
                               ", and you lost nothing and earned nothing");
        }

        
    }
    
}
