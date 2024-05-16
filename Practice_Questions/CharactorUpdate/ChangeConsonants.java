//Change the consonant characters of a string with the next alphabet
//Concepts used : Maven,String,Character,StringBuffer
package org.example;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class ChangeConsonants 
{
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("***Reading the string***");
        System.out.println( "Enter the string :" );
        String valueString=sc.nextLine();
        System.out.println("Calling the function to replace the string");
        String resultString=alterString(valueString);
        System.out.println("New string :"+resultString);
    }
    public static String alterString(String valueString) {
        int length=valueString.length();
        StringBuffer st=new StringBuffer(valueString);
        List<Character> vowels=Arrays.asList('A','a','E','e','i','I','O','o','U','u');
        for(int i=0;i<length;i++)
        {
            Character currentCharacter=st.charAt(i);
            System.out.println("currentCharacter :"+currentCharacter);
            boolean ifExists = vowels.contains(currentCharacter);
            System.out.println("Result :"+ifExists);
            if(!ifExists)
            {
                int asciiValue = (int) currentCharacter;
                if (asciiValue > 65 && asciiValue < 90 || asciiValue > 97 && asciiValue < 122) {
                    asciiValue += 1;
                } else if (asciiValue == 90) {
                    asciiValue = 65;
                } else if (asciiValue == 122) {
                    asciiValue = 97;
                }
                char newCharacter = (char) asciiValue;
                st.setCharAt(i, newCharacter);
            }
        }
        return st.toString();
    }
}
