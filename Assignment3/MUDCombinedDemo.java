package Assignment3;

public class MUDCombinedDemo {
    public static void main(String[] args) {
        DungeonCombined dungeon =new SimpleDungeonBuilderCombined() // Create empty dungeon
                .setName("Labyrinth of Shadows") // Set a name
                .setDescription("An ancient dungeon filled with traps and whispers of the past.") // Set a description
                .addRoom(new RoomCombined(" Hall of Forgotten Magic", // Add a room
                        "A dark shrine where runes flicker with faint light."))
                .build(); // Create full dungeon
        System.out.println("Dungeon without clonning: \n" + dungeon);
        System.out.println();

        RoomCombined original = new RoomCombined("Buried Hall", // Original room
                "A collapsed chamber filled with bones and rubble.");
        dungeon.addRoom(original);
        for (int i = 1; i < 3; i++) {
            RoomCombined clone = (RoomCombined) original.cloneRoom(); // Cloned room
            clone.setName("Clone " + i); // Change name
            dungeon.addRoom(clone); // Add cloned room to dungeon
        }
        System.out.println("Dungeon with cloning: \n" + dungeon);
    }
}
