package behavioural_patterns.strategy.Ex1.behaviours;

public class SimpleQuack implements QuackBehaviour {
    @Override
    public String quack() {
        return "Simply Quack!";
    }
}
