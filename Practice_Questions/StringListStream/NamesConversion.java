/*Problem : update the elements with odd no of characters into uppercase and create a new list
Given list : [Ashwin, Stalin, Bijoy, Ajoob]
Expected result :[Ashwin, Stalin, BIJOY, AJOOB]*/
// Concepts used : Maven, java 17,Streams,Collections,map,Strings
package org.example;
import java.util.*;
import java.util.stream.Collectors;

public class NamesConversion{
    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);
        List<String> nameList=Arrays.asList("Ashwin","Stalin","Bijoy","Ajoob");
        System.out.println("The given List"+nameList);
        System.out.println("Calling function to create new list ");
        System.out.println("New List :"+findNewList(nameList));
    }
    
    public static List<String> findNewList(List<String> nameList){
        List<String> newList=nameList.stream().map(name->(name.length()%2!=0)?(name.toUpperCase()):name).collect(Collectors.toList());
        return newList;
    }

}
