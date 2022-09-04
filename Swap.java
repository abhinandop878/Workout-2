import java.util.*;
public class Swap {
    int a,b;
    void Swaping(int a,int b)
    {   
        this.a=a;
        this.b=b;
        System.out.println("Before Swap A:"+a+" B:"+b);
        this.a=this.a+this.b;
        this.b=this.a-this.b;
        this.a=this.a-this.b;
        System.out.println("After Swap using call by value A:"+a+" B:"+b+"\n");

    }
    void reswap(Swap s){
        System.out.println("Before swap A:"+s.a+" B:"+s.b);
        s.a=s.a+s.b;
        s.b=s.a-s.b;
        s.a=s.a-s.b;
        System.out.println("After Swap using call by reference A:"+s.a+" B:"+s.b);

    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        Swap obj1=new Swap();
        System.out.println("Enter a Value for A and B:");
        obj1.Swaping(input.nextInt(),input.nextInt());
        System.out.println("Rearranging A and B Value\n");
        Swap obj2=new Swap();
        obj2.reswap(obj1);
    }

}
