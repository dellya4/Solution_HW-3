package Assignment3;

import java.util.ArrayList;
import java.util.List;

public class SimpleDungeonBuilderCombined implements IDungeonBuilderCombined{

    private String name;
    private String description;
    private List<RoomCombined> rooms = new ArrayList<>();

    @Override
    public IDungeonBuilderCombined setName(String name) { // Implementation of setting a name
        this.name = name;
        return this;
    }

    @Override
    public IDungeonBuilderCombined setDescription(String description) { // Implementation of setting a description
        this.description = description;
        return this;
    }

    @Override
    public IDungeonBuilderCombined addRoom(RoomCombined room) { // Implementation of adding a room
        rooms.add(room);
        return this;
    }

    @Override
    public DungeonCombined build() { // Implementation of creating a dungeon
        return (new DungeonCombined(name, description, rooms));
    }

}
