package al.sda.task8;

import al.sda.task7.Employee;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "John", 20000),
                new Employee(2, "Smith", 30000),
                new Employee(3, "Billl", 40000));

        List<Employee> employeesSorted = employees.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());
    }
}
