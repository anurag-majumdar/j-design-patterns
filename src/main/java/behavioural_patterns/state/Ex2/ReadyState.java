package behavioural_patterns.state.Ex2;

public class ReadyState implements PhoneState {
    @Override
    public String onPowerButton(Phone phone) {
        phone.setState(new OffState());
        return "I'm now off!";
    }
}
