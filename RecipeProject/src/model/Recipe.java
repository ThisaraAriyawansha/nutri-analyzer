package model;

import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private String name;
    private List<Ingredient> ingredients;
    private String category;
    private int cookingTime;
    private String difficulty;
    
    public Recipe(String name, List<Ingredient> ingredients, String category, int cookingTime, String difficulty) {
        this.name = name;
        this.ingredients = ingredients;
        this.category = category;
        this.cookingTime = cookingTime;
        this.difficulty = difficulty;
    }
    
    public Recipe(String name) {
        this.name = name;
        this.ingredients = new ArrayList<>();
        this.category = "Unknown";
        this.cookingTime = 0;
        this.difficulty = "Easy";
    }
    
    public String getName() { return name; }
    public List<Ingredient> getIngredients() { return ingredients; }
    public String getCategory() { return category; }
    public int getCookingTime() { return cookingTime; }
    public String getDifficulty() { return difficulty; }
    
    public int calculateTotalCalories() {
        int total = 0;
        for (Ingredient ing : ingredients) {
            total += ing.getCalories();
        }
        return total;
    }
    
    public String getHealthRating() {
        int calories = calculateTotalCalories();
        if (calories < 300) return "⭐⭐⭐⭐⭐";
        else if (calories < 500) return "⭐⭐⭐⭐";
        else if (calories < 800) return "⭐⭐⭐";
        else return "⭐⭐";
    }
    
    @Override
    public String toString() {
        return String.format("%s (%s) - %d calories %s", 
            name, category, calculateTotalCalories(), getHealthRating());
    }
}