//Program to encrypt a string with ASCII value of char+9
//Concepts used: String,StringBuffer
package org.example;
import java.util.*;
public class StringEncrypt{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("---------Reading the string-----------");
        System.out.println("Enter the String:");
        String givenString=sc.next();
        System.out.println("---------Calling the function to encrypt the given string-----");
        System.out.println("The given String :"+givenString);
        System.out.println("The encrypted string  : "+ encryptString(givenString));
    }
    public static String encryptString(String givenString){
        String encryptedString="";
        char currentCharacter,newCharacter;
        StringBuffer st=new StringBuffer();
        for(int i=0;i<givenString.length();i++){
            currentCharacter=givenString.charAt(i);
            int newAscii=currentCharacter+9;
            //65-90 97-122
            if(newAscii>122) {
                newAscii = 96 + (newAscii - 122);
            }
            else if(newAscii>90&&newAscii<97){
                newAscii=64+(newAscii-90);
            }
            newCharacter=(char)newAscii;
            st.append(newCharacter);
        }
        return st.toString();
    }

}
