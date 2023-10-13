import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class SubsequencePalin {

    static int solve(String str, int i, int j)
    {
        if (i == j) //  base case when index is same
            return 1;

        if (i > j)
            return 0;

        if (str.charAt(i) == str.charAt(j)) {

            return 1 + solve(str, i + 1, j)
                    + solve(str, i, j - 1);
        }

        else
            return solve(str, i + 1, j)
                    + solve(str, i, j - 1)
                    - solve(str, i + 1, j - 1);
    }

    public static void main(String[] args)
    {  String str = "abcaba";
        int a =0;
        int b = str.length()-1;
        System.out.println(solve(str, a ,b));
        Set<Character> s = new HashSet<>();
        int sum=0;
        for(int i=0;i<str.length();i++)
        {
            if(!s.contains(str.charAt(i)))
            {
                s.add(str.charAt(i));
                Set<Character> m = new HashSet<>();
                for(int j=str.length()-1;j>=0;j--)
                {
                    if(str.charAt(i)==str.charAt(j))
                    {
                        int p=i+1;
                        while(p<str.length() && p<j)
                        {
                            m.add(str.charAt(p));
                            p++;
                        }
                        sum=sum+m.size();
                        break;
                    }
                }
            }
        }
        System.out.println(sum);
}

}
