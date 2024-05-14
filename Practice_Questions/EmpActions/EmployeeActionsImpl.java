package com.example.demo;
import org.springframework.stereotype.Component;
import java.util.*;
import java.util.stream.*;

@Component("empActionsImpl")
public class EmployeeActionsImpl implements EmployeeActions {
    @Override
    public void readDetails() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101,"Anu",30,"HR",50000,2));
        employees.add(new Employee(102,"Nimmy",32,"IT",60000,3));
        employees.add(new Employee(103,"Ravi",28,"HR",40000,5));
        employees.add(new Employee(101,"Anu",35,"HR",50000,4));
        employees.add(new Employee(104,"Neelima",24,"IT",90000,3));
        System.out.println("\nEmployees Details\n");
        System.out.println(employees);
        findDetails(employees);
    }

    public void findDetails(List<Employee> employeeArrayList){
    int total= employeeArrayList.size();
    System.out.println("Total no of employees="+total);
    //Collecting employee details group by department
    Map<String, List<Employee>> groupByDeptMap =employeeArrayList.stream().collect(Collectors.groupingBy(Employee::dept));
    System.out.println("Group by Department");
    System.out.println(groupByDeptMap);
    //Finding the sum of salaries
    double sum = employeeArrayList.stream().mapToDouble(Employee::salary).sum();
    System.out.println("Total Salary : "+sum);
    //Finding total salary by department wise
    Map<String, Double> deptSalarySum = employeeArrayList.stream().collect(Collectors.groupingBy(Employee::dept, Collectors.summingDouble(Employee::salary)));
    System.out.println("Total Salary group by department: "+deptSalarySum);
    //Sorting the employee list based on age
    List<Employee> sortedListAge= employeeArrayList.stream().sorted(Comparator.comparing(Employee::age)).toList();
    System.out.println("Sorted list based on age : ");
    System.out.println(sortedListAge);
    //Sorting the epmolyee list based on experience  
    List<Employee> sortedListExperience= employeeArrayList.stream().sorted(Comparator.comparing(Employee::toString)).toList();
    System.out.println("Sorted list based on experience : ");
    System.out.println(sortedListExperience);
    }
}
