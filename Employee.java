import java.util.*;
public class Employee {
    String name;
    int total,ass1,ass2,ass3,empid,result;
    public Employee(String name,int empid){
        this.name=name;
        this.empid=empid;
    }
    void assessment(int ass1,int ass2,int ass3){
        this.ass1=ass1;
        this.ass2=ass2;
        this.ass3=ass3;
        this.total=ass1+ass2+ass3;
        this.result=total*100/300;
        System.out.println("Empid:"+this.empid+" "+this.name+(this.ass1>75&&this.ass2>75&&this.ass3>75?" is Promoted":" is Demoted"));
        System.out.println("Total Score Obtained in 3 Assessment:"+this.total+" and Percentage obtained:"+this.result+"%");
    }
        public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter name and id of Employee:");
        Employee obj1=new Employee(input.next(),input.nextInt());
        System.out.println("Enter 3 Assessment Score, each out of 100:");
        obj1.assessment(input.nextInt(),input.nextInt(),input.nextInt());
}
}

