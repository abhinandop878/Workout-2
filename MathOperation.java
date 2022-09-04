import java.util.*;
public class MathOperation {
    int X,Y,R=1;
    public MathOperation(int a,int b){
        this.X=a;
        this.Y=b;
    }
    void add(){
        this.R=X+Y;
        display();
    }
    void multiply(){
        this.R=X*Y;
        display();
    }
    void power(){
        while(Y>0)
        {
            this.R=R*X;
            Y--;
        }
        display();
    }
    void display(){
        System.out.println(R);
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 2 numbers for Addition:");
        MathOperation obj1=new MathOperation(input.nextInt(),input.nextInt());
        obj1.add();
        System.out.println("Enter 2 Numbers for Multiply:");
        MathOperation obj2=new MathOperation(input.nextInt(),input.nextInt());
        obj2.multiply();
        System.out.println("Enter a Number and it's Power:");
        MathOperation obj3=new MathOperation(input.nextInt(),input.nextInt());
        obj3.power();
    }

}
