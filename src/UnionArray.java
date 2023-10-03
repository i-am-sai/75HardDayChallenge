public class UnionArray {

    public static int union(int[] arr1, int[] arr2) {
        int m = arr1.length - 1;
        int n = arr2.length - 1;
        int k = 0;

        int[] uni = new int[m + n];

        for (int i = 0; i <= m; i++, k++) {
            uni[k] = arr1[i];
        }


        return k;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3};
        System.out.println(union(a,b));
    }
}

