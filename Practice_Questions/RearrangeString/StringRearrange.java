//Rearrage a string ('a' to the begining of the string)
//Concepts used : String, StringBuffer, Loop
package org.example;
import java.util.*;
public class App{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("---------Reading the String-----------");
        System.out.println("Enter the string:");
        String firstString=sc.next();
        System.out.println("---------Calling the function to chage the string -----");
        System.out.println("Given string is :"+firstString);
        System.out.println("Rearranged string is  : "+ rearrageCharacters(firstString));
    }
    public static String rearrageCharacters(String firstString){
        StringBuffer st=new StringBuffer();
        int count=0;
        for(int i=0;i<firstString.length();i++){
            if(firstString.charAt(i)=='a'){
                count++;
            }
            else {
                st.append(firstString.charAt(i));
            }
        }
        String str="";
        for(int j=0;j<count;j++){
            str=str+"a";
        }
        return str+st.toString();
    }

}
