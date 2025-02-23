package al.sda.task10;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        List<Product> products = new ArrayList<>();
        products.add(new GenericProduct(() -> 10.00, date -> date.isBefore(LocalDate.of(2025, 11, 16))));
        products.add(new GenericProduct(() -> 20.00, date -> date.isAfter(LocalDate.of(2020, 11, 16))));

        Basket basket = new Basket();
        products.forEach(basket::add);

        LocalDate date = LocalDate.now();
        basket.getProductList().stream().forEach(product -> {
            System.out.println("Product Price: " + product.getPrice());
            System.out.println("Product Availability: " + product.isAvailable(date));
        });

        basket.remove(products.get(0));
    }
}
