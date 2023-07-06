package low_level_design.vending_machine.product_service;

import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class ProductService {
    private List<Product> products;
    private int productCodeInput;

    public ProductService(List<Product> products) {
        this.products = products;
    }

    public Product searchProduct() {
        return products.stream().filter(p -> p.getCode() == productCodeInput).collect(Collectors.toList()).get(0);
    }

    public void removeProduct() {
        products = products.stream().filter(p -> p.getCode() != productCodeInput).collect(Collectors.toList());
    }
}
