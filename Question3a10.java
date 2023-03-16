/*3) Write a program to find area and perimeter of rectangle using class and object?
 */
import java.util.*;
class recta{
    int ln,br;
    void insert(int a,int b){
        ln=a;
        br=b;
        int area=2*(ln+br);
        int perimter=ln*br;
        System.out.println("Area of rectangle:"+area);
        System.out.println("Perimter of rectangle:"+perimter);
    }
}
class Question3a10{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        recta a1=new recta();
        System.out.println("Enter the length:");
        int a=sc.nextInt();
        System.out.println("Enter the breath:");
        int b=sc.nextInt();
        a1.insert(a,b);
    }
}
