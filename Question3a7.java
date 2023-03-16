/*7) Write a program to find transpose of a 3X4 matrics?
  error*/
import java.util.*;
class Question3a7{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][4];
        int b[][] = new int[4][3];
        System.out.print("Enter the 3*4 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("context of 3*4 matix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }}
    /*    for (int i = 0; i <3; i++) {
            for (int j = 0; j <4; j++) {
                b[i][j] = a[i][j];
            }
        }

        System.out.println("Transpose of 3*4 matix:");
        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
*/
