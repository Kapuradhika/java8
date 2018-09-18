public class StringCheck { 
    public static void main (String args[]) {
        String str = "Hello";
        String s1 = str.concat("World"); 
        String s3 = new String("HelloWorld"); //on heap
        String s2 = s1.intern();

        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s1 == s3);         
        
    }
}