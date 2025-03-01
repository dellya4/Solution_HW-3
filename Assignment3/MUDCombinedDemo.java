package Assignment3;

public class MUDCombinedDemo {
    public static void main(String[] args) {
        RoomCombined original = new RoomCombined("Buried Hall", // Create original room
                "A collapsed chamber filled with bones and rubble.");
        IDungeonBuilderCombined builder = new SimpleDungeonBuilderCombined() // Create builder for dungeon
                .setName("Labyrinth of Shadows") // Set a name
                .setDescription("An ancient dungeon filled with traps and whispers of the past.") // Set a description
                .addRoom(original);

        for (int i = 1; i < 3; i++) {
            RoomCombined clone = original.cloneObject(); // Cloned room
            clone.setName("Clone " + i); // Change name
            builder.addRoom(clone); // Add cloned room to dungeon
        }
        DungeonCombined dungeon = builder.build(); // Create full dungeon
        System.out.println("Dungeon with cloning: \n" + dungeon);
        System.out.println();

        DungeonCombined cloneDungeon = dungeon.cloneObject(); // Cloning dungeon
        cloneDungeon.setName("Cloning dungeon");
        System.out.println(cloneDungeon);
    }
}
