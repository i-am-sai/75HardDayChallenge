public class CustomStack {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    // static = As all the objects of the customStack must be of same.
    // private = No one can change it.
    // final = Even I should not able to change.

    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size){
        this.data = new int[size];
    }
    public static void main(String[] args) {
        int[] dat = new int[5];
        dat[0] = 7;


    }
}
