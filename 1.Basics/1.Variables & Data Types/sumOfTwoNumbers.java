import java.util.*;

//sum of two numbers(taking user input)
public class sumOfTwoNumbers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a +  b;
        System.out.println(sum);
    }
}