package Assignment3;

import java.util.ArrayList;
import java.util.List;

public class DungeonCombined {

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

    public String toString() {
        return "Name: " + name + "\nDescription: " + description + "\nRooms: " + rooms;
    }
}
