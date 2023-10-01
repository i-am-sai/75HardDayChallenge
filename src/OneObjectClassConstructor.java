public class OneObjectClassConstructor {

    int balance;

    public OneObjectClassConstructor(int initialBalance){
        balance = initialBalance;
    }


    public static void main(String[] args) {
       OneObjectClassConstructor accountOne = new OneObjectClassConstructor(700000);
       System.out.println(accountOne.balance );
    }
}
