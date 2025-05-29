import java.util.*;

//largest of two numbers
public class largestOfTwo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>=b){
            System.out.print(a+" is largest number");
        }
        else{
            System.out.print(b+" is largest number");
        }
    }
}