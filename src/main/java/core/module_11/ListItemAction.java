package src.main.java.core.module_11;

// Just as an example
@FunctionalInterface
public interface ListItemAction<T> {
    public boolean itemAction(T item, int index);
}
