package lab2MurrielBlake;

public class Product {
    private int ID;
    private String Name;
    private double price;


    Product()
    {
        ID = 0;
        Name = "";
        price = 0;
    }
    Product(int ID,String Name, double price)
    {
        this.ID = ID;
        this.Name = Name;
        this.price = price;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getID() {
        return ID;
    }
}
