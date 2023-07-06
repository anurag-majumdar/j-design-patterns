package behavioural_patterns.state.Ex2;

import lombok.Data;

@Data
public class Phone {
    private String name;
    private String brand;
    private PhoneState state;

    public Phone(String name, String brand) {
        this.name = name;
        this.brand = brand;
        this.state = new OffState();
    }

    public void lockPhone() {
        this.state.onPowerButton(this);
    }

    public void unlockPhone() {
        this.state.onHomeButton(this);
    }
}
