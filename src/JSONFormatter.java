import java.util.Scanner;
public class JSONFormatter {

    static String json(String str){
        StringBuilder js = new StringBuilder();
        int indent = 0;
        boolean check = false;

        for(char ch : str.toCharArray()){

            if(ch == '{' || ch == '['){
                js.append(ch).append('\n');
                indent++;
                indentation(js,indent);
            }
            else if(ch == '}' || ch == ']'){
                js.append('\n');
                indent--;
                indentation(js,indent);
                js.append(ch);
            }
            else if(ch == ','){
                js.append(ch).append('\n');
                indentation(js, indent);
            }
            else{
                js.append(ch);
            }
        }
return js.toString();
    }

    static void indentation(StringBuilder js, int indent){
        for(int i =0; i<indent; i++){
            js.append("**");
        }
    }

    public static void main(String[] args) {
        String str = "{[Sai: Courage, Swaroop:Can do it.]}";
        for(char c : str.toCharArray()){
            System.out.print(c + " ");
        }
        System.out.println(json(str));
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the JSON string: ");
//        String input = scanner.nextLine();
//
//        String formattedJson = json(input);
//        System.out.println("Formatted JSON:");
//        System.out.println(formattedJson);
    }

}