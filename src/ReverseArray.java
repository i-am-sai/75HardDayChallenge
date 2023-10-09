import java.util.Arrays;

public class ReverseArray {

    static int[] reverse(int[] arr, int s, int e){
        for(int i =s; i<e; i++){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int s = 0;
        int e = arr.length-1;
        System.out.println(Arrays.toString(reverse(arr,s,e)));
        for(int i =1; i<3; i++){
            int temp = arr[arr.length-1];
            for(int j = arr.length-1; j>0; j--){
                arr[j] = arr[j-1];
            }
            arr[0] = temp;
        }
        System.out.println(Arrays.toString(arr));

        //        int[] arr ={1,2,3,4,5};
//       int n = arr.length;
//        int k= 6;
//        k = k%n;
//        int s = 0;
//        int e = arr.length-1;
//        reverse(arr,s,e);
//        System.out.println(Arrays.toString(arr));
//
//        reverse(arr,s,k-1);
//        reverse(arr,k,arr.length-1);
//        System.out.println(Arrays.toString(arr));
    }
}
