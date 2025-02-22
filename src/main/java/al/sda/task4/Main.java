package al.sda.task4;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] arg) {
        List<String> upperCase = List.of("hi rei , how are you?");

    List<String> result = upperCase.stream()
            .map(String::toUpperCase)
            .collect(Collectors.toList());
        System.out.println(result);

    }
}
