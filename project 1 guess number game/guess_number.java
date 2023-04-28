/**
 * guess_number
 */
//importing package
import java.io.*;
import java.util.*;

public class guess_number {

    public static void main(String[] args)throws IOException {

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        // genrating random number(1-100)
        Random random= new Random();
        int rand_Number = random.nextInt(100)+1;
        System.out.println(rand_Number);

        // rules and regulation
        System.out.println("---Welcome---");
        System.out.println("Rules and Regulation");
        System.out.println("1. You have to guess number betweeen 1 and 100");
        System.out.println("2. Your current score is 50 for each worng guess you are going to lose 2 point");
        System.out.println("3. You are given with only 25 chances");
        System.out.println("Now you are ready to play enjoy the game\n");

        // user input for number guess
        System.out.print("Guess number between 1 to 100= ");
        int user_Input =Integer.parseInt(br.readLine());     
        // System.out.println(user_Input);

        // checking between system genrated random number and user input
        int userAttempts=24;
        int user_Score=50;
        do {
            if(userAttempts>0){
                if(user_Input>rand_Number){
                    System.out.println("try to guess less than this");
                    user_Input =Integer.parseInt(br.readLine());
                    user_Score=user_Score-2;
                    userAttempts--;
                }
                else if(user_Input<rand_Number){
                    System.out.println("try to guess higher than this");
                    user_Input =Integer.parseInt(br.readLine());
                    user_Score=user_Score-2;
                    userAttempts--;
                }
                if(user_Input==rand_Number){
                    System.out.println("Correct guess");
                    System.out.println("Your score is " + user_Score);
                }
            }
            else{
                System.out.println("Oops...!!! Out of chances");
                break;
            }
            
        }while (rand_Number!=user_Input);
    }
}