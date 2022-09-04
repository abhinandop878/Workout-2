import java.util.*;
public class Employeee {
    static int empNo=0,totalSalary=0;
     int salary;
     public Employeee(int salary){
        this.salary=salary;
        empNo++;
        totalSalary=totalSalary+salary;
     }
     void display(){
        System.out.println("Total employees:"+empNo+"\nTotal salaries of all employees:"+totalSalary);
     }
     public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a Salary:");
        Employeee obj1=new Employeee(input.nextInt());
        obj1.display();
        System.out.println("Enter a Salary:");
        Employeee obj2=new Employeee(input.nextInt());
        obj2.display();
        System.out.println("Enter a Salary:");
        Employeee obj3=new Employeee(input.nextInt());
        obj3.display();
     }
}
