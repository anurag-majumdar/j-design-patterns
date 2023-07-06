package low_level_design.vending_machine;

import lombok.Data;
import low_level_design.vending_machine.payment_service.PaymentService;
import low_level_design.vending_machine.product_service.Product;
import low_level_design.vending_machine.product_service.ProductService;

import java.util.Objects;

@Data
public class VendingMachine {
    private PaymentService paymentService;
    private ProductService productService;

    public void displayProducts() {
        productService.getProducts().forEach(System.out::println);
    }

    public void inputAmount(int amount) {
        paymentService.setInputAmount(amount);
    }

    public void inputProductCode(int code) {
        productService.setProductCodeInput(code);
    }

    public void operateMachine() throws Exception {
        Product product = Objects.requireNonNull(productService.searchProduct(), "Product does not exist, please enter proper code!");
        paymentService.setSelectedProduct(product);
        int change = paymentService.dispenseChange();
        productService.removeProduct();

        System.out.println("Your change: " + change);
        System.out.println("Here's your product: " + product);
        System.out.println("Thank you, please come again!");
    }
}
