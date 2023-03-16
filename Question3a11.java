/*4) Write a program to find area and perimeter of square using class and object?

 */
import java.util.*;
class squa{
    int r;
    void insert(int n){
        r=n;
        int area=r*r;
        int perimeter=4*r;
        System.out.println("Area of the square:"+area);
        System.out.println("Perimter of Square:"+perimeter);
    }
}
class Question3a11{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
      squa a1=new squa();
        System.out.println("enter the radius:");
        int n=sc.nextInt();
        a1.insert(n);
    }
}