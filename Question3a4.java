/*4) Write a program to sort 10 numbers in descending order and average of 3rd largest and 4th
smallest number in an array of 10 user defined numbers?*/
import java.util.*;
class Question3a4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num[]=new int [10];
        int a=0;
        System.out.println("Enter 10 number:");
        for (int i=0;i<10;i++){
            num[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++){
            System.out.print("num["+i+"]="+num[i]);
        }
        System.out.print("After sorting descending order");
        for(int i=0;i<10;i++){
                for(int j=i+1;j<10;j++){
                    if(num[i]>num[j]){
                        a=num[i];
                        num[i]=num[j];
                        num[j]=a;
                }
            }
        }
        for(int i=0;i<10;i++) {
            System.out.println("num[" + i + "]=" + num[i]);
        }
        float avg=(num[3]+num[2])/2;
       System.out.println("Average:="+avg);
    }
}