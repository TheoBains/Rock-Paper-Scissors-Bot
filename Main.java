import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("\nWelcome to rock paper scissors!");

    while(true) {
    
    System.out.println("Please enter rock, paper, scissors or I can't handle the heat (if you wish to quit):");
    
    String choice = keyboard.nextLine();
    if (choice.equals("scissors") || choice.equals("Scissors")) {
      System.out.println("\nAwh, you lose. The computer chose rock. Better luck next time :(\n\n");
    }
      
    else if (choice.equals("paper") || choice.equals("Paper")) {
      System.out.println("\nThe computer chose scissors. Don't be discouraged, next time is the one! You've got it!\n\n");
    }
      
    else if (choice.equals("rock") || choice.equals("Rock")) {
      System.out.println("\nI have some truly sad news, the computer chose paper. I know this news may be hard to take but I'm sure you can make it through. I'm here for support. You'll probably win next time.\n\n");
    }

    else if (choice.equals("I can't handle the heat")) {
    System.out.println("\nYou're a weak-minded loser who can't even win a game based off of luck. Practice more. Dweeb.");
    System.exit(0);
    }
      
    else {
      System.out.println("\nType one of the options you tryhard. Don't test me with these non-existent nonsensical words.\n\n");
    }

    }
  }
}