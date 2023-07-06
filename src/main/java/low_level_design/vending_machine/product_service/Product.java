package low_level_design.vending_machine.product_service;

import lombok.Data;

@Data
public class Product {
    private int id;
    private String name;
    private int code;
    private int price;

    public Product(int id, String name, int code, int price) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.price = price;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code=" + code +
                ", price=" + price +
                '}';
    }
}
