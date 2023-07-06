package behavioural_patterns.strategy.Ex1.behaviours;

public class NoQuack implements QuackBehaviour {

    @Override
    public String quack() {
        return "Can't Quack!";
    }
}
