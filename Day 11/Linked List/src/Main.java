import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {


        //   LinkedList<String> placesTovVisit = new LinkedList<>();

        var placesToVisit = new LinkedList<String>();

        //Add and Remove

        placesToVisit.add("Dhaka");  // index 4
        placesToVisit.add(0, "Chittagonf");
        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);
        removeElements(placesToVisit);
        System.out.println(placesToVisit);

        //Getting Elements

        gettingElements(placesToVisit);


        printItinerary(placesToVisit);
        printItinerary2(placesToVisit);
        printItinerary3(placesToVisit);

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

    private static void removeElements(LinkedList<String> list) {
        list.remove(4);
        list.remove("Kamal");

        System.out.println(list);
        String s1 = list.remove();
        System.out.println(s1 + " was removed");

        String s2 = list.remove();
        System.out.println(s2 + " was removed");

        String s3 = list.removeLast();
        System.out.println(s3 + " was removed");

        String p1 = list.poll();
        System.out.println(p1 + " was removed");

        String p2 = list.pollLast();
        System.out.println(p2 + "was removed");

        String p3 = list.pollLast();
        System.out.println(p3 + " was removed");

        list.push("Dhaka");
        list.push("Chittagonf");
        list.push("Lang");

        String p4 = list.pop();
        System.out.println(p4 + " was removedd");
    }

    //Getting Elements, adding and removing, push to index 0 and pop the index
    private static void gettingElements(LinkedList<String> list) {
        System.out.println("Retived Elemet = " + list.getFirst());
        System.out.println("First Element = " + list.getLast());

        System.out.println("Jamal is at position: " + list.indexOf("Jamal"));


        System.out.println("Element fomr element() = " + list.element());

        //gaining insights
        System.out.println("Element form peek() = " + list.peek());
        System.out.println("ELement from peekFirst() = " + list.peekFirst());
        System.out.println("Element from peekLast() + " + list.peekLast());


    }

    //1st way to printItinerary
    public static void printItinerary(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());

        for (int i = 1; i < list.size(); i++) {
            System.out.println("--> From: " + list.get(i - 1) + "to" + list.get(i));
        }

        System.out.println("Trip ends at" + list.getLast());
    }

    //2nd way to printItinerary
    public static void printItinerary2(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());

        String previousTown = list.peekFirst();
        for (String town : list) {
            System.out.println("--> From: " + previousTown + " to" + town);
            previousTown = town;
        }

        System.out.println("Trip ends at" + list.getLast());
    }

    //3rd way to printItinerary
    public static void printItinerary3(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());

        String previousTown = list.peekFirst();
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            var town = iterator.next();
            System.out.println("--> From: " + previousTown + " to" + town);
            previousTown = town;
        }

        System.out.println("Trip ends at" + list.getLast());
    }

}