package low_level_design.vending_machine.payment_service;

import lombok.Data;
import low_level_design.vending_machine.product_service.Product;

@Data
public class PaymentService {
    private Product selectedProduct;
    private int inputAmount;

    public int dispenseChange() throws Exception {
        int productPrice = selectedProduct.getPrice();
        if (inputAmount == productPrice) {
            return 0;
        }

        if (inputAmount > productPrice) {
            return inputAmount - productPrice;
        } else {
            throw new Exception("Insufficient amount entered, Please enter: " + (productPrice - inputAmount) + " more!");
        }
    }
}
