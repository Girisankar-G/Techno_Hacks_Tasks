/*Create a basic calculator that can perform
basic arithmetic operations such as addition,
subtraction, multiplication, and division.*/

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        int c,a,b;
        Scanner sc=new Scanner(System.in);        
        System.out.println("1.Addition\n2.Subraction\n3.Multiplication\n4.Division");
        System.out.print("\nEnter your choice:");
        c=sc.nextInt();
        switch(c){
            case 1:
                System.out.print("\nEnter number 1:");
                a=sc.nextInt();
                System.out.print("\nEnter number 2:");
                b=sc.nextInt();
                System.out.println(a+"+"+b+"="+(a+b));
                break;
            case 2:
                System.out.print("\nEnter number 1:");
                a=sc.nextInt();
                System.out.print("\nEnter number 2:");
                b=sc.nextInt();
                System.out.println(a+"-"+b+"="+(a-b));
                break;
            case 3:
                System.out.print("\nEnter number 1:");
                a=sc.nextInt();
                System.out.print("\nEnter number 2:");
                b=sc.nextInt();
                System.out.println(a+"*"+b+"="+(a*b));
                break;
            case 4:
                System.out.print("\nEnter numerator:");
                a=sc.nextInt();
                System.out.print("\nEnter denominator:");
                b=sc.nextInt();
                System.out.println(a+"/"+b+"="+(a/b));
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}