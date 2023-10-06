public class Password {
    // 1) No space 2) Atleast one digit 3) One uppercase and one lowercase 4) one special character 5) It should contain more than 8 to 15 characters.

    static boolean PassCheck(String str){
        int n = str.length();
        if(n < 8 && n > 15){
            return false;
        }

        if(str.indexOf(" ") != -1){
            return false;
        }

        int digit =0, upper = 0, lower =0, special =0;
        String sp = "~!@#$%^&*()_{}[]:;.><,";

        for(char i = '0'; i<= '9'; i++){
            if(str.indexOf(i) != -1){
                digit =1;
                break;
            }
        }

        if(digit == 0){
            return false;
        }

        for(char i = 'a'; i<= 'z'; i++){
            if(str.indexOf(i) != -1){
                lower = 1;
                break;
            }
        }

        if(lower == 0){
            return false;
        }

        for(char i='A'; i<= 'Z'; i++){
            if(str.indexOf(i) != -1){
                upper =1;
                break;
            }
        }

        if(upper ==0){
            return false;
        }

        for(int i =0; i<sp.length(); i++){
            if(str.indexOf(sp.charAt(i)) != -1){
                special =1;
                break;
            }
        }

        if(special == 0){
            return false;
        }



 return true;
    }


    public static void main(String[] args) {
        String pass = "77FpWce=100";
        System.out.println(PassCheck(pass));
    }
}
