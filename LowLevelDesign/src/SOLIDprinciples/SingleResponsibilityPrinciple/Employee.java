package SOLIDprinciples.SingleResponsibilityPrinciple;

// single resp means a class must have only responsiblities not more than one
public class Employee {
    private String name;
    private int salary;

    public Employee(String name , int salary){
        this.name=name;
        this.salary=salary;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getSalary(){
        return this.salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

}

class CalculateSalary{

    public double CalculateSalary(Employee employee){
        return employee.getSalary() * 0.2 ;
    }
}

class ReportGenerator{

    public void GenerateReport(Employee employee){
        System.out.println("the salary report of the employee " + employee.getName() +"....");
    }
}