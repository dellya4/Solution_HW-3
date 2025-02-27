package Assignment2;

public class MUDPrototypeDemo {
    public static void main(String[] args) {
        Room originalRoom = new Room("Dark red room", "A dark cell with flickering runes");
        Room clonedRoom = originalRoom.cloneEntity(); // Cloned a room

        NPC originalNPC = new NPC("Morgart", "The Cursed Mage", 100);
        NPC clonedNPC = originalNPC.cloneEntity(); // Cloned a NPC

        System.out.println("Rooms:");
        System.out.println("Original\n" + originalRoom);
        System.out.println("Cloned\n" + clonedRoom);
        System.out.println();
        System.out.println("NPCs:");
        System.out.println("Original\n" + originalNPC);
        System.out.println("Cloned\n" + clonedNPC);
    }
}
