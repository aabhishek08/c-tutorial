/*5) Write a program to find area and perimeter of triangle having 3 sides using class and object?
 */
import java.util.*;
class tria{
    int r1,r2,r3,h1;
      void insert(int k){
          System.out.println("it is Equillateral triangle");
        double area=Math.sqrt(3)/4*r1;
        double perimeter=3*r1;
        System.out.println("Area:"+area);
        System.out.println("Perimter:"+perimeter);
    }
    void insert(int k,int  l,int h){
        r1=k;
        r2=l;
        h1=h;
        System.out.println("It is Isosceles triangle");
        double area=(h1*r2)/2;
        double perimeter=2*r1+r2;
        System.out.println("Area:"+area);
        System.out.println("Perimeter:"+perimeter);
    }
    void insert(int k,int l,int m,int p){
        r1=k;
        r2=l;
        r3=m;
        System.out.println("It is Scalene triangle");
        int perimeter=r1+r2+r3;
        int s=perimeter/2;
        int a=s*(s-r1)*(s-r2)*(s-r3);
        double area=Math.sqrt(a);
        System.out.println("Area of Triangle:"+area);
        System.out.println("Perimeter:"+perimeter);
    }
}
        class triangle {
            public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                tria a1 = new tria();
                System.out.println("Enter the first side:");
                int n1 = sc.nextInt();
                System.out.println("Enter the second side:");
                int n2 = sc.nextInt();
                System.out.println("Enter the third side:");
                int n3 = sc.nextInt();

                if (n1 == n2 && n1 == n3 && n2 == n3) {
                    a1.insert(n1);
                } else if (n1 != n2 && n2 != n3 && n3 != n1) {
                    int h = 0;
                    a1.insert(n1, n2, n3, h);
                } else {
                    System.out.println("Enter the height:");
                    int h = sc.nextInt();
                    if (n1 == n2) {
                        a1.insert(n1, n3, h);
                    } else if (n2 == n3) {
                        a1.insert(n1, n2, h);
                    } else if(n1 == n3)
                     {
                        a1.insert(n1, n2, h);
                    }
                }
            }
        }