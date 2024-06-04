//Program to caompare the selling date is after than the purchase date
//Concepts used : DateFormat,ParseException,SimpleDateFormat
package org.example;
import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class CompareDates{
    public static void main(String args[]) throws ParseException {

        Scanner sc=new Scanner(System.in);
        System.out.println("---------Reading the string-----------");
        System.out.println("Enter the purchase date :");
        String purchaseDate=sc.next();
        System.out.println("Enter the selling date :");
        String sellingDate=sc.next();
        System.out.println("---------Calling the function to check purchase date and selling date ----");
        System.out.println("Selling date after purchase date : "+ compareDates(purchaseDate,sellingDate));
    }
    public static boolean compareDates(String purchaseDate,String sellingDate) 9 ParseException {
        SimpleDateFormat dtobj=new SimpleDateFormat("dd/MM/yyyy");
        Date pDate=dtobj.parse(purchaseDate);
        Date sDate=dtobj.parse(sellingDate);
        if(sDate.after(pDate)){
            return true;
        }

        return false;
    }

}
