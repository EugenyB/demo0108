package foreach2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Arne", "Chuck", "Slay"));
        list.forEach(x -> {
            if (x.equals("Chuck")) {
                list.remove(x);
            }
        });
    }
}
