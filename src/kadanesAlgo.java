public class kadanesAlgo {

    public static void kandanes(int[] arr) {

        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;
        int s = 0, e = 0 , m =0;

        for(int i =0; i< arr.length; i++){
            max_ending_here += arr[i];
            if(max_ending_here > max_so_far){
                max_so_far = max_ending_here;
                s = m;
                e = i;
            }
            if(max_ending_here < 0){
                max_ending_here =0;
                m = i +1;
            }
        }
        System.out.println(max_so_far);
        System.out.println("Its index start and end at : " + s + " " + e);


    }
    public static void main(String[] args) {
        int[] a = { -7, -8, -16, -4, -8, -5, -7, -11, 10, 12, -4, -6, -4, -16, -10};
   kandanes(a);
    }
}
