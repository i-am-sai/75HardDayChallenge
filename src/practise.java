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
//        int[] arr ={2,3,4,5};
//        int n =5;
//        int sum = n*(n+1)/2;
//        System.out.println(sum);
//        int insum = 0;
//        for(int i =0; i<arr.length; i++){
//            insum += arr[i];
//        }
//        int misDigit = sum - insum;
//        System.out.println(misDigit);


        String s = "pwwkew";
        System.out.println(s.substring(0,0) + s.substring(0) );
        System.out.println(lengthOfLongestSubstring(s));

    }
    public static int lengthOfLongestSubstring(String s) {
        int  j = s.length() -1;
        char m;
        String ans ="";
        int count = 0;
        int res = 0;
        for(int i =0; i<=j; i++){
//            if(s.charAt(i) == ' '){
//                return 1;
//            }
            m = s.charAt(i);

            if(ans.indexOf(m) != -1){
                ans = "" + m;
                res = count;
                if(count > res){
                   return res;
                }
                else {

                    count = 0;
                    count++;
                }
            }
            else{
                ans =  ans +m;
                count++;
            }
        }
        return count;
    }
}