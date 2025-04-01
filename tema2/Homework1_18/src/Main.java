import java.util.*;
public class Main{
    public static void main(String[] args){
        List<Integer>numbers = new ArrayList(Arrays.asList(10, 5, 8, 1, 3, 7, 6, 2, 9, 4));
        Collections.sort(numbers);
        System.out.println("Lista sortată: " + numbers);
    }
}