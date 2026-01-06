package patterns;

import model.Ingredient;
import model.Recipe;
import java.util.Arrays;
import java.util.List;

public class RecipeFactory {
    
    public enum RecipeType {
        VEGAN, NON_VEGAN, VEGETARIAN, KETO
    }
    
    public static Recipe createRecipe(RecipeType type, String name) {
        switch(type) {
            case VEGAN:
                return createVeganRecipe(name);
            case NON_VEGAN:
                return createNonVeganRecipe(name);
            case VEGETARIAN:
                return createVegetarianRecipe(name);
            case KETO:
                return createKetoRecipe(name);
            default:
                return new Recipe(name);
        }
    }
    
    private static Recipe createVeganRecipe(String name) {
        List<Ingredient> ingredients = Arrays.asList(
            new Ingredient("Lentils", "200g", 230, 18, 40, 0.8),
            new Ingredient("Spinach", "100g", 23, 2.9, 3.6, 0.4)
        );
        return new Recipe(name, ingredients, "Vegan", 30, "Easy");
    }
    
    private static Recipe createNonVeganRecipe(String name) {
        List<Ingredient> ingredients = Arrays.asList(
            new Ingredient("Chicken Breast", "300g", 330, 62, 0, 7),
            new Ingredient("Pasta", "250g", 875, 30, 175, 2.5)
        );
        return new Recipe(name, ingredients, "Non-Vegan", 25, "Medium");
    }
    
    private static Recipe createVegetarianRecipe(String name) {
        List<Ingredient> ingredients = Arrays.asList(
            new Ingredient("Cheese", "100g", 400, 25, 1.3, 33),
            new Ingredient("Eggs", "3 large", 210, 18, 1.5, 14)
        );
        return new Recipe(name, ingredients, "Vegetarian", 20, "Easy");
    }
    
    private static Recipe createKetoRecipe(String name) {
        List<Ingredient> ingredients = Arrays.asList(
            new Ingredient("Avocado", "200g", 320, 4, 17, 29),
            new Ingredient("Almonds", "50g", 290, 10, 9, 25)
        );
        return new Recipe(name, ingredients, "Keto", 15, "Easy");
    }
}