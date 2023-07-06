package creational_patterns.builder;

public class Person {
    private final String name;
    private final int age;
    private final String email;
    private final String address;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public Person(PersonBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
        this.address = builder.address;
    }

    public static class PersonBuilder {
        private String name;
        private int age;
        private String email;
        private String address;

        private PersonBuilder() {}

        public static PersonBuilder builder() {
            return new PersonBuilder();
        }

        public PersonBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder age(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder email(String email) {
            this.email = email;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
