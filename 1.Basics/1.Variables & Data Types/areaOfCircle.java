import java.util.*;

//area of a circle
public class areaOfCircle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        float radius = sc.nextFloat();
        float pi = 3.14f;
        float area = pi*radius*radius;
        System.out.println(area);
    }
}