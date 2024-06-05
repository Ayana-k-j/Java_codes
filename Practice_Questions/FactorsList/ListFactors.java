//Program to find the factors of a number
//Concepts used : List,Loop
package org.example;
import java.util.*;
public class App{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("---------Reading the Number-----------");
        System.out.println("Enter the number:");
        int number=sc.nextInt();
        System.out.println("---------Calling the function to find the factors -----");
        System.out.println("The list of factors  : "+getFactors(number));
    }
    public static List getFactors(int number){
        System.out.println("Given no :"+number);
        List<Integer> factorsList=new ArrayList<Integer>() ;
        factorsList.add(1);
        for(int i=2;i<=number;i++){
            if(number%i==0){
              factorsList.add(i);
            }
        }
        return factorsList;
    }
}
