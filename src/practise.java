
interface A{
    void bike();
    void car();
    default void cycle(){
        int wheels =  2;
        String engine = "chain";
        System.out.println(wheels + " " + engine);
    }

        }
abstract class B implements A{
int oil = 2;
int speed = 100;

public B(int oil, int speed){
    this.oil =  oil;
    this.speed = speed;
}
    public void bike(){
       int wheels = 2;
        System.out.println("Motor");
        }
    public String to(){
        return ("oil " + oil + "speed " + speed );
    }
        }
class C extends B{
    String car = "Porsche";
    public C(int oil, int speed, String car){
        super(oil, speed);
        this.car = car;
    }
    public void car(){

        System.out.println("Porsche");
    }
    public String to(){
        return (super.to() + "Super car is " + car);
    }

}

class D{
    private int id = 7;
    private String name = "Sai";

    public void setId(int i){
        this.id= i;
    }

    public int getId(){
        return id;
    }

    public void setName(String n){
        this.name = n;
    }

    public String getName(){
        return name;
    }

    public void poly(int a){
        System.out.println(a);
    }

    public void poly(int a, int b){
        System.out.println(a+b);
    }
}

class practise{
public static void main(String[]args){
A vehicle = new C(70,100,"Car");
vehicle.car();
vehicle.bike();
vehicle.cycle();
    System.out.println(vehicle.toString());

D Student = new D();
Student.setId(7);
Student.setName("Sai");
    System.out.println(Student.getId() + " " + Student.getName());
    Student.poly(59);
    Student.poly(34,53);
        }
}