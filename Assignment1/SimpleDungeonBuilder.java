package Assignment1;

import java.util.ArrayList;
import java.util.List;

public class SimpleDungeonBuilder implements IDungeonBuilder{
    private String name;
    private List<Room> rooms = new ArrayList<>();
    private List<NPC> npcs = new ArrayList<>(); ;

    @Override
    public IDungeonBuilder setName(String name) { // Implementation of setting a name
        this.name = name;
        return this;
    }

    @Override
    public IDungeonBuilder addRoom(Room room) { // Implementation of adding a room
        rooms.add(room);
        return this;
    }

    @Override
    public IDungeonBuilder addNPC(NPC npc) { // Implementation of adding a npc
        npcs.add(npc);
        return this;
    }

    @Override
    public Dungeon build() { // Implementation of creating dungeon
        return new Dungeon(name, rooms, npcs);
    }
}
