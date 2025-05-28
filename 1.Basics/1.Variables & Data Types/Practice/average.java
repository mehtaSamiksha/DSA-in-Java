import java.util.*;

//Average of three numbers
public class average{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int avg = (a+b+c)/3;
        System.out.println("Average: "+avg);
    }
}