/*6) Write a program to display type of triangle using sides of triangle?
 */
import java.util.*;
class trian{
    void insert(int k){
        System.out.println("it is Equillateral triangle");
    }
    void insert(int k,int l,int m,int h){
    System.out.println("It is Isosceles triangle");
    }
    void insert(int k,int l,int m){
        System.out.println("It is Scalene triangle");
    }
}
class triangles{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        trian a1=new trian();
        System.out.println("Enter the first sides:");
        int a=sc.nextInt();
        System.out.println("Enter the second sides:");
        int b=sc.nextInt();
        System.out.println("Enter the third sides:");
        int c=sc.nextInt();
        if (a == b && a == b && b == c) {
            a1.insert(a);
        } else if (a != b && a != c && c != a) {
            int h = 0;
            a1.insert(a, b, c, h);
        } else {
            System.out.println("Enter the height:");
            int h = sc.nextInt();
            if (a == b) {
                a1.insert(a,c, h);
            } else if (b == c) {
                a1.insert(a, b, h);
            } else if (a == c) {
                a1.insert(a, b, h);
            } else {
                a1.insert(a, b, c);
            }
        }
    }
}