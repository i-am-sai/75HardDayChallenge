import java.util.ArrayList;

public class FreqOcurrence {

    static ArrayList<Integer> find(long[] arr, int x, int n){
        ArrayList<Integer> range = new ArrayList<>();
        range.add(1);
        range.add(1);
        int start = binary(arr,x, true);
        int end = binary(arr, x, false);
        range.set(0,start);
        range.set(1,end);
        return range;
    }

    static int binary(long[] arr, int x, boolean index){
      int start = 0;
      int end = arr.length-1;
      int ans =-1;
   while(end >=  start){
       int mid = (start + end)/2;
       if(arr[mid] > x){
           end = mid-1;
       }
       else if(arr[mid] < x){
           start = mid+1;
       }
       else{
           ans = mid;
           if(index==true){
              end = mid -1;
           }
           else{
               start=mid+1;
           }
       }
   }
   return ans;
    }

    public static void main(String[] args) {
        long[] arr = {1,2,3,5,5,5,5,7,8,9};
        int x = 5;
        int n = 10;
        System.out.println(find(arr,x,n));
    }
}
