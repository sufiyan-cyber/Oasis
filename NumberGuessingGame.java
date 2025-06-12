import java.util.Scanner; 
import java.util.Random; 
class NumberGuessingGame 
{ 
    public static void main(String[] args) 
    { int userAnswer;
  int n=5;//total number of trials

  
    int noOfTrials=0; 
    
    Random ran = new Random();
    int number = ran.nextInt(100)+1; 
    Scanner scan = new Scanner(System.in); 
    System.out.println("This is a Number guessing game");
    System.out.println("You can select a number that ranges from 1 to 100"); 
    for( int i=0;i<5;i++) 
    { 
        System.out.println("Guess a number");
    userAnswer = scan.nextInt(); 
    noOfTrials++;
    if(userAnswer==number) 
    { System.out.println("Congratualations, Your guess is right!!");
    switch(noOfTrials)
        {
            case 1:System.out.println("You have guessed the number in the first attempt, your score is 100");
            break;
            case 2:System.out.println("You have guessed the number in the second attempt, your score is 80");
            break;
             case 3:System.out.println("You have guessed the number in the third attempt, your score is 60");
            break;
             case 4:System.out.println("You have guessed the number in the fourth attempt, your score is 40");
            break;
             case 5:System.out.println("You have guessed the number in the fifth attempt, your score is 20");
             break;
        }
             System.out.println("Total number of trials: " + noOfTrials + " attempts");
                scan.close();
                return;
        
    }
    else if(userAnswer>0&&userAnswer>number) 
    { System.out.println("Too high, Pick a lower number and your score is 5");
    }
    else{ System.out.println("Too low, Pick a higher number and your score is 10"); 
        
    } 
        
    } 
    
    System.out.println("Total number of trials:"+noOfTrials+"attempts"); System.out.println("Only 5 attempts allowed, try next time"); 
    scan.close();
    } 
    
}