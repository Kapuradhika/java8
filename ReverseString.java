import java.util.Scanner;
 
public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Enter string to reverse:");
        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        
        //REVERSE STRING WAY 1
        String reverse = "";
        for(int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        
        System.out.println("Reversed string is:");
        System.out.println(reverse);

        
        //REVERSE STRING USING STRING BUILDER
        StringBuilder sb = new StringBuilder();
        for(int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        System.out.println("Reversed string is:");
        System.out.println(sb.toString());

        //REVERSE STRING USING STRING BUILDER REVERSE METHOD
        StringBuilder sbreverse = new StringBuilder(str);
        System.out.println("Reversed string is:");
        System.out.println(sbreverse.reverse().toString());
    }
}