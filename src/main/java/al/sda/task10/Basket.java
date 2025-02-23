package al.sda.task10;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private final List<Product> productList = new ArrayList<>();

    public void add(Product product){
        productList.add(product);
    }
    public void remove(Product product){
        productList.remove(product);
    }
    public List<Product>getProductList(){
        return new ArrayList<>(productList);
    }
}
