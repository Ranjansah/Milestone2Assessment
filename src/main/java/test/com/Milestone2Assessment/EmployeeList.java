package test.com.Milestone2Assessment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class EmployeeList {
	private List<Employee> employeeList;                

    public EmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
    
    public void display(){
        int i=1;
        for(Employee employee:this.employeeList){
            System.out.println("Employee"+i+" ::: id: "+employee.getId()+" name: "+employee.getName()+" salary: "+employee.getSalary()+" age: "+employee.getAge());
            i++;
        }
    }
    
    public void sort(){
        Collections.sort(this.employeeList, Collections.reverseOrder(new Comparator<Employee>() { 
            @Override
            public int compare(Employee employee1, Employee employee2) {
                return employee1.getName().compareTo(employee2.getName());
            }
        }));
    }
  
    public boolean update(int id, int salary) {
        boolean flag=false;
        for(Employee employee:this.employeeList){
            if(employee.getId()==id){
                flag=true;
                employee.setSalary(salary);
            }
        }
        return flag;
    }

}
