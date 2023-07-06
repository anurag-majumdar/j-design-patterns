package behavioural_patterns.state.Ex2;

import lombok.Data;

@Data
public class User {
    private String ssn;
    private String name;
    private String address;
    private Phone phone;

    public User(String ssn, String name, String address, Phone phone) {
        this.ssn = ssn;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public void lockPhone() {
        phone.lockPhone();
    }

    public void unlockPhone() {
        phone.unlockPhone();
    }

    public static void main(String[] args) {
        Phone onePlus = new Phone("14T", "OnePlus");
        User anurag = new User("1", "Anurag", "Cal", onePlus);

        anurag.unlockPhone();
        System.out.println(anurag.getPhone().getState().getClass().getSimpleName());
        anurag.unlockPhone();
        System.out.println(anurag.getPhone().getState().getClass().getSimpleName());
        anurag.lockPhone();
        System.out.println(anurag.getPhone().getState().getClass().getSimpleName());
    }
}
