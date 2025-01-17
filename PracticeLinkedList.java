import java.util.*;
public class PracticeLinkedList{
    public static void main(String[] args){
         // add() remove() peek() isEmpty() clear() get()
        List<Integer> LL = new LinkedList<>();
        LL.add(100);
        LL.add(200);
        LL.add(300);
        LL.add(400);
        System.out.println(LL);
        System.out.println("Head : "+LL.peek());
        LL.remove(0);
        LL.remove(1);
        System.out.println("After remove index 0,1 :-> "+LL);
        System.out.println("LinkedList Is empty : "+LL.isEmpty());
        LL.clear();
        System.out.println(LL);
    }
}
