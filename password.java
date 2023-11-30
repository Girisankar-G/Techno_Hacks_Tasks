import java.util.Random;
import java.util.Scanner;
import java.lang.*;
class fill{
    void character(char[] char_arr) {
        int y=0;
        for(int i=33;i<48;i++){
            char_arr[y]=(char)i;
            y++;
        }
        for(int i=58;i<65;i++){
            char_arr[y]=(char)i;
            y++;
        }
        for (int i=91;i<97;i++){
            char_arr[y]=(char)i;
            y++;
        }
    }
    void alphsabets(char[] alph_arr){
        int y=0;
        for(int i=65;i<91;i++) {
            alph_arr[y]=(char)i;
            y++;
        }
        for(int i=97;i<123;i++){
            alph_arr[y]=(char)i;
            y++;
        }
    }
}

class Repitation {
    static int[] rep = new int[100];
    static void check(char[] passw, int c, char[] integer, char[] char_arr, char[] alph_arr, Random rand) {
        int n=passw.length;
        boolean isRepeated;
        do{
            isRepeated = false;
            char[] pass_check = new char[n];
            for (int i = 0; i < n; i++) {
                boolean foundRepeat = false;
                for (int j = 0; j < i; j++) {
                    if (passw[i] == pass_check[j]) {
                        rep[i] = j;
                        foundRepeat = true;
                        isRepeated = true;
                        break;
                    }
                }

                if (!foundRepeat) {
                    pass_check[i] = passw[i];
                }
            }

            if (isRepeated) {
                for (int i = 0; i < n; i++) {
                    if (c == 1) {
                        passw[rep[i]] = alph_arr[rand.nextInt(alph_arr.length)];
                    } else if (c == 3) {
                        int a = rand.nextInt(1, 3);
                        switch (a) {
                            case 1:
                                passw[rep[i]] = alph_arr[rand.nextInt(alph_arr.length)];
                                break;
                            case 2:
                                passw[rep[i]] = integer[rand.nextInt(integer.length)];
                                break;
                        }
                    } else {
                        int b = rand.nextInt(1, 4);
                        switch (b) {
                            case 1:
                                passw[rep[i]] = alph_arr[rand.nextInt(alph_arr.length)];
                                break;
                            case 2:
                                passw[rep[i]] = integer[rand.nextInt(integer.length)];
                                break;
                            case 3:
                                passw[rep[i]] = char_arr[rand.nextInt(char_arr.length)];
                                break;
                        }
                    }
                }
            }
        } while (isRepeated);
    }
}

class create{
    void creation(char[] passw,char[] alph_arr,int n,Random rand){
        int x,y=0;
        for(int i=0;i<n;i++){
            x=rand.nextInt(alph_arr.length);
            passw[y]=alph_arr[x];y++;
        }
    }    
    void creation1(char[] passw,char[] alph_arr,char[] integer,int n,Random rand){
        int x,y=0,a;
        for(int i=0;i<n;i++){
            a=rand.nextInt(1,3);
            switch(a) {
                case 1:
                    x=rand.nextInt(alph_arr.length);
                    passw[y]=alph_arr[x];y++;
                    break;
                case 2:
                    x=rand.nextInt(integer.length);
                    passw[y]=integer[x];y++;
            }
        }
    } 
    void creation2(char[] passw,char[] alph_arr,char[] integer,char[] char_arr,int n,Random rand){
        int x,y=0,a;
        for(int i=0;i<n;i++){
            a=rand.nextInt(1,3);
            switch(a){
                case 1:
                    x=rand.nextInt(char_arr.length);
                    passw[y]=alph_arr[x];y++;
                    break;
                case 2:
                    x=rand.nextInt(integer.length);
                    passw[y]=(char)integer[x];y++;
                    break;
                case 3:
                    x=rand.nextInt(alph_arr.length);
                    passw[y]=char_arr[x];y++;
                    break;
            }
        }
    } 
}
public class password {
    public static void main(String[] args) {
        Random rand=new Random();
        Scanner sc=new Scanner(System.in);
        fill obj=new fill();
        create obj1=new create();
        Repitation obj2=new Repitation();
        char[] char_arr=new char[50];
        char[] alph_arr=new char[53];
        char[] integer={'1','2','3','4','5','6','7','8','9','0'};
        int n,c;
        obj.character(char_arr);
        obj.alphsabets(alph_arr);
        System.out.println("Enter the number of characters in the password:");
        n=sc.nextInt();
        char[] passw=new char[n];
        do {
            System.out.println("\n1.Easy\n2.Medium\n3.Hard");
            System.out.println("\nEnter the difficulty choice:");
            c=sc.nextInt();
            if(c<0 || c>3){
                System.out.println("Invalid choice");
            }
        } while(c<0 || c>3);
        switch(c) {
            case 1:
                obj1.creation(passw,alph_arr,n,rand);
                break;
            case 2:
                obj1.creation1(passw,alph_arr,integer,n,rand);
                break;
            case 3:
                obj1.creation2(passw,alph_arr,integer,char_arr,n,rand);
                break;
        }
        obj2.check(passw,c,integer,char_arr,alph_arr,rand);
        System.out.println("Generated password is,");
        for(int i=0;i<n;i++){
            System.out.print(passw[i]);
        }
    }
}
