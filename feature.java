
public class Feature {
    static int calculation() {
        return 42;
    }

    public static String concat(String s) {
        return (s + " " + calculation());
    }
}
