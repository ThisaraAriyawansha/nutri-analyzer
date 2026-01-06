package patterns;

import java.util.ArrayList;
import java.util.List;

// Make this class PUBLIC
public class RecipeSubject {
    private List<RecipeObserver> observers = new ArrayList<>();
    
    public void addObserver(RecipeObserver observer) {
        observers.add(observer);
    }
    
    public void removeObserver(RecipeObserver observer) {
        observers.remove(observer);
    }
    
    public void notifyObservers(String message) {
        observers.forEach(observer -> observer.update(message));
    }
}

