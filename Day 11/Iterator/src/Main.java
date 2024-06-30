import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {


        //   LinkedList<String> placesTovVisit = new LinkedList<>();

        var placesToVisit = new LinkedList<String>();

        //Add and Remove

        placesToVisit.add("Dhaka");  // index 4
        placesToVisit.add(0, "Chittagong");
        System.out.println(placesToVisit);
        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);
//        System.out.println(placesToVisit);

        testIterator(placesToVisit);

    }

    private static void addMoreElements(LinkedList<String> list) {
        list.addFirst("Jamal");
        list.addLast("Kamal");

        // Queue methods
        list.offer("Rajshahi");
        list.offerFirst("Marimba");
        list.offerLast("Lang");

        //Stack Methods
        list.push("Alice Spring");

    }

    private static void testIterator(LinkedList<String> list){
        var iterator = list.listIterator();
        while (iterator.hasNext()){
  //     System.out.println(iterator.next());
           if(iterator.next().equals("Lang")){
               iterator.remove();
              iterator.add("Something");
       }

        }

        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
        System.out.println(list);

        var iterator2 = list.listIterator(2);
        System.out.println(iterator2.previous());
    }
}