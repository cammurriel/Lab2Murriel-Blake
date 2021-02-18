package lab2MurrielBlake;

import java.util.List;

public class SortingUtilityService implements AbcInterface{
    AbcInterface prod;

    List<Product>products;



    private void bubbleSort(List<Product>products) {

        for(int i = 0; i <products.size(); i++)
        {
            for(int j = 0; j < products.size() - i -1; j++)
            {
                if(products.get(j).getID() > products.get(j+1).getID())
                {
                    Product t1 = products.get(j);
                    products.set(j, products.get(j + 1));
                    products.set(j+1,t1);
                }
            }
        }

            }
            private void quickSort(List<Product>products, int low, int high)
            {
                if (low < high)
                {

                }
            }


    @Override
    public List<Product> sort(List <Product> products, int sortingApproach) {
        if (sortingApproach == 1)
        {
            bubbleSort(products);
        }
        else if(sortingApproach == 2)
        {
            quickSort(products);
        }

        return products;
    }
}

