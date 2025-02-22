package al.sda.task3;

import java.util.List;

public class Main {
        public static void main(String[] args) {
            List<Integer> numbers = List.of(1, 2, 3, 4, 5);

    double average = numbers.stream()
            .mapToDouble(Integer::doubleValue)
            .average()
            .orElse(0.0);
        System.out.println( average);
        }
    }

