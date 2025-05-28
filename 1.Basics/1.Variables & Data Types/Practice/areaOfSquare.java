import java.util.*;

//Area of square
public class areaOfSquare{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of the square: ");
        int side = sc.nextInt();
        int area = side * side;
        System.out.println("Area of square is "+area);
    }
}