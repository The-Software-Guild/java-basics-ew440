package main;

import java.util.*;

import static java.lang.System.exit;

public class RockPaperScissors {

    public static int getRounds(){
        int rounds;
        Scanner myScanner = new Scanner(System.in);
        try {
            String strRounds = myScanner.nextLine();
            rounds = Integer.parseInt(strRounds);
            if (rounds > 10 || rounds <= 0){
                System.out.println("This program has been ordered to quit due to you daring to enter a number not between 1 and 10");
                exit(0);
            }
            return rounds;
        } catch (Exception e){
            System.out.println("Please enter an int");
            return getRounds();
        }
    }

    public static String intro() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Welcome to the game of Rock Paper Scissors.");
        System.out.println("Please enter your name");
        return myScanner.nextLine();
    }

    public static String getChoiceName(Character c){

        String Name;

        HashMap<String, String> conversion = new HashMap<>();

        conversion.put("r", "Rock");
        conversion.put("p", "Paper");
        conversion.put("s", "Scissors");

        if (c == 'r'){
            Name = conversion.get("r");
        } else if(c == 'p'){
            Name = conversion.get("p");
        } else {
            Name = conversion.get("s");
        }
        return Name;
    }

    public static void game(String p1Name){

        if (p1Name.equals("")){
            p1Name = intro();
        }

        Scanner myScanner = new Scanner(System.in);

        int rounds;

        System.out.println("Thank you " + p1Name + "." + "How many rounds do you want to play? (min 1, max 10)");

        rounds = getRounds();
        System.out.println("Starting a game lasting " + rounds + " rounds!");

        int p1Wins = 0;
        int p2Wins = 0;
        int ties = 0;

        for (int i=0; i < rounds; i++){

            System.out.println("Starting a new round!");

            Character p1Choice;

            ArrayList<Character> acceptableChoices = new ArrayList<>();
            acceptableChoices.add('r');
            acceptableChoices.add('p');
            acceptableChoices.add('s');

            do
            {
                System.out.println(p1Name + " please enter (R)ock, (P)aper or (S)cissors.");
                String Choice = myScanner.nextLine();
                Choice = Choice.strip().toLowerCase();
                p1Choice = Choice.charAt(0);

            } while (!acceptableChoices.contains(p1Choice));

            Random randNo = new Random();
            Character p2Choice;

            int p2Number = randNo.nextInt(3) + 1;

            if(p2Number == 1){
                p2Choice = 'r';
            } else if (p2Number == 2){
                p2Choice = 'p';
            } else {
                p2Choice = 's';
            }

            String p1ChoiceName = getChoiceName(p1Choice);
            String p2ChoiceName = getChoiceName(p2Choice);

            System.out.println("You chose " + p1ChoiceName);
            System.out.println("Computer chose " + p2ChoiceName);

            if ((p1Choice.equals('r') && p2Choice.equals('s'))
                    || (p1Choice.equals('p') && p2Choice.equals('r'))
                    || (p1Choice.equals('s') && p2Choice.equals('p'))){
                System.out.println("You win!");
                p1Wins++;
            } else if ((p1Choice.equals('s') && p2Choice.equals('r'))
                    || (p1Choice.equals('r') && p2Choice.equals('p'))
                    || (p1Choice.equals('p') && p2Choice.equals('s'))){
                System.out.println("You lose!");
                p2Wins++;
            } else{
                System.out.println("It's a tie!");
                ties++;
            }

            System.out.println("Scores are:");
            System.out.println(p1Name + " wins:" + p1Wins );
            System.out.println("Computer wins:" + p2Wins );
            System.out.println("Ties:" + ties );
        }

        System.out.println("The final result is....");

        if (p1Wins > p2Wins){
            System.out.println(p1Name + " Wins! Good job!");
        } else if (p2Wins > p1Wins){
            System.out.println("AI supremacy rules again. You lose.");
        } else {
            System.out.println("It's a tie!");
        }

        System.out.println("Thanks for playing!");
        System.out.println("Would you like to play again? (y/n)");
        System.out.println();

        ArrayList<Character> acceptableChoices = new ArrayList<>();
        acceptableChoices.add('y');
        acceptableChoices.add('n');

        Character gameChoice;
        int counter = 0;

        do
        {
            if (counter != 0){
                System.out.println("please enter 'y' or 'n' ");
            }
            counter ++;
            String Choice = myScanner.nextLine();
            Choice = Choice.strip().toLowerCase();
            gameChoice = Choice.charAt(0);
        } while (!acceptableChoices.contains(gameChoice));

        if (gameChoice.equals('y')){
            game(p1Name);
        } else {
            System.out.println("Thanks for playing " + p1Name + "!");
            exit(0);
        }

    }

    public static void main(String[] args) {
        game("");
    }


}
