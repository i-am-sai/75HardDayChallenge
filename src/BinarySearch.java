public class BinarySearch {

    static int binary(int[] arr, int tar){

        int start =0;
        int end = arr.length ;
        if(tar > arr[end-1]){
            return -1;
        }
        while(end >= start){
            int  mid = start + (end -start)/2;
            if(arr[mid] == tar){
                return mid;
            }
            else if(arr[mid] > tar){
               end  = mid -1;
            } else if (arr[mid] < tar) {
                start = mid +1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr ={1,2,4,6,7,9};
        int tar = 3;
        System.out.println(binary(arr,tar));

    }
}
