# Project: Implementation of Design Patterns for Dungeon

## Description
This project implements three tasks covering the **Builder** and **Prototype** design patterns for creating and managing dungeon (Dungeon), room (Room), and NPC objects.

---

## Task 1: Implementing a Builder for a Complex Object
### Description
This task implements a **Builder** to create a **Dungeon** object with step-by-step configuration.

### Files:
- `IDungeonBuilder.java` - builder interface.
- `SimpleDungeonBuilder.java` - builder implementation.
- `Dungeon.java` - main dungeon class.
- `MUDBuilderDemo.java` - demonstration of the builder in action.

### Functionality:
- Creating a dungeon with a name, rooms, and NPCs.
- Configuration methods: `setDungeonName(String name)`, `addRoom(Room room)`, `addNPC(NPC npc)`.
- `build()` method to obtain the final **Dungeon** object.

---

## Task 2: Implementing Prototype for Cloning Objects
### Description
The **Prototype** pattern is implemented for cloning entities (e.g., **Room** and **NPC**).

### Files:
- `CloneableGameEntity.java` - interface for cloning.
- `Room.java` and `NPC.java` - classes with `cloneEntity()` method for cloning.
- `MUDPrototypeDemo.java` - demonstration of cloning.

### Functionality:
- Implementation of the `cloneEntity()` method.
- Cloning objects and modifying clones.

---

## Task 3: Combining Builder and Prototype
### Description
Combines **Builder** and **Prototype**: creates a dungeon with the ability to clone rooms.

### Files:
- `IDungeonBuilderCombined.java` - builder interface.
- `SimpleDungeonBuilderCombined.java` - builder implementation.
- `DungeonCombined.java` - main dungeon class.
- `CloneableRoom` - interface for cloning.
- `RoomCombined` - class with `cloneEntity()` method for cloning.
- `MUDCombinedDemo.java` - demonstration of the combined solution.

### Functionality:
- Creating a dungeon using **Builder**.
- Using **Prototype** to clone rooms.
- Modifying clones (adding "Clone #" to the name).

---

## Author
Second-year student: [Abdrakhmanova Adel]

