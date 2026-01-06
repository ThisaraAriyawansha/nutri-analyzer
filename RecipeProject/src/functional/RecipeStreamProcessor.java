package functional;

import model.Recipe;
import model.Ingredient;
import java.util.*;
import java.util.stream.Collectors;

public class RecipeStreamProcessor {
    
    public List<Recipe> filterLowCalorieRecipes(List<Recipe> recipes, int maxCalories) {
        return recipes.stream()
            .filter(recipe -> recipe.calculateTotalCalories() < maxCalories)
            .collect(Collectors.toList());
    }
    
    public List<String> getAllIngredientNames(List<Recipe> recipes) {
        return recipes.stream()
            .flatMap(recipe -> recipe.getIngredients().stream())
            .map(Ingredient::getName)
            .distinct()
            .sorted()
            .collect(Collectors.toList());
    }
    
    public double averageCalories(List<Recipe> recipes) {
        return recipes.stream()
            .mapToInt(Recipe::calculateTotalCalories)
            .average()
            .orElse(0.0);
    }
    
    public List<String> getRecipeNames(List<Recipe> recipes) {
        return recipes.stream()
            .map(Recipe::getName)
            .collect(Collectors.toList());
    }
    
    @FunctionalInterface
    public interface RecipeFilter {
        boolean test(Recipe recipe);
    }
}