import java.util.Arrays;

class Practise {

    static int[] reverse(int[] arr, int s, int e){
        while(s<e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr ={2,3,4,5};
        int n =5;
        int sum = n*(n+1)/2;
        System.out.println(sum);
        int insum = 0;
        for(int i =0; i<arr.length; i++){
            insum += arr[i];
        }
        int misDigit = sum - insum;
        System.out.println(misDigit);






    }
}