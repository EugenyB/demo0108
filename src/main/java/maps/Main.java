package maps;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> oldSchool = initOldSchool();
        Map<String, String> modern = initModern();
        System.out.println("oldSchool = " + oldSchool);
        System.out.println("modern = " + modern);
        oldSchool.replaceAll(modern::put);
        System.out.println("oldSchool = " + oldSchool);
        System.out.println("modern = " + modern);
    }

    private static Map<String, String> initModern() {
        return new HashMap<>(Map.of("buildTool", "gradle", "lang", "kotlin", "IOC", "spring"));
    }

    private static Map<String, String> initOldSchool() {
        return new HashMap<>(
                Map.of(
                        "buildTool", "maven",
                        "lang", "java",
                        "IOC", "jee"));
    }
}
