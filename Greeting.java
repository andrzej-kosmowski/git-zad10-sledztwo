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
}
