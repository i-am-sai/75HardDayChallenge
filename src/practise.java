import java.util.Arrays;

public class practise {
    static int median(int[][] arr, int r, int c){
        int n = r*c;
        int[] a = new int[n];
        int m =0;
        for(int i =0; i<arr.length; i++){
            for(int j =0; j< arr[i].length; j++){
                 a[m] = arr[i][j];
                m++;
            }
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(m);
        int b = m/2;
        return a[b];
}
    public static void main(String[] args) {
        int arr[][] = {{1,3,5}, {2,6,9}, {3,6,9}};
        int R = 3;
        int C =3;
        System.out.println(median(arr, R, C));



    }
}
