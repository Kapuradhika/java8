
import java.util.List;
import java.util.Collections;
import java.util.stream.*;
import java.util.Arrays;

//COUNT NUMBR OF CHARS IN A STRING USING LAMBDA EXPR JAVA8 AND FIND INTERSECTION OF TWO ARRAYS
public class CountChars {

    public static void main(String args[]) {
        String stringToSearch = "she saw a fish on the seashore and "
                + "I'm sure The fish she saw on the seashore was a saw-fish.";

        long count = stringToSearch.toLowerCase().chars().filter(e -> e == 's').count();
        System.out.println("Number of char e: " + count);

        List<Integer> list1 = Arrays.asList(8,9,5,4,1,6,2);
        List<Integer> list2 = Arrays.asList(3,8,7,5,0,2,1);

        //USING retianAll function of List class
        //list1.retainAll(list2);
        //System.out.println("Intersection: " + list1);
        
        List<Integer> intersect = list1.stream().filter(list2::contains).collect(Collectors.toList());       
        System.out.println("Intersection: " + intersect);

        List<String> names = Arrays.asList("Angela", "Aaron", "Bob", "Claire", "David");
        List<String> namesWithA = names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());
        System.out.println(namesWithA);
    }
    
}