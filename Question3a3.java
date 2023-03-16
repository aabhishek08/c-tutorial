/*3) Write a program to sort 10 numbers in ascending order and find the sum of product of 2nd
smallest and 3rd largest number?*/
import java.util.*;
class Question3a3{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int num[]=new int[10];
        int a=0,s=0;
        System.out.println("enter the 10 nos:");
        for (int i=0;i<10;i++){
            num[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++){
            System.out.print("num["+i+"]="+num[i]+",");
        }
        System.out.println("\nAfter sorting ");
        for(int i=0;i<10;i++){
            for(int j=i+1;j<10;j++){
                if(num[j]<num[i]){
                    a=num[i];
                    num[i]=num[j];
                    num[j]=a;
                }
            }
        }
        for(int i=0;i<10;i++){
            System.out.print("num["+i+"]="+num[i]+",");
        }
        while(num[1]!=0 && num[7]!=0){
            int r=num[1]%10;
            int r1=num[7]%10;
            s=s+r*r1;
            num[1]=num[1]/10;
            num[3]=num[7]/10;
        }
        System.out.println("Sum of product 2nd smallest and 3rd largest:"+s);
    }
}