import java.util.*;

//check number is positive or negative
public class positiveOrNegative{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        if(num > 0){
            System.out.println("Positive");
        }else if(num == 0){
            System.out.println("Zero");
        }else{
            System.out.println("Negative");
        }
    }
}