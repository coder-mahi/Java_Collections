import java.util.*;
public class PracticeArrayList{
    public static void main(String[] args){
        // add() remove() addAll() isEmpty() clear()
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(100);
        list1.add(200);
        list1.add(300);
        list1.add(400);
        System.out.println(list1);
        list1.remove(0);
        list1.remove(1);
        System.out.println("After remove index 0,1 :-> "+list1);
        list2.add(60);
        list2.add(900);
        System.out.println(list2);
        list1.addAll(list2);
        System.out.println("list1.addAll(list2) :-> "+list1);
        System.out.println("List1 Is empty : "+list1.isEmpty());
        System.out.println("List2 Is empty : "+list1.isEmpty());
        list1.clear();
        System.out.println(list1);
    }
}