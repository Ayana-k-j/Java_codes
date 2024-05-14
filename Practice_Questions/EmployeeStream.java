// Program to find details of employees with Java as their skills.
// Concepts used : Collections, Streams, Exception handling - Custom Exception,Command Line Arguments

package org.example;
import java.util.*;
import java.util.stream.*;

//Employee class
class Employee{
    int empId;
    String name,skill;
    double salary;

    public Employee(int empId,String name,double salary,String skill){
        this.empId=empId;
        this.name=name;
        this.salary=salary;
        this.skill=skill;

    }
    public Employee() {
    }
    public String getSkill() {
        return skill;
    }
    public void printDetails()
    {
        System.out.println("ID : "+empId+"\nName : "+name+"\nSalary : "+salary+"\nSkill : "+skill+"\n");
    }
}

//Handling Invalid input Exception
class InvalidInputException  extends Exception
{
    public InvalidInputException (String str)
    {
        super(str);
    }
}

//Handling Invalid list size Exception
class InvalidListSizeException  extends Exception
{
    public InvalidListSizeException (String str)
    {
        super(str);
    }
}

public class Main {
    static void validate(int empId, String name, double salary, String skill) throws InvalidInputException {
        if (empId <= 0 || name.isEmpty() || skill.isEmpty() || salary <= 0) {

            throw new InvalidInputException("Invalid inputs found !!");
        }
    }

    public static void main(String[] args)  {
            List<Employee> employees = new ArrayList<>();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of employees :");
            int numberOfEmp = sc.nextInt();
            Employee emp = null;
            for (int i = 1; i <= numberOfEmp; i++) {
                emp = new Employee();
                System.out.println("Enter the employee ID :");
                emp.empId = sc.nextInt();
                System.out.println("Enter the name :");
                emp.name = sc.next();
                System.out.println("Enter the salary :");
                emp.salary = sc.nextDouble();
                System.out.println("Enter the skill :");
                emp.skill = sc.next();
                //Checking for empty inputs
                try {
                    validate(emp.empId, emp.name, emp.salary, emp.skill);
                } catch (InvalidInputException ex) {
                    System.out.println("Caught the exception");
                    System.out.println("Exception details: " + ex);
                }
                employees.add(new Employee(emp.empId, emp.name, emp.salary, emp.skill));
            }
            
            System.out.println("\nEmployees Details\n");
            employees.forEach(Employee::printDetails);
            // Finding the iemployees with Java knowledge
            Collection<Employee> selectedEmp=employees.stream().filter(emp1 -> (emp1.getSkill()).equals("Java")).collect(Collectors
                    .toCollection(ArrayList::new));
            Optional<Collection<Employee>> optionalList=Optional.ofNullable(selectedEmp);
            System.out.println("\nDetails of employees with knowledge in Python : ");
            optionalList.filter(l->!l.isEmpty()).ifPresentOrElse(l->l.forEach(Employee::printDetails),()->{
                try {
                    throw new InvalidListSizeException(" No employees Found !!");
                } catch (InvalidListSizeException e) {
                    throw new RuntimeException(e);
                }

            });

        }

    }
