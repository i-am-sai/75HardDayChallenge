public class PerfectNo {

    static boolean check(int i){
        int n =i;
        int count = 0;
        while(n > 0){
            int s = n/10;
            if(i%s ==0 && s!=0){
              count = count *10 + s;
            }
            if(s == i) {
                return true;
            }
            n = n/10;
        }
        return false;
    }
    public static void main(String[] args) {
        int start = 1;
        int end = 10;
        int result=0;
        for(int i = start; i<=end; i++){
            if(i<10){
                result += i;
            }
            else {
                boolean flag = true;
                int n = i;
                while (n > 0 && flag == true) {
                    int s = n % 10;
                    if (s == 0 || i % s != 0) {
                        flag = false;
                    }
                    n = n / 10;
                }
                if(flag == true){
                    result += i;
                }
            }
        }
        System.out.println(result);
    }
}
