package revisions;

import java.util.Random;

public class SCP {
    public Integer generateComputerChoice(){
        Random random = new Random();
        return random.nextInt(3);

    }

    public String checkWinner(Integer playerChoice, Integer computerChoice){

        String winner = "";
        
        if(playerChoice == computerChoice){

            winner = "its a tie";
        }

        else if(playerChoice == 0 && computerChoice == 1){
            winner = "player wins!";
        }
        else if(playerChoice == 0 && computerChoice == 2){
            winner = "computer wins!";
        }

        else if(playerChoice == 0 && computerChoice == 2){
            winner = "computer wins!";
        }
        else if(playerChoice == 1 && computerChoice ==0){
            winner = "computer wins!";
        }

        else if(playerChoice == 1 && computerChoice == 2){
            winner = "player wins!";
        }
        else if(playerChoice == 2 && computerChoice == 0){
            winner = "player wins!";
        }
        else if(playerChoice == 2 && computerChoice == 1){
            winner = "computer wins!";
        }

        //Alt sol:
        // String result = "";
        // if (playerChoice == computerChoice) {
        //     result = "Tie";
        // } else {
        //     switch (playerChoice) {
        //         case 0: // scissor
        //             if (computerChoice == 1) {
        //                 result = "Human";
        //             } else {
        //                 result = "Computer";
        //             }
        //             break;
        //         case 1: // paper
        //             if (computerChoice == 2) {
        //                 result = "Human";
        //             } else {
        //                 result = "Computer";
        //             }
        //             break;
        //         case 2: // stone
        //             if (computerChoice == 0) {
        //                 result = "Human";
        //             } else {
        //                 result = "Computer";
        //             }
        //             break;
        //         default:
        //             break;
        //     }
        // }

        return winner;
    }
}
