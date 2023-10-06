public class Email {

    static String obfuscation(String str){
        int n = str.length();
        if(str.indexOf('@') == -1){
            return "Invaild";
        }
        String sub ="";
        int i = str.indexOf('@');

        if(i <= 5){
            for(int j=0; j<i; j++){
                char ch = str.charAt(j);
                ch = '*';
                sub = ch + sub;
            }
            sub = sub.substring(0,i) +str.substring(i,n);
        }


        if(i> 5){
            for(int j =0; j<i; j++){
                char ch = str.charAt(j);
                if(j<3) {
                sub =  sub + ch;
                }
                if( j>=3 && j<=i){
                    ch = '*';
                    sub = sub +ch;
                }
            }
            sub = sub.substring(0,i) + str.substring(i,n);
        }

        return sub;
    }
    public static void main(String[] args) {
        String s = "abcdefgmail.com";
        System.out.println(s.indexOf('q'));
        if(s.indexOf('@') == -1){
            System.out.println("in");
        }
        if (s.indexOf('@') != -1) {
            System.out.println("va");
        }
        System.out.println(obfuscation(s));

    }
}
