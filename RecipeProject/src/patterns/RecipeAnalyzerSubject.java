package patterns;

public class RecipeAnalyzerSubject extends RecipeSubject {
    public void analyzeRecipe(String recipeName) {
        System.out.println("Analyzing recipe: " + recipeName);
        notifyObservers("Analysis started for: " + recipeName);
        
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        notifyObservers("Analysis completed for: " + recipeName);
    }
}