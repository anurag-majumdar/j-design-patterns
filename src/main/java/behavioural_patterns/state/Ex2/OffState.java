package behavioural_patterns.state.Ex2;

public class OffState implements PhoneState {
    @Override
    public String onHomeButton(Phone phone) {
        phone.setState(new LockedState());
        return "Screen is visible, Still locked.";
    }

    @Override
    public String onPowerButton(Phone phone) {
        phone.setState(new LockedState());
        return "Screen is visible, Still locked.";
    }
}
