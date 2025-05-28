//Widening Conversion/ Implicit conversion/ Type Conversion 
//Conversion happens when:
//1. type compatible
//2. destnation type > source type
//byte -> short -> int -> float -> long -> double

import java.util.*;

public class typeConversion{
    public static void main(String args[]){
        int a = 25;
        long b = a;
        System.out.println(b);
        Scanner sc = new Scanner(System.in);
        float number = sc.nextInt();
        System.out.println(number);
    }
}