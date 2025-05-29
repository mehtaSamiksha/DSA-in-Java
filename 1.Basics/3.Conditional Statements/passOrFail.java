import java.util.*;

//pass or fail
public class passOrFail{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        
        //Ternary operator
        //String result = (marks >= 33) ? "Pass" : "Fail";
        //System.out.println(result)

        //If-else
        if(marks >= 33){
            System.out.println("PASS");
        }
        else{
            System.out.println("Fail");
        }
    }
}