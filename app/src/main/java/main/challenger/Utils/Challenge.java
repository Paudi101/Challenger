package main.challenger.Utils;

public class Challenge {

    private String name, description;

    public Challenge(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Challenge() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Challenge{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
