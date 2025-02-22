package al.sda.task5;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> startsWithA = List.of("abl", "bla", "alkj", "ask", "apsh", "kdn");

        List<String> list = startsWithA.stream()
                .filter(w -> w.startsWith("a") && w.length() == 3)
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
