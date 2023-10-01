public class ObjectClass {

    // There is a default constructor here.
    // Default values are assigned to instance field itself
    static String Emp_name;
    static float Emp_salary;
    int Emp_age = 21;

    static void set(String n, float p){
        Emp_name = n;
        Emp_salary = p;
    }

    static void get(){
        System.out.println("Employee name is : " + Emp_name);
        System.out.println("Employee CTC is : " + Emp_salary);
    }

    public static void main(String[] args) {
        ObjectClass.set("Sai",1000000);
        ObjectClass.get();
        ObjectClass emp1 = new ObjectClass();
        System.out.println(emp1.Emp_age);

    }
}
