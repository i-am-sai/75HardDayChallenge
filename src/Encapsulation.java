
class Person {
    private String name;
    private int age;

    public String getName() { return name; }

    public void setName(String Inname) { this.name = Inname; }

    public int getAge() { return age; }

    public void setAge(int Inage) { this.age = Inage; }
}

public class Encapsulation{
    public static void main(String[] args)
    {
        Person person = new Person();
        person.setName("John");
        person.setAge(30);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}

