package behavioural_patterns.composite.box_of_products;

import java.util.List;

public class CompositeBox implements Box {

    private List<Box> boxes;

    public CompositeBox(List<Box> boxes) {
        this.boxes = boxes;
    }

    @Override
    public double calculatePrice() {
        double totalPrice = 0.0;
        for (Box box : this.boxes) {
            totalPrice += box.calculatePrice();
        }
        return totalPrice;
    }
}
