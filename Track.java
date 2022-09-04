import java.util.*;
public class Track {
    static int count=0;
    {
        count++;
    }
    public Track(){
        System.out.println("Upload Details");
    }
    public Track(int a){
        System.out.println("ID:"+a+" Saved");

    }
    public Track(String str){
        System.out.println("ID:"+str+" Saved");

    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        Track obj3=new Track();
        System.out.println("Enter ID:");
        Track obj1=new Track(input.nextInt());
        System.out.println("Enter Name:");
        Track obj2=new Track(input.next());
        System.out.println("Number of instances of the class:"+Track.count);
    }
}
