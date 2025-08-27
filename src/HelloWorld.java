import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
    public static void main(String[] args) {
        ArrayList<String> pitches = new ArrayList<>();

        pitches.add("138");
        pitches.add("129");
//        pitches.add(130);

        String one =  pitches.get(0);
        String two =  pitches.get(1);
    }
}