public class Polymorphism {
    public int sum(int x, int y){
       return x+y;
    }

    public int sum(int x, int y, int z){
        return x+y+z;
    }

    public double sum(double x, double y){
        return x+y;
    }

    public static void main(String[] args) {
//        Polymorphism s = new Polymorphism();
//          System.out.println(s.sum(10, 20));
//
//    System.out.println(s.sum(10, 20, 30));
//
//    System.out.println(s.sum(10.5, 20.5));

    Account a1 = new Account(700000, 1000000);
        System.out.println(a1.print());

    }


}

class Bank {
    private double balance;
    public Bank(double balance){
        this.balance = balance;
    }
    public String print(){
      return ("Old " + balance);
    }
}

class Account extends Bank{
    int newBalance;

    public Account(int balance, int newBalance ){
        super(balance);
        this.newBalance = newBalance;
    }

    @Override
    public String print(){
    return (super.print() + " New " + newBalance);
    }
}
