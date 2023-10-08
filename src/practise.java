import java.util.Arrays;

public class practise {


    public static String json(String str){
        StringBuilder s = new StringBuilder();
        int indent = 0;
        boolean check = false;
        for(char ch : str.toCharArray()){
            if(ch == '"'){
                check = !check;
            }
            else if(ch == '{' || ch == '['){
                s.append(ch).append('\n');
                indent++;
                space(s,indent);

            }
            else if(ch == '}' || ch == ']'){
                s.append('\n');
                indent--;
                space(s,indent);
                s.append(ch);
            }
            else if(ch==','){
                s.append(ch).append('\n');
                space(s,indent);
            }
            else{
                s.append(ch);
            }
        }
        return s.toString();
    }
     public static void space(StringBuilder s, int indent){
        for(int i =0; i<indent; i++){
            s.append("**");
        }
    }

    public static void main(String[] args) {
        String str = "{[Sai: Courage,Swaroop:Can do it.]}";
        System.out.println(json(str));
    }
}
