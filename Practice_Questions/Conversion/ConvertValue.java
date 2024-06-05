//Find Binary,Hexa and Octal equivalent of a given no and return it as a String[] and use Integer wrapper class.
//Concepts used : String[],toBinaryString,toOctalString,toHexString
package org.example;
import java.util.*;
public class ConvertValue{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("---------Reading the Number-----------");
        System.out.println("Enter the number:");
        int number=sc.nextInt();
        System.out.println("---------Calling the function to convert -----");
        System.out.println("The list of Equivalents  : "+ Arrays.toString(getFormats(number)));
    }
    public static String[] getFormats(int number){
        System.out.println("Given no :"+number);
        String[] equiArray=new String[4];
        equiArray[0]=String.valueOf(number);
        equiArray[1]=String.valueOf(Integer.toBinaryString(number));
        equiArray[2]=String.valueOf(Integer.toOctalString(number));
        equiArray[3]=String.valueOf(Integer.toHexString(number));
        return equiArray;
    }
}
