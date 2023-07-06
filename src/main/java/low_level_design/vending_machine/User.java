package low_level_design.vending_machine;

import lombok.Data;

@Data
public class User {
    private String ssn;
    private String name;
    private VendingMachine vendingMachine;

    public User(String ssn, String name, VendingMachine vendingMachine) {
        this.ssn = ssn;
        this.name = name;
        this.vendingMachine = vendingMachine;
    }

    public void inputAmount(int amount) {
        vendingMachine.inputAmount(amount);
    }

    public void inputProductCode(int code) {
        vendingMachine.inputProductCode(code);
    }

    public void start() throws Exception {
        vendingMachine.operateMachine();
    }
}
