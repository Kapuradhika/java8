import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;


//REVERSE A LIST 3 ways
public class ReverseList {
    public static void main (String[] args) {
        //Reverse iterate an ArrayList
        List<String> list = new ArrayList<String>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        
        System.out.println("ArrayList : " + list);

        //To reverse print a list way 1
        System.out.println("Reversed ArrayList way 1, list order is preserved: ");
        java.util.ListIterator<String> listIterator = list.listIterator(list.size());
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
        System.out.println(list);

        //To reverse print a list way 2
        System.out.println("Reversed ArrayList way 2, list order preserved: ");
        for(int j=list.size()-1;j>=0;j--){
            System.out.println(list.get(j));
        }

        //To reverse print a list way 3
        Collections.reverse(list);
        System.out.println("Reversed ArrayList way 3, list order not preserved: ");
        System.out.println("Reversed ArrayList : " + list);
    }
}

