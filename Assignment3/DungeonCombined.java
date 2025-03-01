package Assignment3;

import java.util.ArrayList;
import java.util.List;

public class DungeonCombined implements CloneableRoom{

    private String name;
    private String description;
    private List<RoomCombined> rooms = new ArrayList<>();

    public DungeonCombined() {}
    public DungeonCombined(String name, String description, List<RoomCombined> rooms) {
        this.name = name;
        this.description = description;
        this.rooms = rooms;
    }

    public DungeonCombined addRoom(RoomCombined room) { // Add room which we clone
        rooms.add(room);
        return this;
    }

    @Override
    public DungeonCombined cloneObject() {
        return new DungeonCombined(name, description, rooms);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Name: " + name + "\nDescription: " + description + "\nRooms: " + rooms;
    }
}
