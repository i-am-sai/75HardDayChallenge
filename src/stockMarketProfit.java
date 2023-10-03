public class stockMarketProfit {

    public static int maxProfit(int[] arr){
        int lsf = Integer.MAX_VALUE;
        int op = 0;
        int pist = 0;
        for(int i =0; i< arr.length; i++){
              if(arr[i] < lsf){
                  lsf = arr[i];
              }
              pist = arr[i] - lsf;
              if(pist > op){
                  op = pist;
              }
        }
        return op;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,9};
        System.out.println(maxProfit(arr));

    }
}
