public class Product {
    private final String name;
    private final double price;
    private final int amount;   // kan final omdat hij nergens wordt aangepast

    public Product(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }
}

