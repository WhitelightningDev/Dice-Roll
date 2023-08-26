import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            Random random = new Random();



              int userTotalWins = 0;
               int programTotalWins = 0;

            for(int round =1; round <=3; round ++){
                System.out.println("Round : " + round);
                System.out.println("Press enter to roll your dice :");
                scanner.nextLine();

                int userRoll = random.nextInt(6) + 1;
                int programRoll = random.nextInt(6) + 1;

                System.out.println("User rolled " + userRoll);
                System.out.println("program rolled " + programRoll);


                if(userRoll > programRoll){
                    System.out.println("User wins this round\n");
                    userTotalWins++;
                }else if(userRoll < programRoll){
                    System.out.println("Program wins this round\n");
                    programTotalWins++;
                }else {
                    System.out.println("Its a draw\n");
                }

                if (userTotalWins < programTotalWins){
                    System.out.println("Program wins the total round\n");
                } else if (programTotalWins < userTotalWins) {
                    System.out.println("User wins the total round\n");
                }
            }

        scanner.close();
        }

    }
