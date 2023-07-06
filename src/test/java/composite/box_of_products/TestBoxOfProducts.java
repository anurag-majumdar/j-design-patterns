package composite.box_of_products;

import behavioural_patterns.composite.box_of_products.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TestBoxOfProducts {
    @Test
    public void testBoxOfProducts() {
        Book gof = new Book("GOF", 1020);
        Phone onePlus10T = new Phone("One Plus 10T", 30000);
        Phone iPhone14Pro = new Phone("iPhone 14 Pro", 130000);

        CompositeBox compositeBoxOfProducts1 = new CompositeBox(List.of(gof, onePlus10T, iPhone14Pro));
        CompositeBox compositeBoxOfProducts2 = new CompositeBox(List.of(gof, onePlus10T, iPhone14Pro));

        CompositeBox rootCompositeBox = new CompositeBox(List.of(compositeBoxOfProducts1, compositeBoxOfProducts2));

        double totalPrice = rootCompositeBox.calculatePrice();
        System.out.println("Total Price of the box of items: " + totalPrice);

        Assertions.assertInstanceOf(Product.class, gof);
        Assertions.assertInstanceOf(Product.class, onePlus10T);
    }
}
