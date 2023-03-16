/*6) Write a program to determinant and inverse of a 3X3 matrics?
 */
import java.util.*;
class Question3a6{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3];
        int s=0;
     System.out.println("Enter the matrix A:");
     for(int i=0;i<3;i++){
         for(int j=0;j<3;j++){
             a[i][j]=sc.nextInt();
         }
     }
    for(int i=0;i<3;i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print(a[i][j] + " ");
        }
        System.out.println("");
    }
     int d=a[0][0]*((a[1][1]*a[2][2])-(a[1][2]*a[2][1]))-a[0][1]*((a[1][0]*a[2][2])-(a[1][2]*a[2][0]))+a[0][2]*((a[1][0]*a[2][1])-(a[1][1]*a[2][0]));
        System.out.println("Determinant of matix A:"+d);
    }
}