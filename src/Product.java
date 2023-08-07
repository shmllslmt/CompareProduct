public class Product implements Comparable {
    private String name;
    private double price;
    protected Product() {
        this("X", 0.00);
    }
    protected Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Object o) {
        if(price > ((Product)o).price)
            return 1;
        else if (price < ((Product)o).price) {
            return -1;
        } else
            return 0;
    }
}
