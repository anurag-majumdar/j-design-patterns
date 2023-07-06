package behavioural_patterns.state.Ex2;

/**
 * Consists of action methods that determine next state.
 */
public interface PhoneState {
    default String onHomeButton(Phone phone) {
        return "No Implementation";
    }

    default String onPowerButton(Phone phone) {
        return "No Implementation";
    }
}
