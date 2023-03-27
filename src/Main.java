import java.io.ByteArrayInputStream;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ByteArrayInputStream bais = new ByteArrayInputStream("1 2 3 4 5 6".getBytes());
        System.setIn(bais);

        Scanner s = new Scanner(System.in);
        processing(s);
    }

    static void processing(Scanner s) {
        Sequence sequence = new Sequence(s);
        String[] sequenceArray = sequence.getSequenceAsStringArray();
        if (sequenceArray != null) {
            List<Integer> sequenceAsList = ListSequence.getSequenceAsListWithoutUnevenPositions(sequenceArray);
            List<Integer> reversedSequence = ReversedSequence.reverse(sequenceAsList);
            SystemOutResultWriter.write(reversedSequence);
        } else {
            System.out.println("");
        }
    }
}


