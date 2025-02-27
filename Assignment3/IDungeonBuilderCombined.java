package Assignment3;

public interface IDungeonBuilderCombined {

    IDungeonBuilderCombined setName(String name); // Set name to dungeon
    IDungeonBuilderCombined setDescription(String description); // Set description to dungeon
    IDungeonBuilderCombined addRoom(RoomCombined room); // Add room to dungeon
    DungeonCombined build(); // Create dungeon

}
