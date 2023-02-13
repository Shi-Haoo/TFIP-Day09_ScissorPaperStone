package revisions;

import java.util.Scanner;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    
    public static void main(String[] args) {
        String[] choices = {"scissor","paper","stone"};

        //keep track of the number of times the player and computer wins
        Integer playerWinCount = 0;
        Integer computerWinCount = 0;

        //keyboard input into scanner Object
        Scanner scanner = new Scanner(System.in);

        //variable to keep track of player's selection/input/choice
        String playerSelection = "";
        

        //Instantiate scissor paper stone class
        SCP scp = new SCP();
        
        

        while(!playerSelection.equalsIgnoreCase("Q")){

            //game logic here..
            // keep track of who is the winner for each round
            String winner = "";
            
            // generate computer choice
            Integer computerSelection = 0;
            computerSelection = scp.generateComputerChoice();

            // detect input from player/user
            System.out.println("Enter (0) scissor, (1) paper, (2) stone, (Q) quit application");
            playerSelection = scanner.nextLine();

                    
            //valid player entry
            if(!playerSelection.equalsIgnoreCase("Q")){
                Integer playerOption = Integer.parseInt(playerSelection);
            

            if(playerOption >=0 && playerOption <= 2){
                winner = scp.checkWinner(playerOption, computerSelection);
            
            if(winner.equalsIgnoreCase("player wins!")){
                System.out.println("player win this round");
                playerWinCount++;
            } 
            else if(winner.equalsIgnoreCase("computer wins!")){
                System.out.println("computer win this round");
                computerWinCount++;
            }
            else{
                System.out.println("Tie this round");
            }
        }
            else {
                System.out.println("you have entered an invalid option");
                continue;
            }
        }
    }
        
        
        //show results of player and computer
        System.out.printf("Player win count: %d\n", playerWinCount);
        System.out.printf("Computer win count: %d\n", computerWinCount);
        System.out.println(playerWinCount>computerWinCount?"Player wins...": playerWinCount==computerWinCount?"Tie": "Computer wins...");

        
        //kill the scanner object opened to detect keyboard input
        scanner.close();

    }
}
