package al.sda.task9;

import al.sda.task7.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "John", 20000),
                new Employee(2, "Smith", 30000),
                new Employee(3, "Billl", 40000));

        Integer max = employees.stream()
                .map(e -> e.getSalary())
                .max(Comparator.naturalOrder())
                .orElseThrow(() -> new NoSuchElementException("Not found!"));
        System.out.println(max);
    }
}
