package behavioural_patterns.strategy.Ex1.behaviours;

public class NoFly implements FlyBehaviour {
    @Override
    public String fly() {
        return "Can't Fly!";
    }
}
