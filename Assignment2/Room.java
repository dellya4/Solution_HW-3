package Assignment2;

public class Room implements CloneableGameEntity{
    private String name;
    private String description;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public Room cloneEntity() { // Realized to cloned object
        return new Room(this.name, this.description);
    }

    public String toString() {
        return "Name: " + name + "\nDescription: " + description;
    }
}
