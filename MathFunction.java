import java.util.*;
public class MathFunction {
    int multiply(int a,int b){
        System.out.println("Two Integers");
        return a*b;
    }
    float multiply(float a,float b){
        System.out.println("Two Float");
        return a*b;
    }
    float multiply(float a,int b){
        System.out.println("One Float & One Integer");
        return a*b;
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        MathFunction obj1=new MathFunction();
        System.out.println("Enter 2 integer Number for Multiply:");
        System.out.println(obj1.multiply(input.nextInt(),input.nextInt()));
        MathFunction obj2=new MathFunction();
        System.out.println("Enter 2 Float Number for Multiply:");
        System.out.println(obj2.multiply(input.nextFloat(),input.nextFloat()));
        MathFunction obj3=new MathFunction();
        System.out.println("Enter 1 Float Number and 1 Integer Number for Multiply:");
        System.out.println(obj3.multiply(input.nextFloat(),input.nextInt()));
    }
}
