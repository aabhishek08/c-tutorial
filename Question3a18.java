/*11) Write a program to swap two numbers without using 3rd variable and with using
3rd variable using class and object?
 */
import java.util.*;
class abhi8{
    int n1,n2,n3;
    void swap(int a,int b ){
        n1=a;
        n2=b;
        n1=n1+n2;
        n2=n1-n2;
        n1=n1-n2;
        System.out.println("After swapping:"+n1+" "+n2);
    }
    void swaap(int a,int b,int d){//swaap doubt
        n1=a;
        n2=b;
        n3=d;
        n3=n1;
        n1=n2;
        n2=n3;
        System.out.println("After swapping:"+n1+" "+n2);
    }
}
class Question3a18{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        abhi8 a1=new abhi8();
     int d=0;
        System.out.println("Enter the two number:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter 1 for without using 3rd varible and 2 for using 3rd varible: ");
        int c=sc.nextInt();
        switch(c){
            case 1:
                a1.swap(a,b);
                break;
            case 2:
                a1.swaap(a,b,d);
                break;
            default:
                System.out.println("Invalid input");
    }
}}