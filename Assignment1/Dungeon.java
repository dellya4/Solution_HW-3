package Assignment1;

import java.util.ArrayList;
import java.util.List;

public class Dungeon {

    private String name;
    private List<Room> rooms = new ArrayList<>();
    private List<NPC> npcs = new ArrayList<>();

    Dungeon() {}

    Dungeon (String name, List <Room> rooms, List <NPC> npcs) {
        this.name = name;
        this.rooms = rooms;
        this.npcs = npcs;
    }

    public String toString() {
        return "Name: " + name + "\nRooms: " + rooms + "\nNPC: " + npcs;
    }
}
