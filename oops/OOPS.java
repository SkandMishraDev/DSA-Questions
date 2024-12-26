class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("writirng somthing");
    }
    public void printcolor(){
        System.out.println(this.color);
    }
}
class Student{
    String name;
    int age;
    String rollNo;

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
public class OOPS {
    public static void main(String[] args) {
        Pen pen1 =new Pen();
        pen1.color="black";
        pen1.type="gel";

        Pen pen2=new Pen();
        pen2.color="blue";
        pen2.type="ballpoint";

        pen1.printcolor();
        pen2.printcolor();

        Student s1=new Student();
        s1.name="skand";
        s1.age=26;

        Student s2=new Student();
        s2.name="vaibhav";
        s2.age=26;

        s1.printinfo();
        s2.printinfo();
    }
    
}
