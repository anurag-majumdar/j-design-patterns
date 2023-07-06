package behavioural_patterns.strategy.Ex1;

import behavioural_patterns.strategy.Ex1.behaviours.FlyBehaviour;
import behavioural_patterns.strategy.Ex1.behaviours.QuackBehaviour;

public class Duck {
    private FlyBehaviour flyBehaviour;
    private QuackBehaviour quackBehaviour;

    public Duck(
            FlyBehaviour flyBehaviour,
            QuackBehaviour quackBehaviour
    ) {
        this.flyBehaviour = flyBehaviour;
        this.quackBehaviour = quackBehaviour;
    }

    public String quack() {
        return this.quackBehaviour.quack();
    }

    public String display() {
        return "Duck display";
    }

    public String fly() {
        return this.flyBehaviour.fly();
    }

}
