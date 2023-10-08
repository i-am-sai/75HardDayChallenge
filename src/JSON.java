import java.util.Scanner;

public class JSON {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the JSON string: ");
        String input = scanner.nextLine();

        String formattedJson = formatJson(input);
        System.out.println("Formatted JSON:");
        System.out.println(formattedJson);
    }

    public static String formatJson(String input) {
        StringBuilder formattedJson = new StringBuilder();
        int indentationLevel = 0;
        boolean insideQuotes = false;

        for (char c : input.toCharArray()) {
            if (c == '"') {
                insideQuotes = !insideQuotes;
            }

            if (c == '{' || c == '[') {
                formattedJson.append(c).append('\n');
                indentationLevel++;
                appendIndentation(formattedJson, indentationLevel);
            } else if (c == '}' || c == ']') {
                formattedJson.append('\n');
                indentationLevel--;
                appendIndentation(formattedJson, indentationLevel);
                formattedJson.append(c);
            } else if (c == ',') {
                formattedJson.append(c).append('\n');
                appendIndentation(formattedJson, indentationLevel);
            } else {
                formattedJson.append(c);
            }
        }

        return formattedJson.toString();
    }

    private static void appendIndentation(StringBuilder sb, int indentationLevel) {
        for (int i = 0; i < indentationLevel; i++) {
            sb.append("**"); // You can customize the indentation as needed
        }
    }
}
