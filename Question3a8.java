/*1) Write a program to create simple calculator for addition, subtraction, division, multiplication,
modulus, factorial, gcd, lcm, power, square root, cube root using class and object?
 */
import java.util.*;
class num {
    int c, d, s;
    char o;
    void insert(int a, char op, int b) {
        c = a;
        d = b;
        o = op;
        switch (o) {
            case '+':
                s = c + d;
                System.out.println("Addition:"+c + " + " + d + " = " + s);
                break;
            case '-':
                s = c - d;
                System.out.println("Subtraction:"+c + " - " + d + " = " + s);
                break;
            case '*':
                s = a * b;
                System.out.println("multiplication:" + s);
                break;
            case '%':
                s = c % d;
                System.out.println("Modulus :" + s);
                break;
            case'/':
                s=c/d;
                System.out.println("division:"+s);
                break;
            case'f':
                s=1;
                for(int i=1;i<c;i++){
                    s=s*i;
            }
                System.out.println("Factorial:"+d+"="+s);
                s=1;
                for(int i=1;i<d;i++){
                    s=s*i;
                }
                System.out.println("Factorial "+d+"="+s);
            case'p':
                s=c*c;
                System.out.println("power of "+c+"="+s);
                s=d*d;
                System.out.println("power of "+d+"="+d);
              break;
            case's':
                System.out.println("Square root of "+c+"="+Math.sqrt(c));

                break;
            case'c':
                System.out.println("cube root of "+c+"="+Math.cbrt(c));

                break;
            default:
                System.out.println("invalid Statement");
        }
    }}
class Question3a8{
    public static void main(String[] args){
        int b=0;
        Scanner sc=new Scanner(System.in);
        num a1=new num();
        System.out.println("Enter the nuum:");
        int a=sc.nextInt();
        System.out.println("Enetter the +,-,*,/,% ,gcd, lcm, power, square root, cube root:");
        char op=sc.next().charAt(0);
        if(op!='c' && op!='s')
        {
            System.out.println("Enter the Second num:");
            b=sc.nextInt();
        }
        a1.insert(a,op,b);
    }
}
