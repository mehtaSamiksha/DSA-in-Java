import java.util.*;

//tax calculator
public class tax{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter income(in lakhs): ");
        int income = sc.nextInt();
        int tax;
        if(income < 500000){
            tax = 0;
        }
        else if(income >= 500000 && income <= 1000000){
            tax = (int) (income * 0.20f);
        }
        else{
            tax = (int) (income * 0.30f);
        }
        System.out.println(tax);
    }
}