public class Test2 {
    public static void main(String[] args) {
        while (StdIn.hasNextLine()) {
            StdOut.println(StdIn.readString());
            if (StdIn.isEmpty()) break;
        }
    }
}
