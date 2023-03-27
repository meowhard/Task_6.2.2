import java.util.ArrayList;
import java.util.List;

class ListSequence {
    public static List<Integer> getSequenceAsListWithoutUnevenPositions(String[] stringArray) {
        List<Integer> list = new ArrayList<>();
        int i = 1;

        for (String s : stringArray) {
            if (i % 2 == 0) {
                list.add(Integer.valueOf(s));
            }
            i++;
        }
        return list;
    }
}
