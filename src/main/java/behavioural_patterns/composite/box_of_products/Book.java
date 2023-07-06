package behavioural_patterns.composite.box_of_products;

public class Book extends Product {

    public Book(String title, double price) {
        super(title, price);
    }

    @Override
    public double calculatePrice() {
        return this.getPrice();
    }
}
