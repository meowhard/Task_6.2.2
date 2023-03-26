import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ByteArrayInputStream bais = new ByteArrayInputStream("1 2 3 4 5 6".getBytes());
        System.setIn(bais);
        Scanner s = new Scanner(System.in);

        System.out.println(removeUnevenNumbersAndReverseSequence(s));
    }

    public static String removeUnevenNumbersAndReverseSequence(Scanner scanner) {
        String[] strList = scanner.nextLine().split(" ");
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        for(String s : strList) {
            deque.add(Integer.valueOf(s));
        }
        return deque.toString();
    }
}