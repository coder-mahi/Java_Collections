import java.util.*;
public class PracticeStack{
    public static void main(String[] args){
        // push() pop() peek() isEmpty()
        Stack<Integer> s = new Stack<>();
        s.push(100);
        s.push(200);
        s.push(300);
        s.push(400);
        System.out.println(s);
        System.out.println("Top :> "+s.peek());
        System.out.println("Popped -> "+s.pop());
        System.out.println("Popped -> "+s.pop());
        System.out.println("After operation stack : "+s);
        System.out.println("Is empty : "+s.isEmpty());
        System.out.println("Top :> "+s.peek());
    }
}