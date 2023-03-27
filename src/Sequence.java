import java.util.Scanner;

class Sequence {
    private final Scanner SCANNER;

    public Sequence(Scanner s) {
        this.SCANNER = s;
    }

    public String[] getSequenceAsStringArray() {
        if (SCANNER.hasNext()) {
            return SCANNER.nextLine().split(" ");
        } else {
            return null;
        }
    }
}