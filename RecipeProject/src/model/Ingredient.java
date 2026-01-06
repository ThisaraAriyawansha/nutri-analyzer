package model;

public class Ingredient {
    private String name;
    private String quantity;
    private int calories;
    private double protein;
    private double carbs;
    private double fat;
    
    public Ingredient(String name, String quantity, int calories, double protein, double carbs, double fat) {
        this.name = name;
        this.quantity = quantity;
        this.calories = calories;
        this.protein = protein;
        this.carbs = carbs;
        this.fat = fat;
    }
    
    public String getName() { return name; }
    public String getQuantity() { return quantity; }
    public int getCalories() { return calories; }
    public double getProtein() { return protein; }
    public double getCarbs() { return carbs; }
    public double getFat() { return fat; }
    
    @Override
    public String toString() {
        return String.format("%s (%s): %d kcal", name, quantity, calories);
    }
}