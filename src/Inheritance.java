class Bicycle {
    public int gear;
    public int speed;
       public Bicycle(int gear, int speed){
           this.gear = gear;
           this.speed = speed;
       }

       public void maxSpeed(int max){
           speed +=  max;
       }

    public String toString()
    {
        return ("No of gears are " + gear + "\n"
                + "speed of bicycle is " + speed);
    }
        }


        class Mountain extends Bicycle{
    public int height;
    public Mountain(int gear, int speed, int height){
        super(gear, speed);
       this.height = height;
    }

    @Override public String toString() {
        return (super.toString() + "\nseat height is " + height);
    }

        }

        class Inheritance{

            public static void main(String[] args) {

                Mountain bike = new Mountain(7,100, 25);
                System.out.println(bike.toString());

            }
        }

















//import java.io.*;
//class Employee{
//    int salary = 700000;
//}
//
//class Engineer extends Employee{
//    int benefits = 300000;
//}
//
//public class Inheritance {
//    public static void main(String[] args) {
//        Engineer E1 = new Engineer();
//        System.out.println("Salary : " + E1.salary + "\nBenifits : "+ E1.benefits);
//
//    }
//}
