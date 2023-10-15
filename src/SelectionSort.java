import java.util.Arrays;

public class SelectionSort {

    static void insertion(int[] arr){
        for(int i =0; i<arr.length-1; i++){
            for(int j = i+1; j>0;j--){
                if(arr[j-1] > arr[j]){
                    swap(arr,j-1,j);
                }
            }
        }
    }

    static void selection(int[] arr){
        for(int i =0; i<arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = max(arr, 0, last);
            swap(arr,maxIndex,last);
        }
    }

    static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int max(int[] arr, int s, int e){
        int m = s;
        for(int i =0; i<=e; i++){
            if(arr[i] > arr[m]){
                m = i;
            }
        }
        return m;
    }

    public static void main(String[] args) {
        int[] arr = {5,7,3,1,24};
        System.out.println(Arrays.toString(arr));
//        selection(arr);
//        System.out.println(Arrays.toString(arr));
        insertion(arr);
        System.out.println(Arrays.toString(arr));

    }
}
