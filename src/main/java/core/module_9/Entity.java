package src.main.java.core.module_9;

import java.util.Objects;

public class Entity {
    private static int count = 0;
    private final int id;

    public Entity() {
        this.id = Entity.count + 1;
        Entity.count++;
    }

    public Entity(int id) {
        this.id = id;
        Entity.count++;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "{id: " + id + "}";
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        Entity entity = (Entity) obj;
        return entity.id == id;
    }
}
