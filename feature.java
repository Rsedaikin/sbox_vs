
public class Feature {
    static int answer = 43;
    static int calc() {
        return answer;
    }

    public static String concat(String s) {
        return (s + " " + calc());
    }
}
