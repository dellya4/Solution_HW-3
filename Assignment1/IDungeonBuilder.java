package Assignment1;

public interface IDungeonBuilder { // Interface for building
    IDungeonBuilder setName(String name); //Add name to dungeon
    IDungeonBuilder addRoom(Room room); //Add room to dungeon
    IDungeonBuilder addNPC(NPC npc); //Add NPC to dungeon
    Dungeon build(); //Create dungeon
}
