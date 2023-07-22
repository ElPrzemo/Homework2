package company.products;

public class Product {
    private String name;
    private double price;
    private PRODUCT_TYPE type;




    public Product(String name, double price, PRODUCT_TYPE type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public PRODUCT_TYPE getType() {
        return type;
    }

    public void setType(PRODUCT_TYPE type) {
        this.type = type;
    }
}
