import java.util.*;

//total bill
//total bill + 18% GST
public class cost{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float totalBill = pencil + pen + eraser;
        float tax = totalBill * 0.18f;
        System.out.println("Total Bill: " + totalBill);
        System.out.println("Total Cost (including 18% GST): "+(totalBill+tax));
    }
}