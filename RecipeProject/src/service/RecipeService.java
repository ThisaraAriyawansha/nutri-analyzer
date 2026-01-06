package service;

import model.*;
import patterns.*;
import functional.RecipeStreamProcessor;
import java.util.*;

public class RecipeService {
    private List<Recipe> recipes;
    private RecipeStreamProcessor streamProcessor;
    
    public RecipeService() {
        this.recipes = new ArrayList<>();
        this.streamProcessor = new RecipeStreamProcessor();
        initializeSampleData();
    }
    
    private void initializeSampleData() {
        // Using Factory Pattern
        recipes.add(RecipeFactory.createRecipe(
            RecipeFactory.RecipeType.VEGAN, "Vegan Lentil Curry"));
        
        recipes.add(RecipeFactory.createRecipe(
            RecipeFactory.RecipeType.NON_VEGAN, "Chicken Alfredo"));
        
        recipes.add(RecipeFactory.createRecipe(
            RecipeFactory.RecipeType.VEGETARIAN, "Cheese Omelette"));
        
        recipes.add(RecipeFactory.createRecipe(
            RecipeFactory.RecipeType.KETO, "Keto Avocado Salad"));
    }
    
    public List<Recipe> getRecipes() {
        return recipes;
    }
    
    public void demonstrateAllFeatures() {
        System.out.println("=== RECIPE ANALYZER ===\n");
        
        // 1. Show all recipes
        System.out.println("1. ALL RECIPES:");
        recipes.forEach(r -> System.out.println("  - " + r));
        
        // 2. Functional Programming: Filter
        System.out.println("\n2. LOW CALORIE RECIPES (<400 calories):");
        List<Recipe> lowCal = streamProcessor.filterLowCalorieRecipes(recipes, 400);
        if (lowCal.isEmpty()) {
            System.out.println("  No recipes under 400 calories");
        } else {
            lowCal.forEach(r -> System.out.println("  - " + r));
        }
        
        // 3. Observer Pattern
        System.out.println("\n3. OBSERVER PATTERN DEMO:");
        RecipeAnalyzerSubject analyzer = new RecipeAnalyzerSubject();
        analyzer.addObserver(msg -> System.out.println("  [Observer] " + msg));
        analyzer.analyzeRecipe("Sample Recipe");
        
        // 4. Adapter Pattern
        System.out.println("\n4. ADAPTER PATTERN DEMO:");
        NutritionAdapter adapter = new ExternalNutritionAdapter();
        NutritionInfo info = adapter.adapt("chicken");
        System.out.println("  Chicken nutrition via adapter: " + 
            info.getCalories() + " calories");
        
        // 5. Statistics
        System.out.println("\n5. STATISTICS:");
        System.out.printf("  Average calories: %.1f%n", 
            streamProcessor.averageCalories(recipes));
        System.out.println("  All ingredients: " + 
            streamProcessor.getAllIngredientNames(recipes));
    }
}