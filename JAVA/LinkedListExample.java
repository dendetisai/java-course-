import java.util.*;
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> al = new LinkedList<String>();
        al.add("sai");
        al.add("chandu");
        al.add("mukesh");
        al.add("promod");
        Iterator<String> itr = al.iterator(); // 'iterator()' should start with a lowercase 'i'
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
