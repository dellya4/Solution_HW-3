package Assignment2;

public class NPC implements CloneableGameEntity{
    private String name;
    private String description;
    private int health;

    public NPC() {}

    public NPC(String name, String description, int health) {
        this.name = name;
        this.description = description;
        this.health = health;
    }

    @Override
    public NPC cloneEntity() { // Realized to cloned object
        return new NPC(this.name, this.description, this.health);
    }

    public String toString() {
        return "Name: " + name + "\nDescription: " + description + "\nHealth: " + health;
    }
}
