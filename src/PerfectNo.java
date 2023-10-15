public class PerfectNo {

    static int[] PerNo(int s, int e){
        int result = 0;
        int count = 0;
        for(int i = s; i<=e; i++){
            if(i < 10){
                result += i;
                count++;
            }
            else{
                boolean flag = true;
                int n = i;
                while( n>0 && flag == true) {
                    int d = n % 10;
                    if (d == 0 || i % d != 0) {
                        flag = false;
                    }
                    n = n / 10;
                }
                if(flag == true) {
                    result += i;
                    count++;
                }

            }

        }
        int[] a = new int[2];
        a[0] = result;
        a[1] = count;
        return a;
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
