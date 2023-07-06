import api_calls.Github;
import api_calls.models.Contributor;
import behavioural_patterns.strategy.Ex1.CityDuck;
import behavioural_patterns.strategy.Ex1.RubberDuck;
import behavioural_patterns.strategy.Ex1.behaviours.*;
import behavioural_patterns.strategy.Ex2.NotificationService;
import behavioural_patterns.strategy.Ex2.services.ApiClient;
import behavioural_patterns.template_method.Ex1.JApp;
import creational_patterns.builder.Maze.MazeBuilder;
import creational_patterns.builder.Person.PersonBuilder;
import feign.Feign;
import feign.gson.GsonDecoder;

import java.util.List;

public class Driver {

    public static void main(String[] args) {

        // feignAPI();
        // builderPattern();
        // strategyPattern();
        // NotificationServiceDriver();
        templateMethodPattern();
    }

    public static void feignAPI() {
        Github github = Feign.builder()
                .decoder(new GsonDecoder())
                .target(Github.class, "https://api.github.com");

        // Fetch and print a list of the contributors to this library.
        List<Contributor> contributors = github.contributors("OpenFeign", "feign");
        for (Contributor contributor : contributors) {
            System.out.println(contributor.login + " (" + contributor.contributions + ")");
        }
    }

    public static void builderPattern() {
        var person = PersonBuilder.builder().name("Anurag").age(30).email("an.mostwanted").build();

        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getEmail());

        var maze = MazeBuilder.builder().doors(2).walls(2).build();

        System.out.println(maze.getDoors());
        System.out.println(maze.getWalls());
    }

    public static void strategyPattern() {
        RubberDuck rubberDuck = new RubberDuck(new NoFly(), new SimpleQuack(), new ExtraWild());

        CityDuck cityDuck = new CityDuck(new SimpleFly(), new NoQuack());

        String rubberDuckBehaviours = "Rubber duck: " + rubberDuck.fly() + " " + rubberDuck.quack() + " " + rubberDuck.wild();
        System.out.println(rubberDuckBehaviours);

        String cityDuckBehaviours = "City duck: " + cityDuck.fly() + " " + cityDuck.quack();
        System.out.println(cityDuckBehaviours);
    }

    public static void NotificationServiceDriver() {
        // Handle implementation
        ApiClient apiClient = new ApiClient();
        NotificationService notificationService = new NotificationService(apiClient);

        System.out.println(notificationService.getStatus("1"));
    }

    public static void templateMethodPattern() {
        JApp jApp = new JApp();
        jApp.execute();
    }
}
