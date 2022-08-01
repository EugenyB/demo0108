package foreach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Arne", "Chuck", "Slay"));
        for (String s : list) {
            if (s.equals("Chuck")) list.remove(s);
        }
        System.out.println(list);
    }
}
