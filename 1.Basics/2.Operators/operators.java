//Operators: Symbols that tell compiler to perform some operation
//sum= a + b
//a, b -> operands
//+ -> operator

//Types of Operators
//Arithmetic operators -> Binary(2 operands): +, -, *, /, %        Unary(1 operand):post(a++, a--), pre(--a,++a)
//Relational operators -> >, <, >=, <=, ==, !=
//Assignment operators -> =, +=, -=, *=, /=, %=
//Logical operators -> &&, ||, !

import java.util.*;

public class operators{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        //Arithmetic operators
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println(a++); //a = a + 1
        System.out.println(++a);
        System.out.println(a--); //a = a - 1
        System.out.println(--a);


        //Realtional Operators
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a < b);
        System.out.println(a <= b);

        //Assignment operators
        int c = 10;
        System.out.println(c);
        c += 2;
        System.out.println(c);
        c -= 2;
        System.out.println(c);
        c *= 2;
        System.out.println(c);
        c /= 2;
        System.out.println(c);
        c %= 2;
        System.out.println(c);

        //Logical operators
        System.out.println((a > b) && (c > b));
        System.out.println((a > b) || (c > b));
        System.out.println(!(a > b));
    }
}
