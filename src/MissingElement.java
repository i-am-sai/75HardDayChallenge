public class MissingElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length+1;
        int o_sum = n*(n+1)/2;
        System.out.println(o_sum);
        int a_sum = 0;
//        for(int i =0; i< arr.length; i++){
//            a_sum += arr[i];
//        }
//        int m_num = o_sum - a_sum;
//        System.out.println(m_num);
        int i =0;
        while(i<arr.length){
            a_sum += arr[i];
        }
        int m_num = o_sum - a_sum;
        System.out.println(m_num);
    }
}
