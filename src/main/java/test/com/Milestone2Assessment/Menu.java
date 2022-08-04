package test.com.Milestone2Assessment;

import java.util.*;

public class Menu {
    public static void main(String[] args) {
    	//adding values to ArrayList
        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(new Employee(1,"Aditi",10000,20));
        employeeList.add(new Employee(2,"Bibek",20000,21));
        employeeList.add(new Employee(3,"Chandan",30000,22));
        employeeList.add(new Employee(4,"Durga",40000,23));
        employeeList.add(new Employee(5,"Elvis",50000,29));
        employeeList.add(new Employee(6,"Firoz",60000,26));
        employeeList.add(new Employee(7,"Ganesh",70000,25));
        employeeList.add(new Employee(8,"Hari",80000,28));
        employeeList.add(new Employee(9,"Ishwor",90000,35));
        employeeList.add(new Employee(10,"Jeevan",100000,54));
        EmployeeList employeeList1 = new EmployeeList(employeeList);
        System.out.println("Please Enter the value of key betwenn 1 - 3");
        System.out.println("1.To view All Employees");
        System.out.println("2.To view Employees in Descending order based on their Names");
        System.out.println("3.To Update Salary");
        System.out.println("If you enter Key Other than 1. 2. or 3. then Invalid choice will be Displayed");
        System.out.println("Enter key");
        Scanner s=new Scanner(System.in);
        int key=s.nextInt();
         //switch case
        switch (key){
            case 1: //Press 1 will display all the record
                employeeList1.display();
                break;
            case 2: //Press 2 will display all the record in descending order
                employeeList1.sort();
                employeeList1.display();
                break;
            case 3: //Press 3 will update the employee if Id is present in record else it will pass the message inavlid id
                System.out.println("Enter employee id");
                int id = s.nextInt();
                System.out.println("Enter employee updated salary");
                int salary = s.nextInt();
                if(employeeList1.update(id,salary)){
                    employeeList1.display();
                }
                else{
                    System.out.println("Invalid id provided");
                    
                }
                break;
            case 4:
                break;
        }
    }
}