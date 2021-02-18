package lab2MurrielBlake;

import java.util.List;

public class SortingUtilityProxy implements AbcInterface {

    private AbcInterface serviceObj;

    SortingUtilityProxy() {

    }

    @Override
    public List<Product> sort(List<Product> products, int sortingApproach) {
        serviceObj = new SortingUtilityService();
        serviceObj.sort(products,sortingApproach);
        if (sortingApproach == 1) {
            for (Product p : products){
                System.out.println("Product ID: " + p.getID() + " Product Name: " + p.getName() + " Product Price: " + p.getPrice());
            }
            return products;
        }
        else if (sortingApproach == 2) {
            for (Product p : products) {
                System.out.println("Product ID: " + p.getID() + " Product Name: " + p.getName() + " Product Price: " + p.getPrice());
            }
            return products;
            }
        return null;
    } //end of funct

}

