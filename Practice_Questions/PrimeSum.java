package org.example;
import java.util.*;
public class PrimeSum{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("---------Reading the limit-----------");
        System.out.println("Enter the limit:");
        int limit=sc.nextInt();
        System.out.println("---------Calling the function to calculate the sum of prime nos with in the limit -----");
        System.out.println("Sum of prime nos  : "+ getPrimeSum(limit));
    }
    public static int getPrimeSum(int limit){
        if(limit<=0){
            return 0;
        }
        if(limit==1) {
            return 2;
        }
        int sum=2,count=1,k=2;
        boolean primeCheck;

        while (count != limit) {
            primeCheck = true;
            k++;
            System.out.println("number :" + k);
            System.out.println(k / 2);
            for (int i = 2; i <= k / 2; i++) {
                if ((k % i) == 0) {
                    primeCheck = false;
                    System.out.println("not prime :" + i);
                }
            }
            if (primeCheck) {
                System.out.println("prime no");
                sum = sum + k;
                System.out.println("sum: " + sum);
                count++;
                System.out.println("count :" + count);
            }
        }
        return sum;
    }

}
