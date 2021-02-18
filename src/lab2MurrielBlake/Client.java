package lab2MurrielBlake;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        AbcInterface bub;
        List<Product>productItems = new ArrayList<>();
        Product item1 = new Product(1124,"Tomatoes",1.23);
        Product item2 = new Product(1114,"chips",4.99);
        Product item3 = new Product(1424,"yogurt",5.88);
        productItems.add(item1);
        productItems.add(item2);
        productItems.add(item3);
        bub = new SortingUtilityProxy();
        bub.sort(productItems,1);

        AbcInterface quick;
        List<Product>sortingItems = new ArrayList<>();
        Product I1 = new Product(1124,"Tomatoes",1.23);
        Product I2 = new Product(1114,"chips",4.99);
        Product I3 = new Product(1424,"yogurt",5.88);
        sortingItems.add(item1);
        sortingItems.add(item2);
        sortingItems.add(item3);
        quick = new SortingUtilityProxy();
        quick.sort(sortingItems,2);

    }
}
