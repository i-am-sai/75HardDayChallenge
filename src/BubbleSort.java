import java.util.Arrays;

public class BubbleSort {

    static void bubble(int[] arr){
        for(int i =0; i<arr.length-1; i++){
            for(int j=i+1; j< arr.length-1; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,7,3,1,24};
        System.out.println(Arrays.toString(arr));
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }
}
