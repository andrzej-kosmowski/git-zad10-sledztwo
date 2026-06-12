public class Greeting {
    public static String greet(String name) {
        return "Hello, " + name + "!";
    }

    public static String farewell(String name) {
        return "Goodbye, " + name + "!";
    }

    public static String time(int hour) {
        if (hour < 12) return "morning";
        if (hour < 18) return "afternoon";
        return "evening";
    }

    public static String constant() {
        return "Pi=3.14";
    }

    public static int absoluteValue(int x) {
        return x < 0 ? -x : x;
    }

    public static int square(int x) {
        return x * x;
    }
}
