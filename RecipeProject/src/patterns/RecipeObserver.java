package patterns;

@FunctionalInterface
public interface RecipeObserver {
    void update(String message);
}