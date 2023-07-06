package behavioural_patterns.composite.box_of_products;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Product implements Box {
    private String title;
    private double price;
}
