import java.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;

//GET AND PUT OPERATIONS CONCURRENCY TEST
public class CHMapEx {
    public static void main(String[] args) {
        ConcurrentHashMap<String,String> premiumPhone = new ConcurrentHashMap<String,String>();
        premiumPhone.put("Apple", "iPhone6");
        premiumPhone.put("HTC", "HTC one");
        premiumPhone.put("Samsung","S6");
        System.out.println("ConcurrentHashMap Test");
        Iterator iterator1 = premiumPhone.keySet().iterator();
        while (iterator1.hasNext()) {
            System.out.println(premiumPhone.get(iterator1.next()));
            premiumPhone.put("Sony", "Xperia Z");
        }
        
        System.out.println("Printing Again!!!!");

        Iterator iterator2 = premiumPhone.keySet().iterator();
        while (iterator2.hasNext()) {
            System.out.println(premiumPhone.get(iterator2.next()));
        }
        CHMapEx chmap = new CHMapEx();
        System.out.println(chmap.toString());
        
    }
    
}

