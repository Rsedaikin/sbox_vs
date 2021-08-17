
public class Feature {
    static int answer = 42;
    static int calc() {
        return answer;
    }

    public static String concat(String s) {
        return (s + " " + calc());
    }

    public static String concat(String s) {
        return (s + " " + calculation());
    }
}
