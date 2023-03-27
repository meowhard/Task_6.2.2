import java.util.List;
import java.util.stream.Collectors;

class SystemOutResultWriter {
    public static void write(List<Integer> inputList) {
        String res = inputList.stream().map(Object::toString).collect(Collectors.joining(" "));
        System.out.println(res);
    }
}
