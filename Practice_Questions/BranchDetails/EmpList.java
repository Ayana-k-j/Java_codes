//Program to find the employees who wrks in both Branches
//Concepts used : String[], Streams,Collectors
package org.example;
import java.text.ParseException;
import java.util.*;
import java.util.stream.Collectors;

public class EmpList{
    public static void main(String args[]) throws ParseException {

        Scanner sc=new Scanner(System.in);
        List<String> branch101Employees=new ArrayList<>();
        List<String> branch102Employees=new ArrayList<>();
        branch101Employees.add("Ashwin");
        branch101Employees.add("Ayana");
        branch101Employees.add("Aparna");
        branch101Employees.add("Amritha");
        branch102Employees.add("Neelima");
        branch102Employees.add("Sachin");
        branch102Employees.add("Midhun");
        branch102Employees.add("Ashwin");
        branch102Employees.add("Ayana");
        System.out.println("Employees in Baranch 101 :"+branch101Employees);
        System.out.println("Employees in Baranch 102 :"+branch102Employees);
        System.out.println("---------Calling the function to check employees works in both locations ----");
        System.out.println("Common employees  : "+ Arrays.toString(getEmployees(branch101Employees, branch102Employees)));

    }
    public static String[] getEmployees(List<String> branch101Employees, List<String> branch102Employees) {
        List<String> data=branch101Employees.stream().filter(branch102Employees::contains).collect(Collectors.toList());
        String[] empList1 = data.toArray(new String[0]);
        return empList1;
    }
}
