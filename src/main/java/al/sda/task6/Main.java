package al.sda.task6;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        List<Integer> list = List.of( 1,2,3,4,5,6);

         String number = list.stream()
                    .map(num -> (num %2  ==0 ? "e":"o")+ num)
                    .collect(Collectors.joining(","));
         System.out.println(number);
        }
}
