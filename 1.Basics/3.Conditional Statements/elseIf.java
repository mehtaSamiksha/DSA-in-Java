import java.util.*;

//else if
public class elseIf{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        if(age >= 18){
            System.out.println("Adult");
        }
        else if(age >= 13 && age < 18){
            System.out.println("Teenager");
        }
        else{
            System.out.println("Not Adult");
        }
    }
}