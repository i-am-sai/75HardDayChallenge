public class Lexographically {
    public static void main(String[] args) {
        String s = "sai swaroop";
        int n = s.length();
        String b = "Sai";
        System.out.println(s.compareToIgnoreCase(b));
        // If(compare value = 0 : lexographically equal.
      String sub = s.toUpperCase().substring(0,1) + s.substring(1,4) + s.toUpperCase().substring(4,5) + s.substring(5) ;
        System.out.println(sub);
    }
}
