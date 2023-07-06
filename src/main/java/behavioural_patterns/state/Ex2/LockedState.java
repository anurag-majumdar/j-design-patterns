package behavioural_patterns.state.Ex2;

public class LockedState implements PhoneState {
    @Override
    public String onHomeButton(Phone phone) {
        phone.setState(new ReadyState());
        return "Ready to use phone.";
    }

    @Override
    public String onPowerButton(Phone phone) {
        phone.setState(new OffState());
        return "Locked phone.";
    }
}
