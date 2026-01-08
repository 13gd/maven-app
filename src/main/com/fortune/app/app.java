/**
 * This is my Maven application for testing
 */
public class App {

    private static final String MESSAGE = "welcome to my application";

    public App() {}

    public static void main(String[] args) {
        System.out.println(MESSAGE);
    }

    public String getMessage() {
        return MESSAGE;
    }
}

