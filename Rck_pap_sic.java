import java.util.Random;
import java.util.Scanner;
public class Rck_pap_sic {
    public static void main(String[] args) {
        Random rand=new Random();
        Scanner sc=new Scanner(System.in);
        int c,x,comp=0,d=0,per=0;
        do{
            x=rand.nextInt(1,4);
            System.out.println("\n1.Scissor\n2.Rock\n3.Paper\n4.Endgame");
            System.out.print("\nEnter your choice:");
            c=sc.nextInt();
            if(c==1){
                if(x==3){
                    System.out.print("\nComputer-Rock");
                    System.out.print("\nYou win");
                    per+=1;
                }
                else if(x==2){
                    System.out.print("\nComputer-Rock");
                    System.out.print("\nComputer win");
                    comp+=1;
                }
                else{
                    System.out.print("\nComputer-Scissor");
                    System.out.print("\nDraw");
                    d+=1;
                }
            }
            else if(c==2){
                if(x==1){
                    System.out.print("\nComputer-Scissor");
                    System.out.print("\nYou win");
                    per+=1;
                }
                else if(x==3){
                    System.out.print("\nComputer-Paper");
                    System.out.print("\nComputer win");
                    comp+=1;
                }
                else{
                    System.out.print("\nComputer-Rock");
                    System.out.print("\nDraw");
                    d+=1;
                }
            }
            else if(c==3){
                if(x==2){
                    System.out.print("Computer-Rock");
                    System.out.print("\nYou win");
                    per+=1;
                }
                else if(x==1){
                    System.out.print("Computer-Scissor");
                    System.out.print("\nComputer win");
                    comp+=1;
                }
                else{
                    System.out.print("Computer-Paper");
                    System.out.print("\nDraw");
                    d+=1;
                }
            }
        else if(c!=4){
            System.out.print("\nInvalid move");
        }
        }while(c!=4);
        System.out.print("\nComputer:"+comp+"\nPerson:"+per+"\nDraws:"+d);
    }    
}