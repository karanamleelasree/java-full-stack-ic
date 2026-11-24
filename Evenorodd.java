import java.util.Scanner;
public class Evenorodd{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int year = sc.nextInt();
        if(a%2==0){
            System.out.println("a is even");
        }
        else{
            System.out.println("a is odd");
        }
        if((year%4==0&&year%100!=0)||(year%400==0)){
            System.out.println("year is a Leap year");
        }
        else{
            System.out.println(" not a leap year");
        }

    }
}