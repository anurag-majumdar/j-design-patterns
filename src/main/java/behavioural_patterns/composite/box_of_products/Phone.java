package behavioural_patterns.composite.box_of_products;

public class Phone extends Product {

    public Phone(String title, double price) {
        super(title, price);
    }

    @Override
    public double calculatePrice() {
        return this.getPrice();
    }
}
