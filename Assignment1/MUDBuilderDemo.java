package Assignment1;

public class MUDBuilderDemo {
    public static void main(String[] args) {
        Dungeon dungeon = new SimpleDungeonBuilder() // Create empty dungeon
                .setName("Abandoned Catacombs") // Set a name
                .addRoom(new Room("A dusty chamber with ancient inscriptions on the walls")) // Add a room
                .addNPC(new NPC("Shadow Guardian")) // Add a NPC
                .build(); // Create full dungeon

        System.out.println(dungeon);
    }
}
