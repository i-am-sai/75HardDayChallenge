public class InfiniteArray {
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

    static int infinte(int[] arr, int tar){
        int start =0;
        int end  = 1;
        while(tar > arr[end]){
            int temp = start +1;
            end = end +(end - start + 1)*2;
            start = temp;
        }
        return binary(arr, tar);
    }

    public static void main(String[] args) {
        int[] arr ={3,5,6,9,10,90,100,123,127,200};
        int target = 10;
        System.out.println(infinte(arr, target));
    }
}
