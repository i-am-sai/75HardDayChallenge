public class SlidingWindow {

    //Time Complexity : O(kn)
    static int bruteForce(int[] arr, int k){
        int o_result =0;
        for(int i =0; i<arr.length-k+1; i++){
            int c_result = 0;
            for(int j = 0; j<k; j++){
                c_result += arr[j+i];
            }
            if(c_result>o_result){
                o_result = c_result;
            }
        }
        return o_result;
    }

    public static int SW(int[] arr, int k){
        int C_sum =0, O_sum=0;
        for(int i =0; i<k; i++){
            C_sum += arr[i];
        }
        for(int i =k; i<arr.length; i++){
            C_sum = C_sum + arr[i] - arr[i-k];
            if(C_sum > O_sum){
                O_sum = C_sum;
            }
        }

        return O_sum;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
        int k = 4;
        System.out.println(bruteForce(arr,k));
        System.out.println(SW(arr,k));
    }
}
