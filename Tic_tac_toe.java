import java.util.Scanner;
public class Tic_tac_toe{
    static char[][] value={{'1','2','3'},{'4','5','6'},{'7','8','9'}};
    static char p1wh,p2wh;
    static int totMoves=0;
    public static int pos(int m, int[] posArr){
        int x=0;
        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                x++;
            if(x==m){
                    if(value[i][j]=='X' || value[i][j]=='O'){
                        System.out.println("\nPosition already filled");
                        return 1;
                    }
                    posArr[0]=i;
                    posArr[1]=j;
                    return 0;
                }
            }
        }
        return -1;
    }
    public static int winner(){
        for (int i=0;i<3;i++) {
            if(value[i][0]==value[i][1] && value[i][0]==value[i][2] || value[0][i]==value[1][i] && value[0][i]==value[2][i]){
                return 0;
            }
        }
        if(value[0][0]==value[1][1] && value[0][0]==value[2][2] || value[0][2]==value[1][1] && value[0][2]==value[2][0]){
            return 0;
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(value[i][j]!='X' && value[i][j]!='O'){
                    return 1;
                }
            }
        }
        return 2;
    }
    public static void display(){
        System.out.println("\t     |     |     ");
        System.out.println("\t  "+value[0][0]+"  |  "+value[0][1]+"  |  " + value[0][2]+" ");
        System.out.println("\t_____|_____|_____");
        System.out.println("\t     |     |     ");
        System.out.println("\t  "+value[1][0]+"  |  "+value[1][1]+"  |  "+value[1][2]+" ");
        System.out.println("\t_____|_____|_____");
        System.out.println("\t     |     |     ");
        System.out.println("\t  "+value[2][0]+"  |  "+value[2][1]+"  |  "+value[2][2]+" ");
        System.out.println("\t     |     |     ");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String pl1,pl2;
        int y,move,x=0,z;
        int[] posArr=new int[2];
        System.out.println("\n\nTICK-TAC-TOE-GAME\n\n");
        System.out.print("Enter the player1 name:");
        pl1=sc.next();
        System.out.print("Enter the player2 name:");
        pl2=sc.next();
        System.out.print("\nPlayer-1(X or O)?:");
        p1wh=sc.next().charAt(0);
        while((p1wh!='X' && p1wh!='O') && (p1wh!='x' && p1wh!='o')){
            System.out.println("\n!X or O only");
            System.out.print("Player-1(X or O)?:");
            p1wh=sc.next().charAt(0);
        }
        if(p1wh=='X' || p1wh=='x'){
            p1wh='X';
            p2wh='O';
        } 
        else{
            p1wh='O';
            p2wh='X';
        }
        display();
        do{
            if(totMoves%2==0){
                System.out.print("\nPlayer X enter your move:");
                move=sc.nextInt();
                x=pos(move, posArr);
                if(x==-1){
                    totMoves--;
                    System.out.println("\nInvalid position");
                } 
                else if(x==0){
                    value[posArr[0]][posArr[1]]='X';
                    display();
                }
                else if(x==1){
                    totMoves--;
                }
            } 
            else if(totMoves%2!=0){
                System.out.print("\nPlayer O enter your move:");
                move=sc.nextInt();
                x=pos(move,posArr);
                if(x==-1){
                    totMoves--;
                    System.out.println("\nInvalid position");
                }
                else if(x==0){
                    value[posArr[0]][posArr[1]]='O';
                    display();
                } 
                else if(x==1){
                    totMoves--;
                }
            }
            y=winner();
            if(y==0){
                if(totMoves!=0){
                    System.out.println("\nX is the WINNER\n");
                    if(p1wh=='X'){
                        System.out.println(pl1+" you have won");
                    } 
                    else{
                        System.out.println(pl2+" you have won");
                    }
                } 
                else{
                    System.out.println("\nO is the WINNER\n");
                    if(p1wh=='O'){
                        System.out.println(pl1 + " you have won");
                    } 
                    else{
                        System.out.println(pl2 + " you have won");
                    }
                }
                break;
            }
            System.out.println("\nContinuing the match...");
            totMoves++;
        }while(totMoves<9);
        if(y==2){
            System.out.println("\nMatch DRAW");
        }
        System.out.print("\nPlay again? [0(yes)/1(no)]:");
        z=sc.nextInt();
        if(z==0){
            main(args);
        } 
        else{
            System.out.println("\n!GAME OVER... ");
        }
    }
}