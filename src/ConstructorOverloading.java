public class ConstructorOverloading {
    String Car_col;
    int kpl;
    boolean isElectric;

    //Const 1
    public ConstructorOverloading(String colour, int kiloperlitre){
        Car_col = colour;
        kiloperlitre = kpl;
    }

    public ConstructorOverloading(boolean Electric, int kilperlitre){
        isElectric = Electric;
        kpl = kilperlitre;
    }
    public static void main(String[] args) {
        ConstructorOverloading car1 = new ConstructorOverloading("Red", 79);
        ConstructorOverloading car2 = new ConstructorOverloading(true, 89);

    }
}
