/*Create a program that asks the user to guess a
number between 1 and 100. The program
should then give hints to the user until they
guess the correct number.*/
import java.util.Random;
import java.util.Scanner;
public class rand{
    public static void main(String[] args) {
        Random rand=new Random(); 
        int x=rand.nextInt(1,101),i=0,n;  
        Scanner sc=new Scanner(System.in);
        do{
            System.out.print("\nEnter the guess:");
            n=sc.nextInt();
            if(x>n){
                System.out.println("Guess number is small");
            }
            if(x<n){
                System.out.println("Guess number is large");
            }
            i++;
        }while(n!=x);
        System.out.println("!Correct guess.");
        System.out.println("Guessed the number after "+i+" guesses");
    }
}