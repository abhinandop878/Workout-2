public class Rectangle {
    int length,breadth;
    public Rectangle(int a){
        this.length=a;
        this.breadth=1;
    }
    public Rectangle(int a,int b){
        this.length=a;
        this.breadth=b;
    }
    int getArea(){
        return length*breadth;
    }
    int getPerimeter(){
        return 2*(length+breadth);
    }
    public static void main(String[] args){
        Rectangle obj1=new Rectangle(5);
        System.out.println("Area:"+obj1.getArea()+"\nPerimeter:"+obj1.getPerimeter());
        Rectangle obj2=new Rectangle(8,4);
        System.out.println("Area:"+obj2.getArea()+"\nPerimeter:"+obj2.getPerimeter());
    }
}
