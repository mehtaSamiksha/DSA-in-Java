import java.util.*;

//check whether input year is leap year or not
public class leapYear{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        // if(( (year % 4 == 0) && (year % 100 != 0) ) || (year % 400 == 0)){
        //     System.out.println("Leap year");
        // }else{
        //     System.out.println("Not a leap year");
        // }

        if(year % 4 == 0){
            if( year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println("Leap year");
                }
                else{
                    System.out.println("Not a leap year");
                }
            }else{
                System.out.println("Leap year");
            }
        }
        else{
            System.out.println("Not a leap year");
        }
    }
}