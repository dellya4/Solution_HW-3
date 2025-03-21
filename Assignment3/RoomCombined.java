package Assignment3;

public class RoomCombined implements CloneableRoom {
    private String name;
    private String description;

    RoomCombined() {}

    public RoomCombined(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public RoomCombined cloneObject() { // Realized to cloned object
        return new RoomCombined(name, description);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) { // Set name to clones
        this.name = name;
    }

    public String toString() {
        return "\nName: " + name + "\nDescription: " + description;
    }
}
