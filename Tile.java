import java.util.*;
public class Tile {
    int edgeLength;
    public Tile(int a){
        this.edgeLength=a;
    }
    int area(){
        return edgeLength*edgeLength;
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter edge length of a square tile:");
        Tile obj1=new Tile(input.nextInt());
        obj1.area();
        System.out.println("Enter length and width of a rectangular floor:");
        Floor obj2=new Floor(input.nextInt(),input.nextInt());
        System.out.println("Number of tiles needed to cover the floor completely:"+obj2.totalTiles(obj1)); 
    }
}
class Floor{
    int length,width;
    public Floor(int a,int b){
        this.length=a;
        this.width=b;
    }
    float totalTiles(Tile t){
        float a=length*width;
        float b=t.area();
        return a/b;

    }
}