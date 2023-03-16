/*2) Write a program to give information about any number such as whether it is even odd, prime or
        not prime, or positive or negative, palindrome or not using class and object?
 */
import java.util.*;
class abhi{
    int k;
    int c=0,sm=0;
    void insert(int n){
        k=n;
        int num=n;

        if(k%2==0)
        {
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
            }
        for(int i=1;i<=k;i++) {
            if (k % i == 0) c++;
            }
         if(c==2){
             System.out.println("prime");
               }
         else{
             System.out.println(" not prime");
         }
         if(0<k){
             System.out.println("positive number");
         }else{
             System.out.println("negative number");
         }
         while(k!=0){
             int rm=k%10;
              sm=sm*10+rm;
             k=k/10;
         }
         if(num==sm){
             System.out.println("pallidrium");
         }else{
             System.out.println("Not pallindrium");
         }
    }
}
class Question3a9{
    public static void main(String args[]){
       abhi a1=new abhi();
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number:");
       int n=sc.nextInt();
       a1.insert(n);
    }
}