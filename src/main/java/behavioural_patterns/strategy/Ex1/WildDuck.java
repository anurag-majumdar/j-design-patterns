package behavioural_patterns.strategy.Ex1;

import behavioural_patterns.strategy.Ex1.behaviours.FlyBehaviour;
import behavioural_patterns.strategy.Ex1.behaviours.QuackBehaviour;
import behavioural_patterns.strategy.Ex1.behaviours.WildBehaviour;

public class WildDuck extends Duck {
    private WildBehaviour wildBehaviour;

    public WildDuck(
            FlyBehaviour flyBehaviour,
            QuackBehaviour quackBehaviour,
            WildBehaviour wildBehaviour
    ) {
        super(flyBehaviour, quackBehaviour);
        this.wildBehaviour = wildBehaviour;
    }

    public String wild() {
        return this.wildBehaviour.wild();
    }
}
