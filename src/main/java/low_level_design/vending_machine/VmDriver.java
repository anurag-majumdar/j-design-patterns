package low_level_design.vending_machine;

import low_level_design.vending_machine.payment_service.PaymentService;
import low_level_design.vending_machine.product_service.Product;
import low_level_design.vending_machine.product_service.ProductService;

import java.util.List;

public class VmDriver {
    public static void main(String[] args) throws Exception {
        PaymentService paymentService = new PaymentService();
        ProductService productService = new ProductService(
                List.of(
                        new Product(1, "Coke", 101, 30),
                        new Product(2, "Dal", 102, 10),
                        new Product(3, "Bhujiya", 103, 15),
                        new Product(4, "Hide & Seek", 104, 10),
                        new Product(5, "Minute Maid", 105, 35),
                        new Product(6, "Snickers", 106, 60)
                )
        );

        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.setPaymentService(paymentService);
        vendingMachine.setProductService(productService);

        User user = new User("1", "Anurag", vendingMachine);

        VendingMachine vmAnurag = user.getVendingMachine();

        System.out.println("Displaying Products before operation: ");
        vmAnurag.displayProducts();

        int amount = 40;
        int productCode = 101;

        System.out.println("Entering amount: " + amount);
        vmAnurag.inputAmount(amount);

        System.out.println("Entering product code: " + productCode);
        vmAnurag.inputProductCode(productCode);
        vmAnurag.operateMachine();

        System.out.println("Displaying Products after operation: ");
        vmAnurag.displayProducts();
    }
}
