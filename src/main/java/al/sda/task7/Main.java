package al.sda.task7;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args){
        List<Employee> employees = Arrays.asList(
                new Employee(1,"John", 20000),
                new Employee(2,"Smith",30000),
                new Employee(3,"Billl",40000));

        Employee employee = employees.stream()
                .filter(o -> o != null)
                .filter(e -> e.getSalary() > 30000)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Not found!"));

        System.out.println(employee);
    }
}
