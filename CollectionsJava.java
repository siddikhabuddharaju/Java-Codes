import java.util.LinkedList;
import java.util.Queue;
public class CollectionsJava {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("MVGR");
        queue.add("MAHARAJ");
        queue.add("VIJAYRAM");
        queue.add("GAJAPATI");
        queue.add("RAJ");
        queue.add("College Of Enge..");
		for (String ele : queue) {
            System.out.println(ele);
        }
		System.out.println("\n");
        String se = queue.peek();
        System.out.println("Starting element: " + se);
        String de = queue.poll();
        System.out.println("Deleted element: " + de);
		System.out.println("\n");
        System.out.println("Queue elements:");
        for (String ele : queue) {
            System.out.println(ele);
        }
    }
}
