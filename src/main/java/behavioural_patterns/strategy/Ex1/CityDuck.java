package behavioural_patterns.strategy.Ex1;

import behavioural_patterns.strategy.Ex1.behaviours.FlyBehaviour;
import behavioural_patterns.strategy.Ex1.behaviours.QuackBehaviour;

public class CityDuck extends Duck {
    public CityDuck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
        super(flyBehaviour, quackBehaviour);
    }
}
